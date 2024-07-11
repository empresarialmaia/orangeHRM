package automacaoSiteOrange.metodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automacaoSiteOrange.driver.Driver;

public class Metodos extends Driver {
	
	public void escrever(By elemento,  String texto) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	
	public void validarUrl(String urlEsperada) {
		assertEquals(driver.getCurrentUrl(),urlEsperada);
		System.out.println(urlEsperada);
	}
		
		
	public void validarTexto(By elemento, String textoEsperado) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
		
	    assertEquals(driver.findElement(elemento).getText(), textoEsperado);
	    System.out.println(textoEsperado);
	}

	
	
		
	}

