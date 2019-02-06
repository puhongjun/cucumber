package com.MethodEncapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	public static void moveTo(WebDriver driver,By by){
	WebElement element=driver.findElement(by);
	Actions moveto=new Actions(driver);
	moveto.moveToElement(element).perform();
	}

}
