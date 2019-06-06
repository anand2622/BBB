package com.bbb.automation.stepdefs;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.bbb.automation.pages.MyAccount;
import com.bbb.automation.utils.Context;
import com.bbb.automation.utils.EnvConfig;
import com.bbb.automation.utils.Selenium_Functions;
import com.google.inject.Inject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class MyAccountStepdef {
    private final WebDriver driver;
    private final MyAccount myAccount;
    private final Context context;

    @Inject
    public MyAccountStepdef(MyAccount myAccount, Context context) {
	this.myAccount = myAccount;
	this.context = context;
	driver = Hooks.driver;

    }

    @When("^I choose to add new address$")
    public void I_choose_to_add_new_address() throws Throwable {
	myAccount.addNewAddress(driver);

    }

    @When("^I choose to Add new Credit Card Details$")
    public void I_choose_to_Add_new_Credit_Card_Details() throws Throwable {
	myAccount.AddCreditCardDetails(driver);

    }

    @When("^I choose to add_new_store_Details$")
    public void I_choose_to_Add_new_store_Details() throws Throwable {
	myAccount.addstoreDetails(driver);

    }

    @When("^I choose to set Updated Profile Details$")
    public void I_choose_to_set_Updated_Profile_Details() throws Throwable {
	context.setUpdatedProfileDetails(myAccount
		.getUpdatedProfileDetails(driver));

    }

    @Then("^Verify all of them are updated$")
    public void Verify_all_of_them_are_updated() throws Throwable {
	Assert.assertTrue("User is not able to add  Address", myAccount
		.isAddressUpdated(context.getAllProfileDetails().get(0),
			context.getUpdatedProfileDetails().get(0)));
	Assert.assertTrue("User is not able to add Card Details", myAccount
		.isCardUpdated(context.getAllProfileDetails().get(1), context
			.getUpdatedProfileDetails().get(1)));
	Assert.assertTrue("User is not able to add Favorite Store", myAccount
		.isStoreUpdated(context.getAllProfileDetails().get(2), context
			.getUpdatedProfileDetails().get(2)));
    }

    @When("^I choose to update personal details$")
    public void I_choose_to_update_personal_details() throws Throwable {
	context.setPersonalDetailsMsg(myAccount.updateUserProfile(driver));
    }

    @Then("^Verify personal details are updated$")
    public void Verify_personal_details_are_updated() throws Throwable {
	Assert.assertTrue("User is not able to update its personal details",
		myAccount.isUserProfileUpdated(context.getPersonalDetailsMsg()));
    }

    @Then("^I choose to navigate to My Account page$")
    public void NavigateToMyAccount() throws Throwable {

	myAccount.NavigateToMyAccountPage(driver);
    }

    @When("^I choose to navigate to My Account Page$")
    public void I_choose_to_navigate_to_My_Account_Page() throws Throwable {
	myAccount.navigateTOMyAccountPage(driver);
    }

    @When("^I choose to validate Error Message$")
    public void validateErrorMessage() throws Throwable {
	myAccount.isErrorMessageAppears(driver);
    }

    @When("^I choose to move to Homepage from My Account$")
    public void moveToHomepage() throws Throwable {

	myAccount.moveToHomepage(driver);

    }

    @When("^I choose to clear the phone number from My Account$")
    public void clearPhoneNumber() throws Throwable {
	myAccount.clearPhoneNumber(driver);
    }

    @When("^I choose to validate the Paypal email and phone number are not stored$")
    public void validatePaypalInfoNotStored() throws Throwable {
	myAccount.isValidatePaypalInfoNotStored(driver);
    }

    @Then("^I verify click on myAccountLink$")
    public void I_verify_click_on_myAccountLink() throws Throwable {
	Assert.assertTrue("click on myAccountLink is not working",
		myAccount.verifyClickMyAccountLink(driver));
    }

    @When("^I choose to click on view order history$")
    public void I_choose_to_click_on_view_order_history() throws Throwable {
	myAccount.clickViewOrderHistory(driver);
    }

    @When("^I choose to navigate back to My Account page from Order Conformation Page$")
    public void i_choose_to_navigate_back_to_My_Account_page_from_Order_Conformation_Page()
	    throws Throwable {
	myAccount.navigateBackToMyAccountPageFromOrderConformationPage(driver);
    }

    @Then("^I verify that user is navigated back to My Account Page$")
    public void i_verify_that_user_is_navigated_back_to_My_Account_Page()
	    throws Throwable {
	myAccount.verifyUserNavigatedToMyAccountPage(driver);
    }

}
