package io.cronapp.projetoAutomatizacao.cases;

import org.junit.Test;

import io.cronapp.projetoAutomatizacao.pages.Login;
import io.cronapp.projetoAutomatizacao.pages.MenuSuperiorIcone;
import io.cronapp.projetoAutomatizacao.projetos.ProjetoWebGit;
import io.cronapp.projetoAutomatizacao.util.GerenciamentoDriver;

public class Paas_15 extends GerenciamentoDriver{
	
	Login login = new Login(driver);
	MenuSuperiorIcone menu = new MenuSuperiorIcone(driver);
	ProjetoWebGit projeto = new ProjetoWebGit();
	
	@Test
	public void paas_94(){
		System.out.println("Caso de teste > Paas_15");
		login.logar();
		login.esperaComponente(15);
		projeto.webGitFrontBack();
		
		
		
		
		menu.iconeAbrirProjeto();
		System.out.println("Caso de teste > Paas_94");
	}
	
	

}
