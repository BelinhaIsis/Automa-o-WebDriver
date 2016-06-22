package automacao.quickloja.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	private static WebDriver driver;

	@Before
	public void setUp() throws Exception {
	   driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://quickloja.qualister.info/");
		driver.manage().window().maximize();
		driver.findElement(By.id("usuariologin")).sendKeys("teste");
		driver.findElement(By.id("usuariosenha")).sendKeys("123");
		driver.findElement(By.xpath("html/body/div/form/div[4]/div/button")).click();
	}

}
