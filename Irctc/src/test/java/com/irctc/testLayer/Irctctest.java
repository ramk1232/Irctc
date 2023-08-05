package com.irctc.testLayer;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.irctc.baseclass.BaseClass;
import com.irctc.pageLayer.Homepage;
import com.irctc.pageLayer.bokingTrinList;


public class Irctctest extends BaseClass {

	Homepage Ir;
	bokingTrinList bk;
	SoftAssert assrt;
	int testID;

	@Test(priority = 0)
	public void img75YrLogo() {
		testID = 1;
		Ir = new Homepage(driver);
		Ir.imgLogo75();
	}

	@Test(priority = 1)
	public void fr() {
		testID = 02;
		Ir = new Homepage(driver);
		Ir.from1();
	}

	@Test(priority = 2)
	public void cl1() {
		testID = 03;
		Ir = new Homepage(driver);
		assrt = new SoftAssert();
		Ir.clik1();
		Ir.verText();
		String url = driver.getCurrentUrl(); // Actual
		assrt.assertEquals(url, "https://www.irctc.co.in/nget/train-search");
		assrt.assertAll();
	}

	@Test(priority = 3)
	public void to() {
		testID = 04;
		Ir = new Homepage(driver);
		Ir.to();
	}

	@Test(priority = 4)
	public void clk2() {
		testID = 05;
		Ir = new Homepage(driver);
		Ir.clik2();
	}

	@Test(priority = 5)
	public void ckBox() {
		testID = 06;
		Ir = new Homepage(driver);
		Ir.clikchkb();
	}

	@Test(priority = 6)
	public void dropD() throws InterruptedException {
		testID = 07;
		Ir.dropDown();
		Ir = new Homepage(driver);
		Ir.dropDown2();
	}

	@Test(priority = 7)
	public void serh() {
		testID = 8;
		Ir.serch();
		Ir = new Homepage(driver);
	}

	@Test(priority = 8)
	public void allCkBoxess() throws InterruptedException {
		testID = 9;
		bk = new bokingTrinList(driver);
		assrt = new SoftAssert();
		bk.allchkBoxes();
		String url2 = driver.getCurrentUrl(); // Actual
		assrt.assertEquals(url2, "https://www.irctc.co.in/nget/booking/train-list");
		assrt.assertAll();
	}

	@Test(priority = 9)
	public void irctcLogos2() throws InterruptedException {
		testID = 10;
		bk = new bokingTrinList(driver);
		bk.irctcLogos();
		Thread.sleep(5000);
		bk.modifySerch();
		Thread.sleep(5000);
		bk.seleClass();
		Thread.sleep(5000);
		bk.trainDatfle();
		Thread.sleep(5000);
		// bk.bookTrainBttn();
		// bk.cnfimBox();
		// Thread.sleep(5000);
		// bk.loginWinClsBtn();
		bk.slider();
	}

}
