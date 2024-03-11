package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosLogin;
import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {
	
	ElementosLogin login = new ElementosLogin();
	
	public void loginUsuarioComSucesso() {
		Metodos.aguardar();
		Metodos.escrever(login.username, "Admin");
		
		
	}
	
	public void loginSenhaComSucesso() {
		Metodos.escrever(login.password, "admin123");
	}

	public void botaoLogin() {
		Metodos.clicar(login.btnLogin);
	}
	
	public void validacaoUrl() {
		Metodos.validarUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	
	public void loginUsuarioIncorreto() {
		Metodos.aguardar();
		Metodos.escrever(login.username, "Teste");
		

	}
	
	public void msgUsuarioIcorreto() {
		Metodos.validarTexto(login.msgErroUsuario, "Invalid credentials");
	}
}
