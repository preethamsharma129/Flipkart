package com.qa.testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;


import com.qa.pages.FlipkartPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	FileInputStream fileLoc;
	
	FlipkartPages Flipk;
	Properties prop;
	SoftAssert s;
	
	
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url) throws IOException {
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\preet\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    driver = new ChromeDriver();
			}
		else if(Browser.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		Flipk = new FlipkartPages(driver);
		driver.get(Url);
		s=new SoftAssert();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		s.assertAll();
	}
	public void captureScreenshot(WebDriver driver, String tName) throws IOException {		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
		FileUtils.copyFile(source, target);		
}}