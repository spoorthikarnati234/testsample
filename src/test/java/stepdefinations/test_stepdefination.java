package stepdefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import implementation.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.testpage;

public class test_stepdefination {
Hooks h=new Hooks();
	WebDriver driver=DriverManager.getDriver();
	testpage tp=new testpage(driver);
	 @Given("Open url and select language")
	    public void open_url_and_select_language() throws IOException, InterruptedException {
		 System.out.println(h.propertiesvalues("url"));
	       driver.get(h.propertiesvalues("url"));
	       tp.clickEnglish();
	       
	    }
	 @Then("validate package amount package name for KSA")
	 public void validate_package_amount_package_name(){
		 Assert.assertTrue(tp.liteplan.isDisplayed());

	       Assert.assertTrue(tp.classicplan.isDisplayed());

	       Assert.assertTrue(tp.premiumplan.isDisplayed());
	 }
	 @When("kuwait is selected")
	 public void kuwait_is_selected(){
		 tp.clickKuwait();
		 Assert.assertTrue(tp.litecurrency.isDisplayed());

	       Assert.assertTrue(tp.currencyclassic.isDisplayed());

	       Assert.assertTrue(tp.currencypremium.isDisplayed());
	 }

}
