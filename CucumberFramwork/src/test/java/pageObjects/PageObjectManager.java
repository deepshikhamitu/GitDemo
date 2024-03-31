package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public OffersPage offerspage;
	public WebDriver driver;
	public CheckoutPage checkoutpage;

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
public LandingPage getLandingPage() {
	landingPage=new LandingPage(driver);
	return landingPage;
}
public OffersPage OffersPage() {
	offerspage=new OffersPage(driver);
	return offerspage;
}
public CheckoutPage getCheckoutPage() {
checkoutpage=new CheckoutPage(driver);
return checkoutpage;
}}
