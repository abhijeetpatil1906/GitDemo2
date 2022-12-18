package BaseLayer1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
	protected static WebDriver driver;
	protected static Properties prop;
	
	public BaseClass2()  {
		prop=new Properties();
		
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//configLayer//config.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
				
	}
	
	}
