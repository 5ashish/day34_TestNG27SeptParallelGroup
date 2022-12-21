package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.kuchV;


public class ClassWork1 {
	
	@Test(groups="Regression")
	public void a() throws InterruptedException
	{
		System.out.println("a");
	}
	
	@Test(groups="Smoke")
	public void b() throws InterruptedException
	{
		System.out.println("b");
	}
	@Test(groups="Regression")
	public void x() throws InterruptedException
	{
		System.out.println("x");
	}
	@Test(groups="Regression")
	public void p() throws InterruptedException
	{
		System.out.println("p");
		Thread.sleep(3000);	
	}
}
