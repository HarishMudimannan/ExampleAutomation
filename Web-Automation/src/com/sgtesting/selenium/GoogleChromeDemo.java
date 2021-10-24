package com.sgtesting.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ChromeBrowserTest {
	public static WebDriver wb = null;

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
}

public class GoogleChromeDemo {

	public static void main(String[] args) {
		ChromeBrowserTest.LaunchBrowser();
		ChromeBrowserTest.navigate();
		ChromeBrowserTest.closeapplication();
	}

}
