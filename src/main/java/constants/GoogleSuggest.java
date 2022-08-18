package constants;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggest {
	
	static String name;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement search =driver.findElement(By.cssSelector("div.SDkEP input"));
		search.clear();
		search.sendKeys("search Youtube videos haryana");
		Thread.sleep(5000);
		List<WebElement> listSearch = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(listSearch.size());
		for(WebElement e : listSearch) {
			 name = e.getText();
			System.out.println(name);
			if(name.equalsIgnoreCase("haryana and telangana"))
			{
				e.click();
				//driver.findElement(By.cssSelector("div.FPdoLc.lJ9FBc input[value='Google Search']")).click();
				break;
			}
			
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}
