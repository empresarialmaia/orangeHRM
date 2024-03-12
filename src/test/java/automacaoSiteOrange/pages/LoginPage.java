package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosLogin;
import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {
	
	ElementosLogin login = new ElementosLogin();
	
	public void loginUsuarioComSucesso(String usuario) {
		Metodos.aguardar();
		Metodos.escrever(login.username, usuario);
		
		
	}
	
	public void loginSenhaComSucesso(String senha) {
		Metodos.escrever(login.password, senha);
	}

	public void botaoLogin() {
		Metodos.clicar(login.btnLogin);
	}
	
	public void validacaoUrl(String url) {
		Metodos.validarUrl(url);
	}
	
	public void loginUsuarioIncorreto(String usuarioErrado) {
		Metodos.aguardar();
		Metodos.escrever(login.username, usuarioErrado);
		

	}
	
	public void msgUsuarioIncorreto(String msgUsuarioIncorreto) {
		Metodos.validarTexto(login.msgErroUsuario, msgUsuarioIncorreto);
	}
}
