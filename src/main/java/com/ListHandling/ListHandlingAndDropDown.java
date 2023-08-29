package com.ListHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListHandlingAndDropDown {

	public static void main(String[] args) {
		 
		System.setProperty("WebDriver.chrome.driber","D:\\chromedriver_win32");
		WebDriver driver;
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://m.facebook.com/reg");
	  driver.findElement(By.id("firstname_input")).sendKeys("bhagyashree");
	  driver.findElement(By.id("lastname_input")).sendKeys("Gote");
	  driver.findElement(By.xpath(" //button[@type='submit']")).click();
	  //drop and down or list handling
	  WebElement day= driver.findElement(By.id("day"));
	  Select s= new Select(day);
	  s.selectByIndex(1);
		
	  WebElement month = driver.findElement(By.id("month"));
	  Select s1= new Select(month);
	  s1.selectByValue("2");
		
	  WebElement year = driver.findElement(By.id("year"));
	  Select s2= new Select( year);
	  s2.selectByVisibleText("2022");

	  //print option 
	
	  
	  List<WebElement> option = s.getOptions();
	  for(WebElement list:option) {
	  System.out.println("The option is :"+list.getText());
	   }
	  // print size
	  
	  int size= option.size();
		 System.out.println("the size is:"+size);
	  
		//the list is multiple or not
		 
		 if(s.isMultiple()) {
			 
			 System.out.println("the list box is multiple.");
			 
		 }else 
			 
			 System.out.println("not multiple");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	  
	  
	  
	  
	  
	}

}
