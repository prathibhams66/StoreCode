package com.amazon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import amazonutilities.Constans;
import amazonutilities.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public String st;
public WebDriver driver;
@Test
public void login() throws InterruptedException, IOException
{
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();


Thread.sleep(Constans.wait_in_secs);
GenericMethods GenMethod =new GenericMethods();
String st=GenMethod.PropertyReader("URL");


driver.get(st);
String st1=GenMethod.PropertyReader("Username");

String st2=GenMethod.PropertyReader("Password");
//System.out.println(st1);
//System.out.println(st2);
}
@AfterClass
public void f1()
{
	driver.quit();
}
}

