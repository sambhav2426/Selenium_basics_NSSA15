package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {  //POM class of a web page

	@FindBy (id = "logoutLink")
	private WebElement logoutLink;
	@FindBy (xpath = "//div[@class=\"switcherBackground\"]")
	private WebElement switcher;
	@FindBy (id = "taskSearchControl_field")
	private WebElement taskSearchField;
	@FindBy (xpath = "//span[@class=\"dashedLink\"]")
	private WebElement dashedLink;
	@FindBy (id = "container_users")
	private WebElement userContainer;
	@FindBy (xpath = "//div[@class=\"logoSwitcherText\"]")
	private WebElement switchtoActiPlans;
	@FindBy (xpath = "//div[@class=\"menu_icon\"]")
	private WebElement calendarIcon;
	@FindBy (xpath = "//div[text()=\"Corporate Work Schedule\"]")
	private WebElement workSchedule;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout() {
		logoutLink.click();
	}
	public void clickSwitcher() {
		switcher.click();
	}
	public void searchTasks(String task) {
		taskSearchField.sendKeys(task);
	}
	public void clickUserContainer() {
		userContainer.click();
	}
	public void clickSwitchActiPlan() {
		switchtoActiPlans.click();
	}
	public void clickCalendarIcon() {
		calendarIcon.click();
		workSchedule.click();
	}
}