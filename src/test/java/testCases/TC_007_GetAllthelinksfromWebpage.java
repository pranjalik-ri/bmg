package testCases;

import org.testng.annotations.Test;

import pageObjects.ApplicationallLink;
import testBase.BaseClass;

public class TC_007_GetAllthelinksfromWebpage extends BaseClass
{
	
	@Test
	public void getallapplicationlink() {
		
	
		ApplicationallLink apk=new ApplicationallLink(driver);
	    apk.getAllLinksFromWebpage();
	   
	}
}
