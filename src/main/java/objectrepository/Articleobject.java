package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Articleobject {
	WebDriver driver;

	public Articleobject(WebDriver driver) {
		this.driver = driver;

	}
	
	By readmore=By.xpath("//a[@title='JAVA INTERVIEW QUESTIONS' and text()='Read More']");
	
	public WebElement readmore() {
		return driver.findElement(readmore);
	}
}
