package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
WebDriver driver;
public HomePage (WebDriver driver)
{
	super(driver);
}
//Step1: declaration 
@FindBy(xpath="//button[text()='Login']") private WebElement login; // private WebElement SignIn=driver.fi
//ndElement(By.xpath("//a[text()=’Sign in’]")); 


public void clickonlogin() {
	login.click();
}
}
//driver.findElement(By.xpath("//button[text()='Login']")).click();