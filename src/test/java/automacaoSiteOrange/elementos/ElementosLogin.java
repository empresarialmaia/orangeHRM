package automacaoSiteOrange.elementos;

import org.openqa.selenium.By;

public class ElementosLogin {
	
	public By username = By.xpath("//input[contains(@name,'username')]");
	public By password = By.xpath("//input[contains(@name,'password')]");
	public By btnLogin = By.xpath("//button[@type='submit']");
	public By msgErroUsuario = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

}
