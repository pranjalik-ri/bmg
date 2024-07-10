
package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	
	static public WebDriver driver;
	public Logger logger;
	public Properties P;
	
	@BeforeClass(groups={"sanity","regression","testng"})
	@Parameters({"os","browser"})
    public void setup(String os,String br) throws IOException {
		
		//loading properties file
		FileReader file=new FileReader(".//src/test/resources/config.properties");
		P=new Properties();
		P.load(file);
		
		//loading log4j file
		logger=LogManager.getLogger(this.getClass());//log4j
		
		//launching browser based on condition
		switch(br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		
		}
		

   // driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(P.getProperty("appURL"));
	driver.manage().window().maximize();
    }
//	@AfterClass(groups={"sanity","regression","testng"})
//	public void tearDown()
//	{
//		driver.close();
//	}
	
	//for capturnng the screen
	public String captureScreen(String tname)throws IOException{
		
		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	   
		TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
	    File sourceFile=takeScreenshot.getScreenshotAs(OutputType.FILE);
	   
	    String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+ tname+"_"+timeStamp+".png";
	    File targetFile=new File(targetFilePath);
	   
	    sourceFile.renameTo(targetFile);
	    
	    return targetFilePath;
	}
	//3 method to create generate ddata
		public String randomString()
		{
			String generatedString=RandomStringUtils.randomAlphabetic(5);
			return generatedString;
		}
		public String randomNumber()
		{
			String generatedString=RandomStringUtils.randomNumeric(10);
			return generatedString;
		}
		public String randomAlphaNumeric()
		{
			String str=RandomStringUtils.randomNumeric(4);
			String num=RandomStringUtils.randomAlphanumeric(4);
			return (str+"@"+num);
		}
}
