package com.jenkinsPractice.login;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

	@Test
	
	public void loginvtigerTest() throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./data/Commondata.properties");
		Properties pboj= new Properties();
		pboj.load(fis);
		System.out.println("login to application");
		String Browser=pboj.getProperty("browser");
		String Url=pboj.getProperty("url1");
		driver.get(Url);
		System.out.println(Url);
		System.out.println("welcome to jenkins");
	}
}
