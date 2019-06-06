package com.bbb.automation.stepdefs;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import com.bbb.automation.utils.CassandraConnector;
import com.bbb.automation.utils.Context;
import com.bbb.automation.utils.CookieManager;
import com.bbb.automation.utils.EnvConfig;
import com.bbb.automation.utils.LocatorConfig;
import com.bbb.automation.utils.OmnitureUtils;
import com.bbb.automation.utils.ResponsiveLocatorConfig;
import com.bbb.automation.utils.Selenium_Functions;
import com.bbb.responsive.automation.pages.LogoutUserRestAPIPage;
import com.google.inject.Inject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    public static WebDriver rawdriver;
    public static WebDriver driver;
    public static Logger logger;
    private final Context context;
    private Scenario scenario;
    private LogoutUserRestAPIPage logoutUserRestApiPage;
    public static CassandraConnector client;
    private final CookieManager cookieManager;

    @Inject
    public Hooks(Context context, CookieManager cookieManager,
	    LogoutUserRestAPIPage logoutUserRestApiPage) {
	this.context = context;
	this.cookieManager = cookieManager;
	this.logoutUserRestApiPage = logoutUserRestApiPage;
    }

    @Before
    public void before(Scenario scenario) {
	this.scenario = scenario;
    }

    @Before
    public void setup() throws Throwable {

	// ********** Logger

	/*
	 * logger = Logger.getLogger(this.getClass());
	 * 
	 * System.out.println("File  Path" + new File("").getAbsolutePath());
	 * String filePath = (new File("").getAbsolutePath()) +
	 * "/bin/log.properties";
	 * 
	 * System.out.println(filePath);
	 * 
	 * PropertyConfigurator.configure(filePath);
	 */

	// **************

	/*
	 * System.out.println("Copying feature files..."); File srcDir = new
	 * File("src/test/resources/features"); File destDir = new File(".");
	 * FileUtils.copyDirectory(srcDir, destDir);
	 * System.out.println("Feature files copied");
	 */
	EnvConfig.getEnvironmentData();

	/*
	 * Robot robot = new Robot(); robot.mouseMove(0, 1000);
	 */

	EnvConfig.getTestData();
	LocatorConfig.getLocatorData();
	ResponsiveLocatorConfig.getLocatorData();
	// CreativeUtils.LoadCreativeTestData();
	// CreativeUtils.LoadCreativeLocator();
	System.out.println("Test data loaded");

	if (EnvConfig.Omniture.equalsIgnoreCase("yes")) {
	    OmnitureUtils.StopServer();
	    OmnitureUtils.DeleteFile("C:\\Apache24\\logs\\access.log");
	    OmnitureUtils.StartServer();
	}

	if (EnvConfig.Browser == null) {
	    System.out.println("No browser, only API testing required");
	    // client = new CassandraConnector();
	    // client.connect(EnvConfig.ipAddress, EnvConfig.port);
	} else {
	    try {
		driver = Selenium_Functions.Launch_Driver(scenario, rawdriver);
		Selenium_Functions.Launch_Website(driver, EnvConfig.urlSite);

		if (driver == null) {

		    System.out.println("Relaunching the Browser");
		    driver = Selenium_Functions.Launch_Driver(scenario,
			    rawdriver);
		    Selenium_Functions
			    .Launch_Website(driver, EnvConfig.urlSite);
		} else {
		    System.out.println("Driver Value if not relaunch: "
			    + driver);
		}
	    } catch (Exception e) {

		System.out.println("Not able to Open the Browser ");
		System.out.println("***********Exception Below************ ");
		System.out.println(e.getStackTrace());
		throw new IllegalStateException("Browser Not Launched"
			+ e.getMessage());

	    }
	}
	System.out.println("OK");
	/*
	 * homePage.closeConnectWithUsPopUpIfPresent(driver);
	 * homePage.selectShipToUSAnapolis(driver);
	 */
    }

    @After(order = 10)
    public void embedScreenshot(Scenario scenario) throws Throwable {
	if (EnvConfig.Browser != null) {

	    if (scenario.isFailed()) {
		try {
		    /*
		     * byte[] screenshot = ((TakesScreenshot) driver)
		     * .getScreenshotAs(OutputType.BYTES);
		     * scenario.embed(screenshot, "image/png"); //
		     * scenario.write("");
		     */

		    final Screenshot screenshot = new AShot().shootingStrategy(
			    ShootingStrategies.viewportPasting(100))
			    .takeScreenshot(driver);
		    final BufferedImage image = screenshot.getImage();
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    ImageIO.write(image, "PNG", baos);
		    baos.flush();
		    byte[] imageInByte = baos.toByteArray();
		    baos.close();
		    scenario.embed(imageInByte, "image/png");
		    String viewport = driver.manage().window().getSize()
			    .toString();
		    org.openqa.selenium.remote.SessionId sessionId = ((org.openqa.selenium.remote.RemoteWebDriver) driver)
			    .getSessionId();
		    String server[] = com.bbb.automation.acceptancetests.GridInfoExtracter
			    .getHostNameAndPort("localhost", 4444, sessionId);
		    String text = "";
		    System.out.println("Server is " + server[0]);

		    if (!(context.getSearchedprodtype() == null)) {
			text = "Scenario ["
				+ scenario.getName()
				+ "] failed for session with JSESSIONID ["
				+ cookieManager.getCookieValueByName(driver,
					"JSESSIONID") + "] Product Id: "
				+ context.getProductSearchList() + " at ["
				+ new java.util.Date() + "] && viewport="
				+ viewport + " Server is " + server[0];
		    } else if (!(context.getProductIdFromPLP() == null)) {
			text = "Scenario ["
				+ scenario.getName()
				+ "] failed for session with JSESSIONID ["
				+ cookieManager.getCookieValueByName(driver,
					"JSESSIONID") + "] Product Id: "
				+ context.getProductIdFromPLP() + " at ["
				+ new java.util.Date() + "] && viewport="
				+ viewport + " Server is " + server[0];
		    } else {
			text = "Scenario ["
				+ scenario.getName()
				+ "] failed for session with JSESSIONID ["
				+ cookieManager.getCookieValueByName(driver,
					"JSESSIONID") + "]" + " at ["
				+ new java.util.Date() + "] && viewport="
				+ viewport + " Server is " + server[0];
		    }
		    /*
		     * List<JavaScriptError> Errors = JavaScriptError
		     * .readErrors(driver);
		     * System.out.println("Java Script Error :  " +
		     * Errors.size()); for (int i = 0; i < Errors.size(); i++) {
		     * System.out.println("Error Message : " +
		     * Errors.get(i).getErrorMessage());
		     * System.out.println("Error Line No : " +
		     * Errors.get(i).getLineNumber());
		     * 
		     * System.out.println(Errors.get(i).getSourceName());
		     * 
		     * text = text + "[JS Error Occured: " +
		     * Errors.get(i).getErrorMessage() + " " +
		     * "Error Line No.: " + Errors.get(i).getLineNumber() + " "
		     * + Errors.get(i).getSourceName() + " ]";
		     * 
		     * System.out.println();
		     */
		    // assertTrue("JS errors occured: " + Errors,
		    // Errors.isEmpty());

		    if (null != context.getEmail()) {
			text = text + "UserName is: "
				+ context.getEmail().toString() + "  "
				+ "Password is: " + EnvConfig.password + "  ";
			// scenario.write(text);
		    }
		    List<String> productsType = context.getProductType();
		    List<String> productSku = context.getProductSku();
		    if (null != context.getProductType()) {
			for (int i = 0; i < productsType.size(); i++) {
			    text = text + " " + productsType.get(i) + " : "
				    + productSku.get(i);
			}
		    }

		    scenario.write(text);

		} catch (WebDriverException wde) {
		    System.err.println(wde.getMessage());
		} catch (ClassCastException cce) {
		    cce.printStackTrace();
		} catch (Exception e) {

		    System.out
			    .println("Something Went Wrong While taking Snapshot");
		    throw new IllegalStateException("Browser Not Launched" + e);
		}

	    } else {
		if (EnvConfig.Omniture.equalsIgnoreCase("yes")) {
		    OmnitureUtils.StopServer();

		    String env;
		    if (EnvConfig.Env.equalsIgnoreCase("03"))
			env = "prod";
		    else
			env = "dev";
		    String filePathOld = "C:\\Apache24\\logs\\access.log";
		    String filePathNew = "D:\\Omniture\\Logs\\" + "reg_" + env
			    + "_" + scenario.getName() + ".txt";
		    System.out.println("Omniture log file path ########## "
			    + filePathNew);
		    OmnitureUtils.CopyFile(filePathOld, filePathNew);
		}
	    }
	} else {
	    if (context.getTextFile_path() != null) {
		byte[] array = Files.readAllBytes(new File(context
			.getTextFile_path()).toPath());
		scenario.embed(array, "text/plain");
	    }

	}
    }

    @After(order = 1)
    public void quit() throws InterruptedException, IOException {
	if (EnvConfig.Browser == null) {
	    System.out.println("No browser");
	    if (context.isLoggedIn() == true) {
		logoutUserRestApiPage.logoutService(
			context.getFEO_AppicableSitEID(), "valid", "post",
			"AllField");
	    }
	    // client.close();
	} else {

	    try {

		if (!(EnvConfig.Browser.equalsIgnoreCase("AndroidChrome"))) {
		    driver.manage().deleteAllCookies();
		}

		System.out.println("Delete cookies called in hook");
		Thread.sleep(500);
		driver.quit();
	    } catch (Exception e) {

		System.out.println("driver not getting closed to close");

	    }

	}
	System.out.println("Driver Closed !!!!!");
    }

}
