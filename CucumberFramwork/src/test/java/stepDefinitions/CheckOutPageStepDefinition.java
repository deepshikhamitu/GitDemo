package stepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContactSetup;

public class CheckOutPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContactSetup testContactSetup;
	public CheckoutPage checkoutpage;
	
	public CheckOutPageStepDefinition(TestContactSetup testContactSetup){
		this.testContactSetup=testContactSetup;
		this.checkoutpage=testContactSetup.pageObjectManager.getCheckoutPage();
		System.out.println("testdsjhgv");
		
		
		
	}


@Then("verify user has ability to enter promo code and place the order")
public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	 
	 Assert.assertTrue(checkoutpage.VerifyPromoBtn());
	 Assert.assertTrue(checkoutpage.VerifyplaceOrder());
	 
}
@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_Checkout(String name) throws InterruptedException {
	checkoutpage.CheckoutItems();
	
}

}
