package Customer_Web_application;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class All_links_application
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
            "D:\\ESPORT\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	driver.get("https://www.linkedin.com/in/tusharbhosale19/");
	driver.findElement(By.xpath("(//span[text()='Connect'])[2]")).click();
//	driver.get("https://bmg-test.bookmygarrage.com/");
//	//login -Enter mobile number
//	
//	driver.findElement(By.xpath("//button[text()='Login']")).click();
//	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9403909319");
//	driver.findElement(By.xpath("//button[text()='Continue']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@placeholder='One Time Password']")).sendKeys("000000");
//	driver.findElement(By.xpath("//button[text()='Continue']")).click();
//	
//	//get size of all the link from webpage
//	 List <WebElement> allLinks = driver.findElements(By.xpath("//a")); 
//	 int size = allLinks.size(); 
//	 System.out.println(size); 
////	int size = driver.findElements(By.xpath("//a")).size(); 
////	System.out.println(size);
//	 
//	 //get all the links from webpage
//	 List<WebElement> allLinks1  = driver.findElements(By.xpath("//a")); 
//	 for(WebElement s1: allLinks1) 
//	 { 
//	 System.out.println(s1.getText()); 
//	 } 
//}
//}
}}