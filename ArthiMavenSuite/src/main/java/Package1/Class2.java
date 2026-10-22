package Package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	@Test(groups="one")
	public void m2()
	{
		//step1: configuration the chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//step2: create an object for chromedriver class
		ChromeDriver ob=new ChromeDriver();
		//step3:Visiting websitr
		ob.get("http://www.google.com");
		
		//get Title
		System.out.println(ob.getTitle());
		
		//get CurrentURL
		System.out.println(ob.getCurrentUrl());
		
		//get size: dimension: height and width
		System.out.println(ob.manage().window().getSize());
		
		//get position: x and y value of the window:point
		System.out.println(ob.manage().window().getPosition());
		
		//get browser details
		System.out.println(ob.getCapabilities());
		
		ob.quit();
		
	}

}
