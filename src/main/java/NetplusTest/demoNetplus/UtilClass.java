package NetplusTest.demoNetplus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilClass {
private static WebDriver driver;

public UtilClass(WebDriver driver)
{
	this.driver = driver;
}

	public void doGetText(By locator)
	{
		int i = 1; // to get complain in a new line 
		List<WebElement> complaints = getElements(locator);
		for(WebElement e : complaints)
		{
			System.out.print(e.getText()+"  ");
			if(i==9)
			{
				System.out.println("---\n");
			}
			else if(i==18)
			{
				System.out.println("--\n");
			}
			i++;
		}
		
	
	}

	public void doSelect(By locator , String selectRow)
	{
		WebElement ele = getElement(locator);
		Select ss = new Select(ele);
		ss.selectByVisibleText(selectRow);
	}
	public void doSendKeys(By locator , String name)
	{
		getElement(locator).sendKeys(name);
	}
	public void doClick(By locator)
	{
		getElement(locator).click();
		
	}

	public List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
}


 