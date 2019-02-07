package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BDDOperation.BDDSendemail;

import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

public class step163email {
	WebDriver driver;
	@当("^打开163网站$")
	public void open(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mail.163.com/");
		
	}
	@并且("^在账号输入框输入\"(.*?)\",密码输入框中输入\"(.*?)\",点击登录按钮$")
	public void sendemailAndpwd(String Uname,String Pwd){
		BDDSendemail.SendEmail(driver,Uname,Pwd);
	}

	@那么("^关闭浏览器$")
	public void quit(){ 
		driver.quit();
	}

}
