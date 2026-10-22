package TestNgDataprovider;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
	// Data provider - helps with data driven test cases that cary same method but
    //                  run multiple times with different data sets 

    @DataProvider(name = "Arthi")
    public static Object[][] DataSet(){
        // arrayname[row][col]
        Object[][] obj = {
                { "Arthithi123", "12345"},//row   00   01  02
                { "DDD", "555"},             //row   10   11  12
                { "DEEPA","3456"}
                };
        return obj;
    }

    @Test(dataProvider = "Arthi")// we made the cnnection     
    //first    type=valid   username=Dhivyakarthi123   password=12345
    //second   type=invalid username=DDD               password=555
    //third    type=in      username=DEEPA             password=3456
    public void DataProvSampleTest(String username, String password) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		ob.findElementByName("email").sendKeys(username);
		
		ob.findElementByName("pass").sendKeys(password);
		Thread.sleep(2000);
        ob.quit();
    }

}
