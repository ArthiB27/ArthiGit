package Package1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {

	@Test(groups="one")
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver ob=new ChromeDriver();
		
		ob.get("http://www.google.com");
		
		
		// cookies :temporary information sSet<E>ed by the browser
		//set
		
		Set<Cookie> s=ob.manage().getCookies();
		System.out.println("Number of cookies in W3 schools: "+s.size());
		
		//Delete Cookies
		//not able to delete permanently
		ob.manage().deleteAllCookies();
		
		Set<Cookie> d=ob.manage().getCookies();
		System.out.println("Number of cookies after deletion "+d.size());
		
		ob.quit();
		
	}
}
