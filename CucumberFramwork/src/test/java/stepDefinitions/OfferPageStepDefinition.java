package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContactSetup;

public class OfferPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContactSetup testContactSetup;
	public PageObjectManager pageobjectmanger;

	public OfferPageStepDefinition(TestContactSetup testContactSetup){
		this.testContactSetup=testContactSetup;
	}
	@Then("^User serached for (.+) shortname in offers page$")
	public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		switchToOfferPage();
		OffersPage offersPage=testContactSetup.pageObjectManager.OffersPage();
		offersPage.searchItem(shortName);
		Thread.sleep(2000);
	    offerPageProductName=offersPage.getProductName();
	    System.out.print("3");
	}
	
	public void switchToOfferPage() {
		//If swithched to offer page --> skip below part
		//if(testContactSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
			//pageobjectmanger=new PageObjectManager(testContactSetup.driver);
		
		LandingPage landingPage=testContactSetup.pageObjectManager.getLandingPage();
		landingPage.selecttopDealsPage();	
		testContactSetup.genericUtils.switchWindowChild();
		System.out.print("4");
	}
	
	@Then("validate product name in offers page matches with the Landing Page")
	public void validate_product_name_in_offers_page_matches_with_the_Landing_Page(){
		Assert.assertEquals(offerPageProductName, testContactSetup.landingPageproductName);
		System.out.print("5");
	}
}
