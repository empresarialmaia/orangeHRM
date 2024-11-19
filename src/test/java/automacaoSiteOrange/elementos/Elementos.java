package automacaoSiteOrange.elementos;

import org.openqa.selenium.By;

public class Elementos {

	//Login Page
	 public By textoPaginaDeLogin= By.xpath("//h5[contains(.,'Login')]");

	 public By usuario = By.name("username");
	 public By senha = By.name("password");
	 public By btnLogin = By.xpath("//button[@type='submit']");
	 public By msgErroUsuario = By.xpath("//p[text()='Invalid credentials']");
	 public By msgErroUsuarioSenhaBranco = By.xpath("//span[contains(.,'Required')]");
	 public By textoUsuarioLogado = By.xpath("//h6[text()='Dashboard']");
	 
	 //Tela Principal Page
	 public By escreverCampoPesquisa = By.xpath("//input[@placeholder='Search']");
	 public By textoResultadoPesquisa = By.xpath("//a[contains(.,'Admin')]");
	 public By textoDigitadoPesquisa = By.xpath("//input[contains(@placeholder,'Search')]");
}
