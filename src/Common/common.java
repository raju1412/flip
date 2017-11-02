package Common;

import org.openqa.selenium.chrome.ChromeDriver;

public class common 
{
	public static void LaunchBrouswe()
	{
		String driver_path = "F:\\selenium jars\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver.driver = new ChromeDriver();
	}
	
	

}
