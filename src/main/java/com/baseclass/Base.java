package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {


	public static WebDriver drive;
	
	public static WebDriver browserLaunch(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			drive=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			drive=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			drive=new FirefoxDriver();
		}
		else
		{
			System.out.println("Not a valid Browser");
		}
		return drive;
	}
	
	public static void getUrl(String url)
	{
		drive.get(url);
	}
	
	public static void maximize()
	{
		drive.manage().window().maximize();
	}
	
	public static void implicitWait()
	{
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void input(WebElement element ,String value)
	{
		element.sendKeys(value);
	}
	
	public static void btnClick(WebElement element)
	{
		element.click();
	}
	
	public static void screenshot(String fname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) drive;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\admin\\eclipse-workspace\\AdaCucumber\\Snap\\"+fname+".png");
		FileUtils.copyFile(source,destination);
	}
	
	public static void dropdown(WebElement sEle, String val, String type)
	{
		Select s = new Select(sEle);
		
		if(type.equalsIgnoreCase("value"))
		{
			s.selectByValue(val);
		}
		else if(type.equalsIgnoreCase("visible text"))
		{
			s.selectByVisibleText(val);
		}
		else if(type.equalsIgnoreCase("index"))
		{
			s.selectByIndex(Integer.parseInt(val));
		}
		else
		{
			System.out.println("not valid type ");
		}
	}
}
