package com.sgtesting.objectmapping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginLogoutOM {
	public static String filename = "D:\\Java\\Eclipse-workspace\\Web-Automation\\Object Map\\objectmap.properties";
	public static ObjectMap objmap = new ObjectMap(filename);
	public static WebDriver oBrowser = null;

	static void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Java\\Web Driver\\chromedriver_win32\\chromedriver.exe");
			oBrowser = new ChromeDriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void navigate() {
		try {
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closeApplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void login() {
		try {
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			//oBrowser.findElement(prop.getProperty('username');
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow() {
		try {
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logout() {
		try {
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class LoginLogoutDemo {
	public static void main(String[] args) {
		LoginLogoutOM.launchBrowser();
		LoginLogoutOM.navigate();
		LoginLogoutOM.login();
		LoginLogoutOM.minimizeFlyOutWindow();
//		LoginLogoutOM.logout();
//		LoginLogoutOM.closeApplication();

	}
}
