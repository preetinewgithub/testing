package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/externalresources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		/*
		 * // simple Alert
		 * 
		 * driver.findElement(By.id("alertBox")).click(); Alert simpleAlert =
		 * driver.switchTo().alert(); System.out.println(simpleAlert.getText());
		 * Thread.sleep(2000); simpleAlert.accept(); Thread.sleep(2000);
		 */

		/*
		 * // confirmation Alert
		 * 
		 * driver.findElement(By.id("confirmBox")).click(); Alert
		 * confirmationAlert = driver.switchTo().alert();
		 * System.out.println(confirmationAlert.getText()); Thread.sleep(2000);
		 * confirmationAlert.dismiss(); Thread.sleep(2000);
		 * System.out.println(driver.findElement(By.id("output")).getText());
		 */

		// prompt Alert

		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("ok");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());

		driver.quit();

	}

}
