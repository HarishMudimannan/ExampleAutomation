package com.sgtesting.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class logoutlogin{
	public static WebDriver wb;
	static void LaunchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Java\\Web Driver\\chromedriver_win32\\chromedriver.exe");
			wb = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void navigate() {
		try {
			wb.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closeapplication() {
		try {
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void login(){
		try {
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(5000);
			wb.findElement(By.linkText("Logout")).click();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
public class Login_Logout {

	public static void main(String[] args) {
		logoutlogin.LaunchBrowser();
		logoutlogin.navigate();
		logoutlogin.login();
		logoutlogin.closeapplication();
		
	}

}
