package basePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.environment;

public class BasePage {

	public WebElement getElement(String xpathValue) {
		return new WebDriverWait(environment.driver, Duration.ofSeconds(30)).until(driver -> driver.findElement(By.xpath(xpathValue)));
	}
	
	public boolean getDisplayElement(String xpathValue) {
		return getElement(xpathValue).isDisplayed();
	}
	
	public void elementSendKeys(String xpathValue, String text) {
		getElement(xpathValue).sendKeys(text);
	}
	
	public void clickElement(String xpathValue) {
		getElement(xpathValue).click();
	}
	public String getElementText(String xpathValue) {
		return getElement(xpathValue).getText();
	}
}
