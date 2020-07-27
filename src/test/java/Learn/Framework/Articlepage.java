package Learn.Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepository.Articleobject;
import objectrepository.Landingpage;
import resource.Browser;

public class Articlepage extends Browser{
	
	public static Logger log=LogManager.getLogger(Articlepage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
	}
	
	@Test
	public void article()  {
		Landingpage lp=new Landingpage(driver);
		lp.article().click();
		Articleobject ap=new Articleobject(driver);
		ap.readmore().click();
		log.info("Java interview question is opened");
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
