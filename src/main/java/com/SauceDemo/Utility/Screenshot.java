package com.SauceDemo.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	
	public static void screenshotMethod(WebDriver driver) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./screenshots/"+date+".jpg");
		FileHandler.copy(SourceFile, DestFile);
		
	}
}
