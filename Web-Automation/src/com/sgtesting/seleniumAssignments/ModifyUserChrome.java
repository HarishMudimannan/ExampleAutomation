package com.sgtesting.seleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class usermodify {
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

	static void login() {
		try {
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createuser() {
		try {
			wb.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			wb.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			wb.findElement(By.name("firstName")).sendKeys("Demo");
			wb.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User");
			wb.findElement(By.name("email")).sendKeys("abs@gmail.com");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_usernameField']")).sendKeys("Harish");
			wb.findElement(By.name("password")).sendKeys("abs");
			wb.findElement(By.name("passwordCopy")).sendKeys("abs");
			Thread.sleep(6000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void modify() {
		try {
			wb.findElement(By.xpath("//span[text()='User, Demo']")).click();
			Thread.sleep(2000);
			wb.findElement(By.name("firstName")).clear();
			wb.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			wb.findElement(By.name("firstName")).sendKeys("Demo_modified");
			wb.findElement(By.name("lastName")).sendKeys("User_modified");
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteuser() {
		try {
			wb.findElement(By.xpath("//span[text()='User_modified, Demo_modified']")).click();
			Thread.sleep(2000);
			wb.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oa = wb.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logout() {
		try {
			wb.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ModifyUserChrome {
	public static void main(String[] args) {
		usermodify.LaunchBrowser();
		usermodify.navigate();
		usermodify.login();
		usermodify.createuser();
		usermodify.modify();
		usermodify.deleteuser();
		usermodify.logout();
		usermodify.closeapplication();
	}

}
