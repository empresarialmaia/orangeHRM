package automacaoSiteOrange.elementos;

import org.openqa.selenium.By;

public class ElementosLogin {
	
	public By username = By.xpath("//input[contains(@name,'username')]");
	public By password = By.xpath("//input[contains(@name,'password')]");
	public By btnLogin = By.xpath("//button[@type='submit']");
	public By msgErroUsuario = By.xpath("//p[text()='Invalid credentials']");
	public By msgErroUsuarioBranco = By.xpath("//span[contains(.,'Required')]");
	public By msgErroSenhaBranco = By.xpath("//span[contains(.,'Required')]");

	                                     
}
