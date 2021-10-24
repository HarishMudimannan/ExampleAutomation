package com.sgtesting.seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assignment6 {
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
			wb.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Accenture");
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createProject() {
		try {
			wb.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\"projectPopup_projectNameField\"]")).sendKeys("Project_QA");
			Thread.sleep(2000);
//			wb.findElement(By.xpath("//*[@id='ext-gen29']")).click();
//			Thread.sleep(3000);
//			wb.findElement(By.linkText("Aceenture")).click();
//			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void ModifyProject() {
		try {
			wb.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]"))
					.click();	
			Thread.sleep(2000);
			wb.findElement(By.xpath(
					"//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div"))
					.click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("/html/body/div[23]/div[2]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	static void deleteProject()
	{
		try {
			wb.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
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

public class ModifiyProject {

	public static void main(String[] args) {
		Assignment6.LaunchBrowser();
		Assignment6.navigate();
		Assignment6.login();
		Assignment6.createcustomer();
		Assignment6.createProject();
		Assignment6.ModifyProject();
//		Assignment6.deleteProject();
//		Assignment6.deletecustomer();
//		Assigment5.logout();
//		Assigment5.closeapplication();
	}

}
