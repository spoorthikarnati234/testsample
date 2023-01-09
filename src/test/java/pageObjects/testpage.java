package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testpage {
	

	WebDriver driver;
	
	@FindBy(xpath="//a[@id='translation-btn' and contains(text(),'English')]")
	public WebElement english;
	
	@FindBy(xpath="//strong[@id='name-lite']")
	public WebElement liteplan;
	@FindBy(xpath="//strong[@id='name-classic']")
	public WebElement classicplan;
	@FindBy(xpath="//strong[@id='name-premium']")
	public WebElement premiumplan;
	
	@FindBy(xpath="//a[@id='country-btn']")
	public WebElement countrybtn;
	@FindBy(xpath="//a[@id='kw']")
	public WebElement kuwaitbtn;
	
	@FindBy(xpath="//div[@id='currency-lite']")
	public WebElement litecurrency;
	@FindBy(xpath="//div[@id='currency-classic']")
	public WebElement currencyclassic;
	@FindBy(xpath="//div[@id='currency-premium']")
	public WebElement currencypremium;

	public testpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickEnglish() {
		english.click();
	}
	public void clickKuwait() {
		countrybtn.click();
		kuwaitbtn.click();
	}
}
