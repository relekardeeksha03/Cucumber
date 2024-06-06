package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionalLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class CustomerModule {
	WebDriver driver;
	@Given("^user navigate browser$")
	public void launchbrowser() throws Throwable {
		driver = FunctionalLibrary.startBrowser();
	}

	@When("^user launch url$")
	public void launch_url() throws Throwable {
		FunctionalLibrary.openUrl();
	}

	@When("^user wait for username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wait_for_username_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^user enter username with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData) throws Throwable {
		FunctionalLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("^user enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData) throws Throwable {
		FunctionalLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("^user clicklogin button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_clicklogin_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^user Wait for customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Wait_for_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.waitForElement(LocatorType, LocatorValue ,"10");
	}

	@When("^user click customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_click_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^user wait add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wait_add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^user click add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_click_add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^user wait for customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wait_for_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.waitForElement(LocatorType, LocatorValue, "10");  
	}

	@When("^user capture customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_capture_customer_number_with_and(String LocatorType, String LOcatorValue) throws Throwable {
		FunctionalLibrary.captureCus(LocatorType, LOcatorValue);
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("^User Click Add button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Click_Add_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Wait for confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^click confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Wait for alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.waitForElement(LocatorType, LocatorValue, "10");

	}

	@When("^click alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.clickAction(LocatorType, LocatorValue);

	}

	@When("^Validate Customer table$")
	public void validate_Customer_table() throws Throwable {
		FunctionalLibrary.customerTable();
	}

	@When("^Click logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_logout_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionalLibrary.clickAction(LocatorType, LocatorValue);

	}

	@When("^close application browser$")
	public void close_application_browser() throws Throwable {
		FunctionalLibrary.closeBrowser();
	}

	@When("^user click supplier link$")
	public void user_click_supplier_link() throws Throwable {

	}

}
