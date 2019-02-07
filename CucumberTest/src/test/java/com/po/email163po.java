package com.po;

import org.openqa.selenium.By;

public class email163po {
		//邮箱账号登录
		public static By EmailLogin=By.xpath("//*[@id='lbNormal']");
		//登录iframe
		public static By LoginIfame=By.xpath("//*[@id='loginDiv']/iframe[@frameborder='0']");
		//账号密码错误提示框
		public static By LoginError=By.xpath("//*[@class='ferrorhead']");
		//账号输入框
		public static By Username=By.name("email");
		//密码输入框
		public static By Pwd=By.name("password");
		//登录按钮
		public static By LoginButton=By.id("dologin");
		//退出按钮
		public static By quit=By.xpath("//*[@id='spnUid']");
		//写信
		public static By Write=By.xpath("//*[@id='_mail_component_24_24']");
		//收件人
		public static By shoujianren=By.xpath("//*[@id='_mail_component_24_24']");
		//主题
		public static By zhuti=By.xpath("//*[@maxlength='256']");
		//附件
		public static By fujian=By.xpath("//*[@size='1']");
		//写信内容iframe
		public static By iframe1=By.xpath("//*[@class='pY0']/div/div/div/div[2]/iframe[@frameborder='0']");
		//内容
		public static By neirong=By.xpath("//*[@contenteditable='true']");
		//发送按钮
		public static By SendButton=By.xpath("//*[@class='jp0']/div/span[1]");
		//发送成功字样
		public static By FTrue=By.xpath("//*[@class='tK1']");

}
