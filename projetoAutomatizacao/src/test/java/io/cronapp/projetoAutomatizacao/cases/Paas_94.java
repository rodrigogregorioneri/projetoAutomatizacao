package io.cronapp.projetoAutomatizacao.cases;

import org.junit.Test;

import io.cronapp.projetoAutomatizacao.pages.Login;
import io.cronapp.projetoAutomatizacao.pages.MenuSuperiorIcone;
import io.cronapp.projetoAutomatizacao.util.GerenciamentoDriver;

/**
 * @author tiago.ramos
 *
 * Class Paas_94.java
 * Responsavel por:
 * 
 */
public class Paas_94 extends GerenciamentoDriver{
	
	Login login = new Login(driver);
	MenuSuperiorIcone menu = new MenuSuperiorIcone(driver);
	
	@Test
	public void paas_94(){
		System.out.println("Caso de teste > Paas_94");
		login.logar();
		login.esperaComponente(15);
		menu.iconeAbrirProjeto();
		System.out.println("Caso de teste > Paas_94");
	}
	
	


}
