package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomclass.Logintoactitime;
import pomclass.createtypeofwork;

public class testclasstypeofwork 
{
@Test
public void typework()
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	Logintoactitime l1=new Logintoactitime(driver);
	l1.logindetails();
	
	createtypeofwork l2=new createtypeofwork(driver);
	l2.typeofwork();
}
}
