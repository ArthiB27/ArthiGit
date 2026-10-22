package Package2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C1 {
	
	@Test(groups="two")
	public void m3() throws InterruptedException
	{
		//step1: configuration the chromedriver //shift+rightclick chromedriver->copypath
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
				//step2: create an object for chromedriver class
				ChromeDriver ob=new ChromeDriver();
				//step3:Visiting website
				ob.get("http://www.google.com");
				
				//maximize window
				ob.manage().window().maximize();
				
				//refresh
				ob.navigate().refresh();
				
				//hold it for 3seconds
				Thread.sleep(3000);	//3000 milliseconds
				
				ob.quit();
	}

}
