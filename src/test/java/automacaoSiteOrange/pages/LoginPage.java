package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosLogin;
import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {
	
	ElementosLogin login = new ElementosLogin();
	
	public void loginComSucesso() {
		Metodos.aguardar();
		Metodos.escrever(login.username, "Admin");
		Metodos.escrever(login.password, "admin123");
		
	}

	public void botaoLogin() {
		Metodos.clicar(login.btnLogin);
	}
	
	public void validacaoUrl() {
		Metodos.validarUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	
	
}
