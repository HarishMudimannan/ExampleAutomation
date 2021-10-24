package com.sgtesting.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class FireFox {
	public static WebDriver gb = null;

	static void launch() {
		try {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Java\\Web Driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			gb = new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void navigatelink() {
		try {
			gb.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closedriver() {
		try {
			gb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class FireFoxDemo {

	public static void main(String[] args) {
		FireFox.launch();
		FireFox.navigatelink();
		FireFox.closedriver();
	}

}
