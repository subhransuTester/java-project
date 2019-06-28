package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		//maximize
		driver.manage().window().maximize();
		//getTitle
		String title=driver.getTitle();
		System.out.println(title);
		if (title.equals("Google")) 
		{
		   System.out.println(title +" is displayed");	
		}
		else 
		{
             System.out.println(title +"is not displayed");
		}

	}

}
