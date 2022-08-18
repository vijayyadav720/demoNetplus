package NetplusTest.demoNetplus;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.LocatorValues;
import constants.Values;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainExecution implements LocatorValues , Values {
static WebDriver driver;
static UtilClass util ;
static CallRespectiveCluster clusterCall ;

	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		util = new UtilClass(driver);
		clusterCall = new CallRespectiveCluster(driver,util);
		while(true)
		{
			driver.get(Values.url);
			if(driver.getTitle().equalsIgnoreCase("Privacy Error"))
			{
				util.doClick(ADVANCE_BUTTON);
				util.doClick(PROCEED_lINK);
			}
			System.out.println("Enter Cluster Value You Want To Open :-");
			Scanner sc=new Scanner(System.in);
			String str= sc.nextLine();
			
			str.toUpperCase();
			if(str.equals("EXIT"))
			{
				driver.quit();
				System.out.println("BROWSER CLOSED SUCCESSFULLY");
				break;
			}
			else
				{
					clusterCall.switchSelect(str);
				}
			
		}
		
		
	
		
		
		
		
		
	}

}
