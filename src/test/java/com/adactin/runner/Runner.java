package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\AdaCucumber\\src\\test\\java\\com\\adactin\\feature\\Adafeature.feature",glue="com.adactin.stefdefinition")
public class Runner extends Base {
public static WebDriver drive;
	@BeforeClass
	public static void setup()
	{
		drive = browserLaunch("chrome");
	}
	
}
