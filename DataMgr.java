package com.bbb.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataMgr {
    private static String FilePath = "/conf/";
    private static String DataFilePath = "/data/";
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int RANDOM_STRING_LENGTH = 10;
    static JSONParser parser = new JSONParser();

    public static String fetchObject(String textvalue) throws Throwable {
	JSONObject jsonObject = getJSONURL("ObjectRepository.json");
	String text = (String) jsonObject.get(textvalue);
	return text;
    }

    public static JSONObject fetchJsonObject(String textvalue) throws Throwable {
	JSONObject jsonObject = getJSONDataURL("TestData.json");
	jsonObject = (JSONObject) jsonObject.get(textvalue);
	return jsonObject;
    }

    public static JSONObject fetchJsonObjectFromObjectObject(String textvalue1,
	    String textvalue2) throws Throwable {
	JSONObject jsonObject = getJSONDataURL("TestData.json");
	jsonObject = (JSONObject) jsonObject.get(textvalue1);
	jsonObject = (JSONObject) jsonObject.get(textvalue2);
	jsonObject = (JSONObject) jsonObject.get(EnvConfig.Concept
		.toUpperCase());
	return jsonObject;
    }

    /**
     * Fetches the Json array object whose data description value matches the
     * identifier
     * 
     * @param textvalue
     * @param Identifier
     * @param Datadesc
     * @param File
     * @return
     * @throws Throwable
     */
    public static JSONObject fetchJsonArrayObject(String textvalue,
	    String Identifier, String Datadesc, String File) throws Throwable {
	JSONObject jsonObject = getJSONURL(File);
	JSONArray user = (JSONArray) jsonObject.get(textvalue);
	Iterator i = user.iterator();
	while (i.hasNext()) {
	    JSONObject innerObj = (JSONObject) i.next();
	    String var = (String) innerObj.get(Datadesc);
	    if (var.equals(Identifier)) {
		return (innerObj);
	    }
	}

	return null;
    }

    public static JSONObject fetchDataJsonArrayObject(String textvalue,
	    String Identifier, String Datadesc, String File) throws Throwable {
	JSONObject jsonObject = getJSONDataURL(File);
	JSONArray user = (JSONArray) jsonObject.get(textvalue);
	Iterator i = user.iterator();
	while (i.hasNext()) {
	    JSONObject innerObj = (JSONObject) i.next();
	    String var = (String) innerObj.get(Datadesc);
	    if (var.equals(Identifier)) {
		return (innerObj);
	    }
	}

	return null;
    }

    public static String fetchAddress(String key, String addressType,
	    String addressVariable) throws Throwable {

	String filePath = (new File("").getAbsolutePath())
		+ "/data/TestData.json";
	JSONParser jsonParser = new JSONParser();
	JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(
		filePath));

	jsonObject = (JSONObject) jsonObject.get(key);

	JSONArray jsonArray = (JSONArray) jsonObject.get(EnvConfig.Concept
		.toUpperCase());
	@SuppressWarnings("unchecked")
	Iterator<JSONObject> itr = jsonArray.iterator();
	jsonObject = itr.next();

	jsonObject = (JSONObject) jsonObject.get(addressType);
	String value = (String) jsonObject.get(addressVariable);
	return value;
    }

    public static JSONObject fetchDataJsonObjectArrayObject(String textvalue,
	    String Identifier, String Datadesc, String File) throws Throwable {
	JSONObject jsonObject = getJSONDataURL(File);
	jsonObject = (JSONObject) jsonObject.get(textvalue);
	JSONArray user = (JSONArray) jsonObject.get(EnvConfig.Concept
		.toUpperCase());
	Iterator i = user.iterator();
	while (i.hasNext()) {
	    JSONObject innerObj = (JSONObject) i.next();
	    String var = (String) innerObj.get(Datadesc);
	    if (var.equals(Identifier)) {
		return (innerObj);
	    }
	}
	return null;
    }

    /**
     * Returns the Reference of Json Object to the file
     * 
     * @param File
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ParseException
     */
    public static JSONObject getJSONURL(String File)
	    throws FileNotFoundException, IOException, ParseException {
	String basePath = new File("").getAbsolutePath();
	Object obj = parser.parse(new FileReader(basePath + FilePath + File));
	JSONObject jsonObject = (JSONObject) obj;
	return jsonObject;
    }

    public static JSONObject getJSONDataURL(String File)
	    throws FileNotFoundException, IOException, ParseException {
	String basePath = new File("").getAbsolutePath();
	Object obj = parser
		.parse(new FileReader(basePath + DataFilePath + File));
	JSONObject jsonObject = (JSONObject) obj;
	return jsonObject;
    }

    @SuppressWarnings("rawtypes")
    public static String getSite(JSONObject JsonFileObject) {
	String url = null;

	url = (String) ((HashMap) JsonFileObject).get(JsonFileObject
		.get("Concept"));

	return url;
    }

    public static String randEmail() {

	Date date = new Date();
	String var2 = date.toString().replaceAll(":", "");
	String var3 = var2.replaceAll(" ", "");
	var3 = var3.substring(0, 17);
	String EmailID = shuffle(var3) + "@mailsac.com";
	return EmailID;
    }

    public static String randString() {

	/*
	 * Date date = new Date(); String var2 = date.toString().replaceAll(":",
	 * ""); String var3 = var2.replaceAll(" ", ""); String string =
	 * shuffle(var3); return string;
	 */
	StringBuffer randStr = new StringBuffer();
	for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
	    int number = getRandomNumber();
	    char ch = CHAR_LIST.charAt(number);
	    randStr.append(ch);
	}
	return randStr.toString().toLowerCase();
    }

    private static int getRandomNumber() {
	int randomInt = 0;
	Random randomGenerator = new Random();
	randomInt = randomGenerator.nextInt(CHAR_LIST.length());
	if (randomInt - 1 == -1) {
	    return randomInt;
	} else {
	    return randomInt - 1;
	}
    }

    /**
     * Added this method because during the parallel execution at the same time
     * 2 create account is happening ( taking the same timestamp ) due to which
     * one of the scripts gets fail, this method shuffles the var3 parameter and
     * making the chances minimal
     * 
     * @param s
     * @return
     */

    public static String shuffle(String s) {

	String shuffledString = "";

	while (s.length() != 0) {
	    int index = (int) Math.floor(Math.random() * s.length());
	    char c = s.charAt(index);
	    s = s.substring(0, index) + s.substring(index + 1);
	    shuffledString += c;
	}

	return shuffledString;

    }

    public static String trimSpacesAndComma(String str) {

	str = str.replaceAll(",", "");
	str = str.replaceAll(" ", "");
	str = str.replaceAll("\\.", "");
	if (str.contains("*")) {
	    str = str.replaceAll(".[*].", "");
	}
	str = str.trim();

	return str;
    }

    // public static Connection getConnection() throws Throwable {
    // Driver myDriver = new oracle.jdbc.driver.OracleDriver();
    // DriverManager.registerDriver(myDriver);
    // String URL = DataMgr.fetchObject("DB_URL");
    // String USER = DataMgr.fetchObject("DB_Username");
    // String PASS = DataMgr.fetchObject("DB_Password");
    // Connection conn = DriverManager.getConnection(URL, USER, PASS);
    // return conn;
    //
    // }

    /**
     * Returns the value of RoundMethod And Value Column in E4X_FX_RATES Table
     * 
     * @param con
     * @return
     * @throws SQLException
     */
    public static List<String> getDBParam(Connection con) throws SQLException {
	List<String> dbParam = new ArrayList<String>();
	Statement stmt = null;
	String query = "SELECT * FROM E4X_FX_RATES WHERE SHOPPER_CURRENCY = 'AUD'";

	try {
	    stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(query);
	    while (rs.next()) {
		dbParam.add(rs.getString("ROUND_METHOD"));
		dbParam.add(rs.getString("VALUE"));

		System.out.println(dbParam.get(0) + "\t" + dbParam.get(1)
			+ "\t");
	    }
	} catch (SQLException e) {

	} finally {
	    if (stmt != null) {
		stmt.close();
	    }
	}
	return dbParam;
    }

    /**
     * Returns the Count of rows in E4X_PRICING_CUSTOMIZATIONS Table with
     * Merchant id and Cod provided
     * 
     * @param con
     * @param MerchantID
     * @return
     * @throws SQLException
     */
    public static String getPricingCustomizationCount(Connection con,
	    int MerchantID) throws SQLException {
	String value = null;
	Statement stmt = null;
	String query = "select count (*) as VALUE from E4X_PRICING_CUSTOMIZATIONS where MERCHANT_ID = "
		+ MerchantID + "and COD = 'AU' ";

	try {
	    stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(query);
	    while (rs.next()) {

		value = rs.getString("VALUE");

		System.out.println(value + "\t");
	    }
	} catch (SQLException e) {

	} finally {
	    if (stmt != null) {
		stmt.close();
	    }
	}
	return value;
    }

    /**
     * Returns the FrontLoadCoefficient from E4X_PRICING_CUSTOMIZATIONS Table
     * 
     * @param con
     * @param MerchantID
     * @return
     * @throws SQLException
     */

    public static String getFrontLoadCoefficient(Connection con, int MerchantID)
	    throws SQLException {
	String coeff = null;
	Statement stmt = null;
	String query = "select * from E4X_PRICING_CUSTOMIZATIONS where MERCHANT_ID = "
		+ MerchantID + "and COD = 'AU' ";

	try {
	    stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(query);
	    while (rs.next()) {

		coeff = rs.getString("FRONT_LOAD_COEFFICIENT");

		System.out.println(coeff + "dad" + "\t");
	    }
	} catch (SQLException e) {

	} finally {
	    if (stmt != null) {
		stmt.close();
	    }

	}
	return coeff;
    }

    /**
     * Closes the connection to Database
     * 
     * @param con
     * @throws SQLException
     */
    public static void closeConnection(Connection con) throws SQLException {
	con.close();
    }

    public static Boolean getFFextensionFlag() {
	Properties prop = new Properties();
	InputStream input = null;
	try {
	    input = new FileInputStream("D:\\bbddt\\bin\\extension.properties");
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    return false;
	}
	try {
	    prop.load(input);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    return false;
	}

	if (prop.getProperty("AddFFExtension").equalsIgnoreCase("yes"))
	    return true;
	else
	    return false;
    }

    public static JSONObject getJsonFileObject(String fileName, String filePath)
	    throws IOException, ParseException {
	String JsonConfigURL = (new File("").getAbsolutePath())
		.concat(filePath).concat(fileName);
	FileReader filereader = new FileReader(JsonConfigURL);
	JSONParser jsonParser = new JSONParser();
	JSONObject jsonObject = (JSONObject) jsonParser.parse(filereader);
	return jsonObject;
    }

    public static String fetchStringObjectValueFromJson(String key,
	    String key2, String fileName, String filePath) throws IOException,
	    ParseException {
	JSONObject jsonObject = getJsonFileObject(fileName, filePath);
	jsonObject = (JSONObject) jsonObject.get(key);
	String value = (String) jsonObject.get(key2);
	return value;

    }

    public static JSONObject fetchDataJsonArrayObjectFormFields(
	    String dataToBextracted, String File) throws Throwable {
	JSONObject jsonObject = getJSONDataURL(File);
	JSONObject jsonobjectFields = (JSONObject) jsonObject
		.get(dataToBextracted);

	return jsonobjectFields;
    }

    public static JSONObject fetchDataJsonObjectArrayObjectByEnvHeader(
	    String textvalue, String Identifier, String Datadesc, String File)
	    throws Throwable {
	JSONObject jsonObject = getJSONDataURL(File);
	jsonObject = (JSONObject) jsonObject.get(textvalue);
	JSONArray user = (JSONArray) jsonObject.get(EnvConfig.Env_Header
		.toLowerCase());
	Iterator i = user.iterator();
	while (i.hasNext()) {
	    JSONObject innerObj = (JSONObject) i.next();
	    String var = (String) innerObj.get(Datadesc);
	    if (var.equals(Identifier)) {
		return (innerObj);
	    }
	}
	return null;
    }

    public static String getValueByAPIVersion(String File,
	    String url_statefull, String Noturl_statefull)
	    throws FileNotFoundException, IOException, ParseException {
	String basePath = new File("").getAbsolutePath();
	String value = null;
	Object obj = parser
		.parse(new FileReader(basePath + DataFilePath + File));
	JSONObject jsonObject = (JSONObject) obj;
	if (EnvConfig.APIVersion_Flag.equalsIgnoreCase("statefull"))
	    value = (String) jsonObject.get(url_statefull);
	else
	    value = (String) jsonObject.get(Noturl_statefull);
	return value;
    }

    public static String getProdQueryParam(String File, String Env_Flag)
	    throws FileNotFoundException, IOException, ParseException {
	String basePath = new File("").getAbsolutePath();
	String value = null;
	Object obj = parser
		.parse(new FileReader(basePath + DataFilePath + File));
	JSONObject jsonObject = (JSONObject) obj;
	if (EnvConfig.Env_Flag.equalsIgnoreCase("prod"))
	    value = (String) jsonObject.get("prod_queryParam");
	else
	    value = "";
	return value;
    }

    /*
     * public static JSONObject fetchDataJsonArrayObject1(String textvalue,
     * String Identifier, String Datadesc, String File) throws Throwable {
     * JSONObject jsonObject = getJSONDataURL(File); JSONArray user =
     * (JSONArray) jsonObject.get(textvalue); Iterator i = user.iterator();
     * while (i.hasNext()) { JSONObject innerObj = (JSONObject) i.next();
     * 
     * if(innerObj.get(Datadesc) instanceof JSONArray )
     * 
     * 
     * String var = (String) innerObj.get(Datadesc); if (var.equals(Identifier))
     * { return (innerObj); } }
     * 
     * return null; }
     */

}
