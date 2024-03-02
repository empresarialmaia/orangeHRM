package automacaoSiteOrange.elementos;

import org.openqa.selenium.By;

public class ElementosLogin {
	
	public By username = By.xpath("//input[contains(@name,'username')]");
	public By password = By.xpath("//input[contains(@name,'password')]");
	public By btnLogin = By.xpath("//button[@type='submit']");

}
