package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationallLink extends BasePage
{
	WebDriver driver;
	public ApplicationallLink(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//a") private List<WebElement>allLinks;
	

	public void getAllLinksFromWebpage() {
		// TODO Auto-generated method stub
		for(WebElement link : allLinks)
        {
            System.out.println(link.getText());
        }
	}
}