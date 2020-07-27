package Learn.Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import jdk.internal.org.jline.utils.Log;
import objectrepository.Landingpage;
import objectrepository.Loginpage;
import resource.Browser;

public class Homepage extends Browser {

	public static Logger log = LogManager.getLogger(Homepage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
	}

	@Test(dataProvider = "getData")
	public void login(String username, String password) throws IOException {
		Landingpage lp = new Landingpage(driver);
		lp.loginpage().click();
		Loginpage lg = new Loginpage(driver);
		lg.emailid().sendKeys(username);
		lg.password().sendKeys(password);
		lg.login().click();
		log.info("Login test case is passed");

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];

		data[0][0] = "somasundaram20gmail.com";
		data[0][1] = "rahulshettycademy020";

		return data;
	}
	

	@AfterTest
	public void close() {
		driver.close();
	}

}
