package BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityPackage.TestUtil;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/dell/Desktop/Java/FREECRMTest_1/src/main/java/ConfigPackage/config.properties");
		prop.load(ip);
	
	}
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
