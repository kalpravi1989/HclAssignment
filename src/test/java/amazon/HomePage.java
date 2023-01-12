package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SeleniumUtil {

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchicon;

	public void searchItem(String text) {
		sendText(searchbox, text);
		click(searchicon);

	}

	@FindBy(xpath = "//span[@class='a-dropdown-label']")
	WebElement dropdown;

	@FindBy(xpath = "//a[contains(text(),'Avg. Customer Review')]")
	WebElement avgrating;

	public void clickAvgRating() {
		click(dropdown);
		click(avgrating);
	}

	@FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")
	WebElement highRatingElement;

	public void selecthighRatingtv() {
		click(highRatingElement);
	}

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;

	public void addItemToCart() {
		switchWindow();
		click(addToCart);
	}

	@FindBy(xpath = "//div[@id='nav-cart-count-container']/span")
	WebElement cartItem;

	public void checkitemInCart() {
		String itemNo = cartItem.getText();
		if (itemNo.contentEquals("1")) {
			System.out.println("item added to cart successfully");
		} else {
			System.out.println("item not added to cart");
		}
	}

	public void AllFn(String text) {
		searchItem(text);
		clickAvgRating();
		selecthighRatingtv();
		addItemToCart();
		checkitemInCart();
	}
}
