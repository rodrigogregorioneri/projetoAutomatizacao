package io.cronapp.projetoAutomatizacao.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author tiago.ramos
 *
 * Class MenuSuperiorIcone.java
 * Responsavel por: Mapear o menu superior da IDE CronApp composto de Icones.
 * 
 */

public class MenuSuperiorIcone {

	private FirefoxDriver driver;
	private WebElement elemento;

	public MenuSuperiorIcone(FirefoxDriver driver){
		this.driver = driver;
	}

	public void btnNovoProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='workspaceview-newProject']");
		elemento.click();
	}

	public void iconeAbrirProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='workspaceview-toolbar-openproject']");
		elemento.click();
	}

	public void iconeSalvarTodosProjetos(){  
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();
	}

	public void iconeExecutarProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='openProject-startTomcat']");
		elemento.click();
	}

	public void iconeDebugarProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='openProject-startDebugItem']");
		elemento.click();
	}

	public void iconePararProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='openProject-stopTomcatItem']");
		elemento.click();
	}

	public void iconeAbrirNavegador(){
		elemento = driver.findElementByCssSelector("*[ui-id='openProject-runBrowser']");
		elemento.click();		
	}

	public void iconeDebugPlay(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeDebugProximoPasso(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeDebugEntrar(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeDebugSair(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeRecarregarTomCat(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void icone(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeTerminal(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeDatasource(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeServiçosExpostos(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeConsole(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeBancoDeDadosNaNuvem(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeGluonsoft(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeSuporteOnline(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

	public void iconeIniciarAssistente(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();		
	}

}