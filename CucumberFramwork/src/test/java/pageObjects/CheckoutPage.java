package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
By cartBag=By.cssSelector("img[alt='Cart']");
By checkOutButton=By.cssSelector("//button[contains(text(),'PROCEED TO CHECKOUT')]");
By promoBtn=By.cssSelector(".promoBtn");
By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
WebDriver driver;
public CheckoutPage(WebDriver driver) {
	this.driver=driver;
}
public void CheckoutItems() {
	driver.findElement(cartBag).click();
	driver.findElement(checkOutButton).click();
}
public Boolean VerifyPromoBtn() {
	return driver.findElement(promoBtn).isDisplayed();
}
public Boolean VerifyplaceOrder() {
	return driver.findElement(placeOrder).isDisplayed();
}
}
