package automacaoSiteOrange.metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automacaoSiteOrange.driver.Driver;

public class Metodos extends Driver {
	
	public void escrever(By elemento,  String texto) {		
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
	    assertEquals(driver.findElement(elemento).getText(), textoEsperado);
	    System.out.println(textoEsperado);
	}

	public void esperarElementoVisivel(By elemento, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		
	}	
	
	public void printTela(String historia, String nomeDoArquivo) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./evidencias/" + historia + "/" + nomeDoArquivo + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
		
	}

