package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContactSetup {
public WebDriver driver;
public TestBase testBase;
public String landingPageproductName;
public PageObjectManager pageObjectManager;
public GenericUtils genericUtils;
public TestContactSetup() throws IOException {
	testBase=new TestBase();
	pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
	genericUtils=new GenericUtils(testBase.WebDriverManager());
}
}
