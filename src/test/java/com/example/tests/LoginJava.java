package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginJava {
  private WebDriver driver;
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginJava() throws Exception {
    driver.get("http://quickloja.qualister.info/");
    driver.findElement(By.id("usuariologin")).clear();
    driver.findElement(By.id("usuariologin")).sendKeys("teste");
    driver.findElement(By.id("usuariosenha")).clear();
    driver.findElement(By.id("usuariosenha")).sendKeys("123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    
    }
  }


 

