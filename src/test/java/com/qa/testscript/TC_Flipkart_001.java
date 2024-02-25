package com.qa.testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TC_Flipkart_001 extends TestBase{
	@Test
	public void Flipkart() throws InterruptedException {
			if(Flipk.getFlipkartLogo().isDisplayed()) {	
				System.out.println( "Flipkart Logo is present on left side of top");	
}
			else {
				System.out.println( "Flipkart Logo is not present on left side of top");
			}
			Flipk.gettextbox().sendKeys("Macbook air m2");
			Thread.sleep(1000);
			Flipk.getsearch().click();
			Thread.sleep(1000);
			Flipk.getFirstitem().click();
			
			String ParentWindow = driver.getWindowHandle();  
	        Set<String> ChildWindow = driver.getWindowHandles(); 
	        for (String a : ChildWindow) {
	            if (ParentWindow.equals(a)) { 
	            } 
	            else {  
	                driver.switchTo().window(a); 
	                Thread.sleep(2000); 
	              Flipk.getCartbutton().click();
	              Flipk.getViewcart().click();
	              Thread.sleep(3000);
	              if (Flipk.getVerifyitem().isDisplayed()) {
	                  System.out.println("Item added to cart ");
	              } else {
	                  System.out.println("Item not added to cart.");
	              }
	            } 
	        } 
	    } 
			} 

