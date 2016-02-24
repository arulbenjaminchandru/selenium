package gmaillogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailopener {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String str = driver.getTitle();
		System.out.println(str);
		//Replace <user_name> with your facebook username
		driver.findElement(By.id("email")).sendKeys("<user_name>");
		//Replace <password> with your facebook password
		driver.findElement(By.name("pass")).sendKeys("<password>");
		driver.findElement(By.id("u_0_v")).click();
		String str1 = driver.getTitle();
		System.out.println(str1);
	}
	}
