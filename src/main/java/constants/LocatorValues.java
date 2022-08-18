package constants;

import org.openqa.selenium.By;

public interface LocatorValues {
	public static final By ADVANCE_BUTTON = By.xpath("//button[@id = 'details-button']");
	public static final By PROCEED_lINK = By.xpath("//a[@id='proceed-link']");
	
	public static final By USER_NAME = By.xpath("//div[@id='login']//input[@id='username']");
	public static final By PASSWORD = By.xpath("//div[@id='login']//input[@id='password']");
	
	public static final By DROP_DOWN_SELECT = By.xpath("//div[@id='login']//select[@name='dropdown']");
	
	public static final By SUBMIT_BUTTON = By.xpath("//input[@type='submit']");
	
	public static final By COMPLAINTS = By.xpath("//a[@href='olt_comp_upc.php']");
	
	public static final By TABLE_COMPLAIN = By.xpath("//div[@id='page-inner']//tbody//td");
	
	public static final  By LOGOUT = By.xpath("//ul[@id='main-menu']//a[text()=' Logout']");
	
	
	
}
