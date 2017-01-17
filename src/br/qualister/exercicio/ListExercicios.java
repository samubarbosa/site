package br.qualister.exercicio;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import initial.conf.util.WebDriverStart;

public class ListExercicios {

	private WebDriver driver;

	@Before
	public void setUP() {
		this.driver = WebDriverStart.get();
		driver.manage().window().maximize();

	}

	@Test
	public void meuPrimeiroTest() {
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/12h/");
		WebElement segundoExericio = driver.findElement(By.linkText("Localizando Elementos"));
		//verificardor do elemento
		assertTrue(segundoExericio.getText().contains("Localizando Elementos")); 
		segundoExericio.click();
	}
	
	@After
	public void finaliza(){
		driver.quit();
		
	}

}
