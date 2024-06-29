package automacaoSiteOrange.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import automacaoSiteOrange.driver.Driver;

public class Metodos extends Driver {
	
	public static void escrever(By elemento,  String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	
	public static void validarUrl(String urlEsperada) {
		assertEquals(driver.getCurrentUrl(),urlEsperada);
		System.out.println(urlEsperada);
	}
	
	public static void aguardar() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
		
	public static void validarTexto(By elemento, String textoEsperado) {
	    assertEquals(driver.findElement(elemento).getText(), textoEsperado);
	    System.out.println(textoEsperado);
	}

	
	
		
	}

