package Learn.Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepository.Landingpage;
import resource.Browser;

public class FeaturedCourse extends Browser{
	
	public static Logger log=LogManager.getLogger(FeaturedCourse.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void validateSectionName() {
		Landingpage lp=new Landingpage(driver);
		Assert.assertEquals(lp.section().getText(),"Featured Course");
		log.error("get section title");
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
