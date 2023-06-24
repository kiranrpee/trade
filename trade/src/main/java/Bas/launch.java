package Bas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch 
{
protected WebDriver driver;

@BeforeMethod
public void prereqisite()
{
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.tradingview.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	
	
	
	
	
}



	
}
