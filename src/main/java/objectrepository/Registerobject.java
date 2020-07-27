package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerobject {
	public WebDriver driver;

	public Registerobject(WebDriver driver) {
		this.driver = driver;
	}

	By fullname = By.cssSelector("input[id='user_name']");
	By email = By.cssSelector("input[id='user_email']");
	By password = By.cssSelector("input#user_password");
	By confirmpass = By.cssSelector("input#user_password_confirmation");
	By promotion = By.cssSelector("input#user_unsubscribe_from_marketing_emails");
	By agree = By.cssSelector("input#user_agreed_to_terms");
	By submit = By.xpath("//input[@type='submit']");

	public WebElement fullName() {
		return driver.findElement(fullname);
	}

	public WebElement emailAddress() {
		return driver.findElement(email);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement confirmationPassword() {
		return driver.findElement(confirmpass);
	}

	public WebElement promotionCheckbox() {
		return driver.findElement(promotion);
	}

	public WebElement agree() {
		return driver.findElement(agree);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
}
