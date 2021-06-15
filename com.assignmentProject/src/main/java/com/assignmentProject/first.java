package com.assignmentProject;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class first {
	public static void main(String args[]) throws InterruptedException{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
	System.setProperty("webdriver.chrome.driver",projectpath+"/chromedriver");
	
	ExtentReports report = new ExtentReports(projectpath +"/extent-report/reprots/extentReport.html");
com.relevantcodes.extentreports.ExtentTest test = report.startTest("Selection tests");
	
	//login step details
	
	test.log(LogStatus.INFO, "Starting test");
	 WebDriver driver=new ChromeDriver();

	driver.get("https://wwwinvisalign-staging-us.herokuapp.com/get-started/smile-assessment");
	driver.manage().window().maximize();
	test.log(LogStatus.INFO, "Selecting first question");
//	locators.getLocators(driver, "teen").click();
	List<WebElement> ageoptions=locators.getLocators(driver, "age");
	
	List<WebElement> biteoptions= locators.getLocators(driver, "bite");

	for(int i=0;i<ageoptions.size();i++){
		
		for(int j=0;j<biteoptions.size();j++){
			
			
			
			
			for(int k=1;k<=3;k++){
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", locators.getLocator(driver, "status"));
				Select selector= new Select(locators.getLocator(driver, "status"));
				List<WebElement> age=locators.getLocators(driver, "age");
				
				List<WebElement> bite= locators.getLocators(driver, "bite");
				test.log(LogStatus.INFO, "Selecting first question");
				age.get(i).click();
				test.log(LogStatus.PASS, "first question selected");
				test.log(LogStatus.INFO, "Selecting second question");
				bite.get(j).click();
				test.log(LogStatus.PASS, "second question selected");
				test.log(LogStatus.INFO, "Selecting third question");
				selector.selectByIndex(k);
				Thread.sleep(3000);
				locators.getLocator(driver, "fname").clear();
				Thread.sleep(500);
				locators.getLocator(driver, "fname").sendKeys("urv");
				locators.getLocator(driver, "lname").clear();
				locators.getLocator(driver, "lname").sendKeys("tak");
				locators.getLocator(driver, "dob").clear();
				locators.getLocator(driver, "dob").sendKeys("09/24/1990");
				locators.getLocator(driver, "zipcode").clear();
				locators.getLocator(driver, "zipcode").sendKeys("411026");
				locators.getLocator(driver, "email").clear();
						locators.getLocator(driver, "email").sendKeys("urva@123.com");
				locators.getLocator(driver, "phone").sendKeys("8765432123");
				js.executeScript("arguments[0].scrollIntoView();", locators.getLocator(driver, "submit"));
				locators.getLocator(driver, "submit").click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "Form is submitted successfully");
				String text=driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/h2")).getText();
				System.out.println("Text is "+ text);
				Assert.assertEquals("urv’s results",text);
				test.log(LogStatus.PASS, "verification is successful");
				driver.manage().deleteAllCookies();
				driver.findElement(By.xpath("//*[@id='nav1']")).click();
		
			}
		}
	}
	
	driver.quit();
	report.endTest(test);
	report.flush();
	report.close();
}
}