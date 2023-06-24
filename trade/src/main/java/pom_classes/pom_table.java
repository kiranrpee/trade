package pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_table 
{

	@FindBy(xpath ="//tbody/tr/td[1]")
	private List<WebElement> Ticker_column; 
	
	@FindBy(xpath = "//tbody/tr/td[2]")
	private List<WebElement> price_column; 
	
	@FindBy(xpath = "//tbody/tr/td[6]")
	private List<WebElement> vol_column; 
	
	@FindBy(xpath = "//tbody/tr/td[8]")
	private List<WebElement> mkt_cap_coulmn; 
	
	@FindBy(xpath = "//tbody/tr/td[last()]")
	private List<WebElement> sector_column; 
	
	
	public pom_table(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void gettickerdata() 
	{
		for(WebElement data:Ticker_column)
		{
			System.out.println(data.getText());
		}
		
	}
	

	public void pricedtadata() 
	{
		for(WebElement data:price_column)
		{
			System.out.println(data.getText());
		}
		
	}
	

	public void volume_data() 
	{
		for(WebElement data:vol_column)
		{
			System.out.println(data.getText());
		}
		
	}

	public void mktcap_data() 
	{
		for(WebElement data:mkt_cap_coulmn)
		{
			System.out.println(data.getText());
		}
		
	}

	public void sector_data() 
	{
		for(WebElement data:sector_column)
		{
			System.out.println(data.getText());
		}
		
	}
	
	
}
