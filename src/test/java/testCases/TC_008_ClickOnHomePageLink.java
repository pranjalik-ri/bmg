package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePageLink;
import testBase.BaseClass;

public class TC_008_ClickOnHomePageLink extends BaseClass
{
	@Test
public void clickonhomepagelink() throws InterruptedException {
	
	HomePageLink link=new HomePageLink(driver);
	link.clickonlink();
    
	link.handleAlert();
}
}
