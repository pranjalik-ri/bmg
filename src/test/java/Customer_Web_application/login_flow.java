package Customer_Web_application;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login_flow
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\pranj\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	driver.get("https://bmg-test.bookmygarrage.com/");
	//login -Enter mobile number
	
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9403909319");
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='One Time Password']")).sendKeys("000000");
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[text()='Enquire now'])[1]")).click();
	//select vehicle
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[text()='Hyundai Creta, Petrol']")).click();
	//enter iocl number
    driver.findElement(By.xpath("//input[@id=':ra:-form-item']")).sendKeys("ORGNL-23");
    Thread.sleep(2000);
    //enter iocl transaction number
    driver.findElement(By.xpath("//input[@ name='transactionNumber']")).sendKeys("00000011");
    //upload image
    Thread.sleep(3000);
 // Locate the file input element
     driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\pranj\\OneDrive\\Desktop\\1557472868073.jpeg");
    // Replace "fileInputId" with the actual ID of the file input element

    // Specify the path of the image file to upload
  
    // Add some delay to see the result
    try {
        Thread.sleep(3000); // Wait for 3 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//button[text()='Apply now']")).click();
}        
}

