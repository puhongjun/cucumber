package com.BDDOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.MethodEncapsulation.actionsMoveToElement;
import com.MethodEncapsulation.iframe;
import com.po.email163po;

public class BDDSendemail {

	public static void SendEmail(WebDriver driver,String Uname,String Pwd){
		//调用鼠标移动方法将鼠标移动到邮箱账号登录
		actionsMoveToElement.moveTo(driver,email163po.EmailLogin);
		//调用显示等待封装方法
		com.MethodEncapsulation.Wait.XSWait(driver,email163po.LoginIfame,10);
		//调用iframe封装方法 控制权交给iframe
		iframe.iframe(driver,email163po.LoginIfame);
		//driver.switchTo().frame(driver.findElement(email163.LoginIfame));
		//输入账号
		driver.findElement(email163po.Username).sendKeys(Uname);
		//输入密码
		driver.findElement(email163po.Pwd).sendKeys(Pwd);
		//点击登录按钮
		driver.findElement(email163po.LoginButton).click();

	}

}
