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
import pageObjects.LandingPage;
import utils.TestContactSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContactSetup testContactSetup;
	public LandingPage landingPage;
	
	public LandingPageStepDefinition(TestContactSetup testContactSetup){
		this.testContactSetup=testContactSetup;
		 this.landingPage=testContactSetup.pageObjectManager.getLandingPage();
	}
	@Given("User is on GreenCard Landing Page")
	public void user_is_on_green_card_landing_page() throws IOException {
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
		
		System.out.print("1");
	    
	}
	@When("^User serached with Shortname (.+) and extracted actual name of product$")
	public void user_serached_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		landingPage.searchItem(shortname);
		//testContactSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
	    Thread.sleep(2000);
	    testContactSetup.landingPageproductName=landingPage.getProductName().split("-")[0].trim();
	    //testContactSetup.landingPageproductName=testContactSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	  System.out.println(testContactSetup.landingPageproductName+"is extracted from Home page"); 
	  System.out.print("2");
	}
	@When("Added {string} items on the selected product to cart")
	
	public void Addeditemsproduct(String quantity) {
		
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}

	

}
