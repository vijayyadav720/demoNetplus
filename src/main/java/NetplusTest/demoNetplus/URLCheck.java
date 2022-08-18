package NetplusTest.demoNetplus;

import org.openqa.selenium.WebDriver;

public class URLCheck {

	private WebDriver driver;	

	 public URLCheck(WebDriver driver )
	 {
		 this.driver = driver;
	 }

		public void getUrl(String url)
		{
			
			if(url.isBlank())
			{
				return;
			}
						
			else if (url.length()<=0)
			{
				return;
			}
			
			else if(url.startsWith("https") || url.startsWith("http") )
			{
			
				driver.get(url);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
			
			else if(url.indexOf("https") ==-1 || url.indexOf("http")==-1)
			{
				return;
			}
			else
			{
				System.out.println("Pass right Website Link");
				System.out.println("Link you want to open "+ url);
			}
			
			
		}

}
