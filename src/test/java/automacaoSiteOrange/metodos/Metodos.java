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
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlCapturada, urlEsperada);
	}
	
	public static void aguardar() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, textoEsperado);
}}
