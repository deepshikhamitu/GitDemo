package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContactSetup;

public class Hooks {
	TestContactSetup testcontactsetup;
	public Hooks(TestContactSetup testcontactsetup) {
		this.testcontactsetup=testcontactsetup;
	}
	@After
	public void AfterScenario() throws IOException {
		testcontactsetup.testBase.WebDriverManager().quit();;
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)testcontactsetup.testBase.WebDriverManager();
			File src=ts.getScreenshotAs(OutputType.FILE);
			byte[] filecontent =FileUtils.readFileToByteArray(src);
			scenario.attach(filecontent, "image/png", "image");
			
		}
	}
}
