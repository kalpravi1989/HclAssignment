package amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil extends BaseClass {

	public void click(WebElement ele) {
		try {
			waitToClick(ele);
			ele.click();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void sendText(WebElement ele, String value) {
		try {
			waitToClick(ele);
			ele.sendKeys(value);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void switchWindow() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> ir = windows.iterator();
		while (ir.hasNext()) {
			driver.switchTo().window(ir.next());
		}
	}

	public void waitToClick(WebElement ele) {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ele));
	}
}
