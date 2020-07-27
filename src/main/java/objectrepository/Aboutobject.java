package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Aboutobject {

	public WebDriver driver;

	public Aboutobject(WebDriver driver) {
		this.driver = driver;

	}

	By joinnow = By.xpath("//a[@class='theme-btn' and text()='JOIN NOW']");
	
	public WebElement joinNow() {
		return driver.findElement(joinnow);
	}
}
