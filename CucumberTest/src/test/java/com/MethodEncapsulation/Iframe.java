package com.MethodEncapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Iframe {
	public static void iframe(WebDriver driver,By by){
		WebElement LIframe=driver.findElement(by);
		driver.switchTo().frame(LIframe);
	}

}
