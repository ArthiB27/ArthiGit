package Logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Log1 {
	static Logger log= LogManager.getLogger(Log1.class);
			@Test
			public void m1() throws InterruptedException
			{
			//step1: configuration the chromedriver //shift+rightclick chromedriver->copypath
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
			//step2: create an object for chromedriver class
			ChromeDriver ob=new ChromeDriver();
			//step3:Visiting website
			ob.get("http://www.google.com");
			
			log.info("visiting website");
			//maximize window
			ob.manage().window().maximize();
			
			log.info("maximize window");
			//refresh
			ob.navigate().refresh();
			
			
			//hold it for 3seconds
			Thread.sleep(3000);	//3000 milliseconds
			log.warn("closing");
			ob.quit();
}
}
