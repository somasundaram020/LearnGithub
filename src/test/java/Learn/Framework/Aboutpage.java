package Learn.Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepository.Aboutobject;
import objectrepository.Landingpage;
import objectrepository.Registerobject;
import resource.Browser;

public class Aboutpage extends Browser {
	
	public static Logger log=LogManager.getLogger(Aboutpage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
	}

	@Test
	public void Signup() {
		Landingpage lp = new Landingpage(driver);
		lp.about().click();
		Aboutobject ao = new Aboutobject(driver);
		ao.joinNow().click();
		Registerobject ro = new Registerobject(driver);
		ro.fullName().sendKeys("abcdefgh");
		ro.emailAddress().sendKeys("abcd@gmail.com");
		ro.password().sendKeys("12345");
		ro.confirmationPassword().sendKeys("12345");
		ro.promotionCheckbox().click();
		ro.agree().click();
		ro.submit().click();
		log.info("User Signup successfully");

	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
