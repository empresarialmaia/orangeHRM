package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.Elementos;
import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {
	 	
	
	Metodos metodo = new Metodos();
	Elementos elemetoPage = new Elementos();
	

	public void login(String usuario, String senha) {
		metodo.esperarElementoVisivel(elemetoPage.usuario);
		metodo.escrever(elemetoPage.usuario, usuario);
		metodo.escrever(elemetoPage.senha, senha);

	}

	public void botaoLogin() {		
		metodo.clicar(elemetoPage.btnLogin);
		
	}

	public void validacaoUrlLogada(String historia, String nomeArquivo, String url) {
		metodo.esperarElementoVisivel(elemetoPage.textoUsuarioLogado);
		metodo.printTela(historia, nomeArquivo);
		metodo.validarUrl(url);
	
		
	}

	public void msgErroUsuarioSenha(String msg, String historia, String nomeAqrquivo) {	
		metodo.esperarElementoVisivel(elemetoPage.msgErroUsuario);
		metodo.validarTexto(elemetoPage.msgErroUsuario, msg);
		metodo.printTela(historia, nomeAqrquivo);
		
		
	}
	
	public void msgErroUsuarioEmBranco(String msg, String historia, String nomeArquivo) {		
		metodo.validarTexto(elemetoPage.msgErroUsuarioSenhaBranco, msg);
		metodo.printTela(historia, nomeArquivo);
		
		
	}
	
	public void msgErroSenhaEmBranco(String msg, String historia, String nomeArquivo) {		
		metodo.validarTexto(elemetoPage.msgErroUsuarioSenhaBranco, msg);
		metodo.printTela(historia, nomeArquivo);
		
		
		

	}
	
	public void textoPaginaLogin(String textoPaginaDeLogin) {
		metodo.esperarElementoVisivel(elemetoPage.textoPaginaDeLogin);
		metodo.validarTexto(elemetoPage.textoPaginaDeLogin, textoPaginaDeLogin);
	}
}
