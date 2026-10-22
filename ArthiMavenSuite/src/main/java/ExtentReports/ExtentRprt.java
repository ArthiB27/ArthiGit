package ExtentReports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentRprt {

	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public  void startTest()
	{
	//creating an object for extent reports class, pass path as input, globally
	report = new ExtentReports("arthi.html");	//will change html file name
	// test start ,finish, loging
	test = report.startTest("e1");

	test.log(LogStatus.ERROR,"it may fail");	//will mention logstatus as error, pass,info,etc
	test.log(LogStatus.INFO,"in before class");

	}
	@Test
	public void extentReportsDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	Assert.assertEquals(driver.getTitle(),"Google");
	test.log(LogStatus.PASS,"Test case passed ");
	test.setDescription("this is about google");	//give descriptions
	driver.quit();

	}

	@AfterClass
	public void endTest()
	{
	test.log(LogStatus.INFO,"in after class");
	report.endTest(test);
	report.flush();		//important to give report flush
	}
}
