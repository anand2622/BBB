package com.bbb.automation.stepdefs;

import org.openqa.selenium.WebDriver;

import com.bbb.automation.pages.BillingPage;
import com.bbb.automation.pages.SinglePageCheckout;
import com.bbb.automation.utils.EnvConfig;
import com.google.inject.Inject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class BillingPageStepdef {
    private final WebDriver driver;
    private final BillingPage billingPage;
    private final SinglePageCheckout spcPage;

    @Inject
    public BillingPageStepdef(BillingPage billingPage,
	    SinglePageCheckout spcPage) {
	this.billingPage = billingPage;
	this.spcPage = spcPage;
	driver = Hooks.driver;

    }

    @When("^I choose to add  billing details$")
    public void I_choose_to_add_billing_details() throws Throwable {
	billingPage.addNewBillingAddress(driver);
    }

    @When("^I choose to fill the billing contact info$")
    public void I_choose_to_fill_the_billing_contact_info() throws Throwable {
	billingPage.addContactInfo(driver);
    }

    @When("^I choose to unsuscribe email offers check box$")
    public void I_choose_to_unsuscribe_email_offers_check_box()
	    throws Throwable {
	billingPage.selectEmailSuscribeChekBox(driver);
    }

    @When("^I choose to click next on Billing Page on \"([^\"]*)\"$")
    public void I_chhose_to_click_on_continue_to_payment_button(String pageType)
	    throws Throwable {
	if (EnvConfig.SPC_Config.equalsIgnoreCase("Off")
		|| pageType.equalsIgnoreCase("Multishipping"))
	    billingPage.clickNext(driver);
	else
	    spcPage.clickApplyBillingInfo(driver);
    }

    @When("^I choose to add billing details on \"([^\"]*)\"$")
    public void I_choose_to_add_billing_details_and_click_Next_button(
	    String pageType) throws Throwable {
	if (EnvConfig.SPC_Config.equalsIgnoreCase("Off")
		|| pageType.equalsIgnoreCase("Multishipping")) {
	    billingPage.addNewBillingAddress(driver);
	    billingPage.addContactInfo(driver);
	} else {
	    spcPage.addNewBillingAddressOnSingleShipping(driver);
	}

    }

    @When("^I choose to validate delivery billing page on \"([^\"]*)\"$")
    public void I_choose_to_validate_delivery_billing_page(String pageType)
	    throws Throwable {
	System.out.println("!!!!!!!!Validating Billing Page....!!!!!!!!!");
	if (EnvConfig.SPC_Config.equalsIgnoreCase("Off")
		|| pageType.equalsIgnoreCase("MultiShipping")) {
	    billingPage.getDeliveryEstimatedShipping(driver);
	    billingPage.getDeliveryOrderSubTotal(driver);
	    billingPage.getDeliveryPreTaxTotal(driver);
	    billingPage.isValidateDeliveryBillingDetails(driver);
	    billingPage.clickNext(driver);
	} else
	    spcPage.clickApplyBillingInfo(driver);
    }

    @When("^I choose to validate Hybrid billing page$")
    public void I_choose_to_validate_Hybrid_billing_page() throws Throwable {
	System.out.println("!!!!!!!!Validating Billing Page....!!!!!!!!!");
	billingPage.getDeliveryEstimatedShipping(driver);
	billingPage.getDeliveryOrderSubTotal(driver);
	billingPage.getDeliveryPreTaxTotal(driver);
	billingPage.getBopusOrderSubTotal(driver);
	billingPage.isValidateHybridBillingDetails(driver);
	billingPage.clickNext(driver);
    }

    @When("^I choose to validate delivery billing page with Gift Options$")
    public void I_choose_to_validate_delivery_billing_page_with_Gift_Options()
	    throws Throwable {
	billingPage.getDeliveryEstimatedShippingWithGiftOptions(driver);
	billingPage.getDeliveryOrderSubTotal(driver);
	billingPage.getDeliveryPreTaxTotal(driver);
	billingPage.isValidateDeliveryBillingDetailsWithGiftOptions(driver);
	billingPage.clickNext(driver);
    }

    @When("^I choose to validate delivery billing page with Gift Options InCart$")
    public void I_choose_to_validate_delivery_billing_page_with_Gift_Options_InCart()
	    throws Throwable {
	billingPage.getDeliveryEstimatedShippingWithGiftOptions_InCart(driver);
	billingPage.getDeliveryOrderSubTotal_InCart(driver);
	billingPage.getDeliveryPreTaxTotal(driver);
	billingPage.isValidateDeliveryBillingDetailsWithGiftOptions(driver);
	billingPage.clickNext(driver);
    }

    @When("^I choose to validate bopus billing page$")
    public void I_choose_to_validate_billing_page() throws Throwable {
	billingPage.isValidateBopusBillingDetails(driver);
	billingPage.clickNext(driver);
    }

    @When("^I choose to validate Billing Info fields are non-editable$")
    public void validateBillingInfodisabled() throws Throwable {
	billingPage.isBillingInfoDisabled(driver);

    }

    @When("^I choose to modify billing details$")
    public void I_choose_to_modify_billing_details_and_click_Next_button()
	    throws Throwable {
	if (EnvConfig.SPC_Config.equalsIgnoreCase("Off")) {
	    billingPage.modifyBillingAddress(driver);
	    billingPage.addContactInfo(driver);
	} else
	    spcPage.addNewBillingAddressOnSingleShipping(driver);

    }

    @When("^I choose to fill the coupon billing contact info$")
    public void I_choose_to_fill_the_coupon_billing_contact_info()
	    throws Throwable {
	billingPage.addCouponContactInfo(driver);
    }

    @When("^I choose to fill the billing contact info with coupon enabled email$")
    public void i_choose_to_fill_the_billing_contact_info_with_coupon_enabled_email()
	    throws Throwable {
	billingPage.addCouponContactInfoWithCouponEnabledEmail(driver);
    }

    @When("^I choose to another click next on Billing Page$")
    public void I_chhose_to_click_on_next_to_payment_button() throws Throwable {
	billingPage.clickAnotherNext(driver);
    }

    @When("^I choose to click next on Billing Page$")
    public void I_chhose_to_click_on_continue_to_payment_button()
	    throws Throwable {

	billingPage.clickNext(driver);

    }

    @Then("^I choose to validate Registry LTL Billing Page Details$")
    public void I_choose_to_validate_RegistryLTL_single_shipping_details()
	    throws Throwable {

	System.out
		.println("!!!!!!!!!Validating Shipping Details....!!!!!!!!!!1");
	billingPage.getDeliveryOrderSubTotal(driver);
	billingPage.getDeliveryEstimatedShipping(driver);
	billingPage.getDeliverySurcharge(driver);
	billingPage.getDeliveryPreTaxTotal(driver);
	billingPage.isValidateRegistryLTLBillingDetails(driver);

    }

    @Then("^I choose to fetch Registry LTL Billing Page Details$")
    public void I_choose_to_fetch_RegistryLTL_single_shipping_details()
	    throws Throwable {

	System.out
		.println("!!!!!!!!!Validating Shipping Details....!!!!!!!!!!1");
	billingPage.getDeliveryOrderSubTotal(driver);
	billingPage.getDeliveryEstimatedShipping(driver);
	billingPage.getDeliverySurcharge(driver);
	billingPage.getDeliveryPreTaxTotal(driver);

    }

    @When("^I choose to validate Hybrid with LTL Registry billing page$")
    public void I_choose_to_validate_HybridWithLTLReg_billing_page()
	    throws Throwable {
	System.out.println("!!!!!!!!Validating Billing Page....!!!!!!!!!");

	billingPage.getDeliveryOrderSubTotal(driver);
	billingPage.getDeliveryEstimatedShipping(driver);
	billingPage.getDeliverySurcharge(driver);
	billingPage.getDeliveryPreTaxTotal(driver);
	billingPage.getBopusOrderSubTotal(driver);
	billingPage.isValidateHybridWithLTLRegBillingDetails(driver);
    }

    @Then("^I choose to edit billing details$")
    public void i_choose_to_edit_billing_details() throws Throwable {
	billingPage.editBillingInfo(driver);
    }

    @Then("^I verify my billing details gets updated$")
    public void i_verify_my_billing_details_gets_updated() throws Throwable {
	billingPage.verifyBillingInfo(driver);
    }
}
