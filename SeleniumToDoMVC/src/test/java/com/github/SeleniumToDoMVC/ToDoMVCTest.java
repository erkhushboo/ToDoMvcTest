package com.github.SeleniumToDoMVC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ToDoMVCTest {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\infoworld\\testing-workspace\\chromedriver.exe");
		  driver = new ChromeDriver();
		    
	  }
	
  @Test
  public void TestcaseOne() throws InterruptedException {
	  
	  driver.get("http://todomvc.com/");
	  Thread.sleep(15000);
	  driver.manage().window().maximize();	
	  // Store the text 
	  String text = driver.findElement(By.xpath("//a[@href='examples/angularjs']")).getText();
	  System.out.println("The MV Framework is :"+text);
	  driver.findElement(By.xpath("//a[@href='examples/angularjs']")).click();  
	  
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
