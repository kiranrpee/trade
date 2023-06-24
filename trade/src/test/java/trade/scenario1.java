package trade;

import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Bas.launch;
import pom_classes.pom_table;

public class scenario1 extends launch
{

@Test
public void fetchtradevalue() throws InterruptedException, FileNotFoundException
{
	
	
	Actions act=new Actions(driver);
	
	act.moveToElement(driver.findElement(By.xpath("//a[text()='Markets']"))).perform();
	
	act.moveToElement(driver.findElement(By.xpath("//div[@class=\"menuItemInfo-bWyNMkwZ\"]/span[text()='Stocks']"))).perform();
	driver.findElement(By.xpath("//span[text()='Stock Screener']")).click();
	
	
	
	driver.findElement(By.xpath("//div[@class=\"tv-screener-toolbar__button tv-screener-toolbar__button--options tv-screener-toolbar__button--filters apply-common-tooltip common-tooltip-fixed\"]")).click();
	
	driver.findElement(By.xpath("(//i[@class=\"tv-screener-dialog__selectbox-dropdown-toggle\"])[1]")).click();
	
	driver.findElement(By.xpath("//span[@class=\"tv-control-checkbox__label\"]/span[text()='Depositary Receipt']")).click();
	driver.findElement(By.xpath("//div[@class=\"tv-dropdown-behavior__item js-item-wrap\"]//span[text()='ETF']")).click();
	driver.findElement(By.xpath("(//i[@class=\"tv-screener-dialog__selectbox-dropdown-toggle\"])[1]")).click();

	
	driver.findElement(By.xpath("//span[@class=\"tv-control-checkbox__label\"]/span[text()='NYSE ARCA']")).click();
	
	driver.findElement(By.xpath("//div[@class='tv-dialog__close js-dialog__close tv-tabbed-dialog__close']")).click();

	
	
	

	pom_table t=new pom_table(driver);
	try {
		t.gettickerdata();
		t.pricedtadata();
		t.mktcap_data();
		t.volume_data();
		t.sector_data();
		}
	catch (Exception e) 
	{
		t.pricedtadata();
		t.mktcap_data();
		t.volume_data();
		t.sector_data();
	}
	
	finally {
		driver.close();
	}
	
}
	
}
