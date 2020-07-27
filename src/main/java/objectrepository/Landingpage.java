package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	WebDriver driver;

	public Landingpage(WebDriver driver) {
		this.driver = driver;
	}

	By loginbutton = By.xpath("//a[@class='theme-btn register-btn']");
	By article = By.linkText("Articles");
	By about=By.linkText("About");
	By sectionname=By.xpath("//h2[text()='Featured Courses']");

	public WebElement loginpage() {
		return driver.findElement(loginbutton);
	}
	
	public WebElement article() {
		return driver.findElement(article);
	}
	public WebElement about() {
		return driver.findElement(about);
	}
	public WebElement section() {
		return driver.findElement(sectionname);
	}
}
