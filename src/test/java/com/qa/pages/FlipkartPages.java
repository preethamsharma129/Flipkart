package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[1]/a/picture/img")
	WebElement FlipkartLogo;

	public WebElement getFlipkartLogo() {
		return FlipkartLogo;
	}
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")
	WebElement textbox;

	public WebElement gettextbox() {
		return textbox;
	}
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/button")
	WebElement search;

	public WebElement getsearch() {
		return search;
	}

	@FindBy(xpath="/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement Firstitem;

	public WebElement getFirstitem() {
		return Firstitem;
	}
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement Cartbutton;

	public WebElement getCartbutton() {
		return Cartbutton;
	}
	@FindBy(className="_3SkBxJ")
	WebElement Viewcart;

	public WebElement getViewcart() {
		return Viewcart;
	}
	@FindBy(className="_396cs4")
	WebElement Verifyitem;

	public WebElement getVerifyitem() {
		return Verifyitem;
	}
	public FlipkartPages(WebDriver rDriver) {
		this.driver= rDriver;
		PageFactory.initElements(rDriver, this);
}
}
