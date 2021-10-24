package com.sgtesting.seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assignment3 {
	public static WebDriver wb;

	static void LaunchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Java\\Web Driver\\chromedriver_win32\\chromedriver.exe");
			wb = new ChromeDriver();
			Thread.sleep(5000);
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

	static void logout() {
		try {
			wb.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
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

	static void createcustomer() {
		try {
			wb.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Aceenture");
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deletecustomer() {
		try {
//			wb.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
//			Thread.sleep(5000);
			wb.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]"))
					.click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class CreateDeleteCustomerChrome {

	public static void main(String[] args) {
		Assignment3.LaunchBrowser();
		Assignment3.navigate();
		Assignment3.login();
		Assignment3.createcustomer();
		//Assignment3.deletecustomer();
		Assignment3.logout();
		Assignment3.closeapplication();

	}

}
