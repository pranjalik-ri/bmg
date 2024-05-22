package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage
{
WebDriver driver;
public BasePage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}


//base page contains the constructor which only intiates the webdriver.