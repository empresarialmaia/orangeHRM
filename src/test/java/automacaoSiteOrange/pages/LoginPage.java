package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosLogin;
import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {

	ElementosLogin login = new ElementosLogin();

	public void login(String usuario, String senha) {
		Metodos.aguardar();
		Metodos.escrever(login.username, usuario);
		Metodos.escrever(login.password, senha);

	}

	public void botaoLogin() {
		Metodos.clicar(login.btnLogin);
	}

	public void validacaoUrlLogada() {
		Metodos.validarUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

	public void msgErro() {
		Metodos.aguardar();
		Metodos.validarTexto(login.msgErroUsuario, "Invalid credentials");
	}
	
	
}
