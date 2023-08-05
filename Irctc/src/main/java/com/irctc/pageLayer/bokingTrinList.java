package com.irctc.pageLayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.irctc.baseclass.BaseClass;

public class bokingTrinList extends BaseClass {

	WebDriver driver;
	Actions A;
	WebDriverWait wait;

	@FindBy(xpath = "//div[@role='region']//div//table//tr//td//label")
	private List<WebElement> allChkBoxes;

	@FindBy(xpath = "//div[@role='banner'][1]//img")
	private WebElement irctcLogos;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement mdifySerch;

	@FindBy(xpath = "(//div[@class='white-back col-xs-12 ng-star-inserted']//strong)[1]")
	private WebElement selClass;

	@FindBy(xpath = "(//div[@class='ng-star-inserted'])[10]//table//tr//td[3]//div//strong")
	private WebElement trinDateFlx;

	@FindBy(xpath = "(//div[@class='col-xs-12'])[1]//button")
	private WebElement bokTrain;

	@FindBy(xpath = "//p-confirmdialog[@key='tofrom']//button[1]")
	private WebElement cnfirmBox;

	@FindBy(xpath = "(//div[@class='ng-tns-c19-172 ui-dialog-content ui-widget-content']//a)[1]")
	private WebElement loginClsBtn;

	@FindBy(xpath = "(//div[@role='banner'])[1]//div[2]//i")
	private WebElement slider;

	@FindBy(xpath = "(//div[@id='slide-menu']//label)[1]")
	private WebElement timNdate;

	public bokingTrinList(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, (40));
		A = new Actions(driver);
	}

	public void allchkBoxes() throws InterruptedException {
		System.out.println(allChkBoxes.size());
		for (WebElement ck : allChkBoxes) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(ck));
				// A.moveToElement(ck).build().perform();
				System.out.println(ck.getText());
				Thread.sleep(600);
				ck.click();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

	public void irctcLogos() {
		System.out.println();
		if (irctcLogos.isDisplayed()) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");

		}
	}

	public void modifySerch() {
		wait.until(ExpectedConditions.elementToBeClickable(mdifySerch));
		mdifySerch.click();
	}

	public void seleClass() {
		wait.until(ExpectedConditions.elementToBeClickable(selClass));
		selClass.click();
	}

	public void trainDatfle() {
		wait.until(ExpectedConditions.elementToBeClickable(trinDateFlx));
		trinDateFlx.click();
	}

	public void bookTrainBttn() {
		wait.until(ExpectedConditions.elementToBeClickable(bokTrain));
		bokTrain.click();
	}

	public void cnfimBox() {
		wait.until(ExpectedConditions.elementToBeClickable(cnfirmBox));
		cnfirmBox.click();
	}

	public void loginWinClsBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(loginClsBtn));
		loginClsBtn.click();
	}

	public void slider() {
		wait.until(ExpectedConditions.elementToBeClickable(slider));
		slider.click();
		System.out.println();
		if (timNdate.isDisplayed()) {
			System.out.println(timNdate.getText() + " is displayed");
		} else {
			System.out.println("timNdate is not displayed");
		}
	}
}
