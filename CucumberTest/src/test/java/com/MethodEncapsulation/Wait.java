package com.MethodEncapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Wait {
	public static void XSWait(WebDriver driver,By by,int WaitTime){	
		
		WebDriverWait IframeWait=new WebDriverWait(driver,WaitTime);
		IframeWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		
	}

}
