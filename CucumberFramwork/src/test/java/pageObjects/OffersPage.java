package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	By search=By.xpath("//input[@type='search']");
By productName=By.cssSelector("tr td:nth-child(1)");
	//By getProductName=By.cssSelector("h4.product-name");
	
	WebDriver driver;
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	public void getsearchText() {
		driver.findElement(search).getText();
	}
	public String getProductName() {
		return driver.findElement(productName).getText();
	}

}
