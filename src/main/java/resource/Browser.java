package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public WebDriver driver;
	public Properties p;
	public WebDriver initializeDriver() throws IOException {
		FileInputStream path = new FileInputStream(
				"C:\\Users\\Somasundaram\\eclipse-workspace\\Framework\\src\\main\\java\\resource\\Data");
		 p = new Properties();
		p.load(path);
		String browsername=p.getProperty("Browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Somasundaram\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			//firefox browser code
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshotPath(String testcasename,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String Destinationfile=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(source, new File(Destinationfile));
	}
	
	

}
