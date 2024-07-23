package automacaoSiteOrange.elementos;

import org.openqa.selenium.By;

public class ElementosLogin {
	
	public By username = By.name("username");
	public By password = By.name("password");
	public By btnLogin = By.xpath("//button[@type='submit']");
	public By msgErroUsuario = By.xpath("//p[text()='Invalid credentials']");
	public By msgErroUsuarioBranco = By.xpath("//span[contains(.,'Required')]");
	public By msgErroSenhaBranco = By.xpath("//span[contains(.,'Required')]");
	public By textoUsuarioLogado = By.xpath("//h6[text()='Dashboard']");

	     
	
	
}
