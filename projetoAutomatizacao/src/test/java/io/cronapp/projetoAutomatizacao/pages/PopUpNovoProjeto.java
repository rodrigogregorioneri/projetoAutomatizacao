package io.cronapp.projetoAutomatizacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author tiago.ramos
 *
 * Class PopUpNovoProjeto.java
 * Responsavel por: Mapear os componentes do PopUp que eh apresentado para criacao de novo projeto. 
 * 
 */
public class PopUpNovoProjeto {
	
	private FirefoxDriver driver;
	private WebElement elemento;

	public PopUpNovoProjeto(FirefoxDriver driver){
		this.driver = driver;
	}
	
	// Componentes PopUp 1 
//	public void rbtNovoProjetoGluonsoft(){
//		elemento = driver.findElementByCssSelector("*[ui-id='newProject-btn-gluonsoft']");
//		elemento.click();
//	}

	public void rbtNovoProjetoMobile(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-btn-mobile']");
		elemento.click();
	}

	public void rbtNovoProjetoWeb(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-btn-web']");
		elemento.click();
	}

	public void assistenteNovoProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='assistant-newproject']");
		elemento.click();
	}

	public void btnProximoPopUp1(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-btn-next']");
		elemento.click();
	}

	// Componentes PopUp 2 
	public void rbtProjetoControleVersao(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-lbl-IsFromVersionControl']");
		elemento.click();
	}

	public void rbtCopiarProjetoDoModelo(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-lbl-ApplyTemplate']");
		elemento.click();
	}

//	public void btnAnteriorPopUp2(){
//		elemento = driver.findElementByCssSelector("*[ui-id='']");
//		elemento.click();
//	}

	public void btnProximoPopUp2(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-btn-FrameworkVersionNext']");
		elemento.click();
	}

	// Componentes PopUp 3
	public void insereNomeProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-projectName'] input:text");
		elemento.click();
	}

//	public void btnAnteriorPopUp3(){
//	elemento = driver.findElementByCssSelector("*[ui-id='']");
//	elemento.click();
//}

	public void btnCriarProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='newProject-btn-CreateProject']");
		elemento.click();
	}

	// Componentes PopUp 4 Modelo de Projeto
	public void templateJpaStringBootAngularJS(){
		elemento = driver.findElement(By.xpath(("//*[contains(text(),'JPA + Spring Boot + AngularJS')]")));
		elemento.click();
	}
	
	public void btnAvancar(){
		elemento = driver.findElementByCssSelector("*[ui-id='template-next-button']");
		elemento.click();
	}
	
	// Componentes PopUp 5 Parâmetros de Projeto
	public void rbtIncluirFront(){
		elemento = driver.findElementByCssSelector("*[ui-id='']");
		elemento.click();
	}

	public void btnFinalizar(){
		elemento = driver.findElementByCssSelector("*[ui-id='template-finish-button']");
		elemento.click();
	}	

}