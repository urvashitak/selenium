package com.assignmentProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {
	
	
	public static WebElement getLocator(WebDriver driver, String option){
		WebElement element=null;
		if(option.equals("teen"))
		{
		
	 element= driver.findElement(By.id("teen"));
		}
		if(option.equals("parent"))
		{
		
	 element= driver.findElement(By.id("parent"));
		}
		if(option.equals("adult"))
		{
		
	 element= driver.findElement(By.id("adult"));
		}
		if(option.equals("overbite"))
		{
		
	 element= driver.findElement(By.className("overbite"));
		}
		if(option.equals("underbite"))
		{
		
	 element= driver.findElement(By.className("underbite"));
		}
		if(option.equals("crossbite"))
		{
		
	 element= driver.findElement(By.className("crossbite"));
		}
		if(option.equals("gapteeth"))
		{
		
	 element= driver.findElement(By.className("gapteeth"));
		}
		if(option.equals("openbite"))
		{
		
	 element= driver.findElement(By.className("openbite"));
		}
		if(option.equals("crookedteeth"))
		{
		
	 element= driver.findElement(By.className("crookedteeth"));
		}
		if(option.equals("straighter"))
		{
		
	 element= driver.findElement(By.className("straighter"));
		}
		if(option.equals("inv_first"))
		{
		
	 element= driver.findElement(By.className("inv_first"));
		}
		if(option.equals("status"))
		{
		
	 element= driver.findElement(By.id("status"));
		}
		if(option.equals("fname"))
		{
		
	 element= driver.findElement(By.id("first_name"));
		}
		
		if(option.equals("lname"))
		{
		
	 element= driver.findElement(By.id("last_name"));
		}
		if(option.equals("dob"))
		{
		
	 element= driver.findElement(By.id("txtDOB"));
		}
		if(option.equals("zipcode"))
		{
		
	 element= driver.findElement(By.id("txtZip"));
		}
		if(option.equals("email"))
		{
		
	 element= driver.findElement(By.id("email"));
		}
		if(option.equals("phone"))
		{
		
	 element= driver.findElement(By.id("phone"));
		}
		
		if(option.equals("submit"))
		{
		
	 element= driver.findElement(By.xpath("/html/body/div[7]/div[1]/form/div/div[1]/div[2]/div[11]/div/a"));
		}
		if(option.equals("continue"))
		{
		
	 element= driver.findElement(By.className("epdsubmit"));
		}
	return element;
}
	public static List<WebElement> getLocators(WebDriver driver, String option){
		List<WebElement> elementlist=null;
		if(option.equals("age")){
			elementlist=driver.findElements(By.xpath("//div[@class='btn-group btn-ctype btn-switchType btn-select']/child::div/child::div"));	
			
		}
		if(option.equals("bite")){
			elementlist=driver.findElements(By.xpath("//div[@class='row row-teeth-type teethImagesWrapper']/child::div"));	
		}
		
		return elementlist;
		
	}
}