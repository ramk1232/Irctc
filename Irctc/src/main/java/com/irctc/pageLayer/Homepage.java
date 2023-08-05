package com.irctc.pageLayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irctc.baseclass.BaseClass;

public class Homepage extends BaseClass {

	public WebDriver driver;
	Actions A;

	// Step 1 : Declaration of variable globally (data members)

//	@FindBy(xpath="//button[@type='submit']")
//	private WebElement popup;
	
	@FindBy(xpath = "//div[@class='col-xs-12 loginhead hidden-xs']//img")
	private WebElement logo75Yr;

	@FindBy(xpath = "//input[@role='searchbox'][1]")
	private WebElement from;
	
	@FindBy(xpath = "//label[@for='origin']")
	private WebElement VerfromTxt;

	@FindBy(xpath = "(//div[@class='level_1_1 col-xs-12 remove-padding jp-form']//div[2]//span)[2]")
	private WebElement verTxt;

	@FindBy(xpath = "//li[@role='option'][2]")
	private WebElement click1;

	@FindBy(xpath = "//input[contains(@class,'ng-tns-c57-9 ')]")
	private WebElement to;

	@FindBy(xpath = "//li[@role='option'][2]")
	private WebElement click2;

	@FindBy(xpath = "//label[@for='dateSpecific']")
	private WebElement clickChk;

	@FindBy(xpath = "(//div[@class='form-group'])[2]")
	private WebElement DdClk;

	@FindBy(xpath = "((//div[@class='form-group'])[2]//div//div)[5]//ul//p-dropdownitem")
	private List<WebElement> Dd;

	@FindBy(xpath = "(//div[@class='form-group'])[1]")
	private WebElement DdClk2;

	@FindBy(xpath = "(//div[@class='form-group'])[1]//div//div//div//ul//p-dropdownitem")
	private List<WebElement> Dd2;

	@FindBy(xpath = "//button[@label='Find Trains']")
	private WebElement search;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		A = new Actions(driver);
	}

	// Step 3 : Method creation

//	public void pop() {
//		popup.click();	
//	}
	
	
	public void imgLogo75() {
		if(logo75Yr.isDisplayed()) {
			System.out.println("img Ajadi ka amrit mahotsab logo is displayed");
		}
		else {
			System.out.println("img Ajadi ka amrit mahotsab logo is not displayed");

		}
	}
	public void from1() {
		String s="From";
		from.sendKeys("PARBHANI");
		if(VerfromTxt.equals(s)) {
			System.out.println("Text is Verified");
		}
		else {
			System.out.println(VerfromTxt.getText()+" Text is different");
		}
	}

	public void verText() {
		if (verTxt.equals("----- Stations ----- PARBHANI JN - PBN MAHARASHTRA")) {
			System.out.println("Text is Verified");
		} else {
			System.out.println("Text is different");
			System.out.println(verTxt.getText());
		}
	}

	public void clik1() {
		click1.click();
	}

	public void to() {
		to.sendKeys("LATUR");
	}

	public void clik2() {
		click1.click();
	}

	public void clikchkb() {
		clickChk.click();
	}

	public void serch() {
		search.click();
	}

	public void dropDown() throws InterruptedException {
		DdClk.click();
		System.out.println();
		for (WebElement d : Dd) {
			Thread.sleep(500);
			A.moveToElement(d).build().perform();
			System.out.println(d.getText());
		}
		DdClk.click();
	}

	public void dropDown2() throws InterruptedException {
		DdClk2.click();
		System.out.println();
		for (WebElement dd : Dd2) {
			Thread.sleep(500);
			A.moveToElement(dd).build().perform();
			System.out.println(dd.getText());
		}
		Dd2.get(11).click();
		DdClk2.click();
	}
}
