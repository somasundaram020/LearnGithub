package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
		WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By email=By.xpath("//input[@id='user_email']");
	By password=By.cssSelector("input[id='user_password']");
	By login=By.name("commit");
	
	public WebElement emailid() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
	
}
	
