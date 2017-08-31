package io.cronapp.projetoAutomatizacao.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	private FirefoxDriver driver;
	private WebElement elemento;

	public Login(FirefoxDriver driver){
		this.driver = driver;
	}
	
	public void esperaComponente(int segundos){
		driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
	}
	
	public void campoNome(){
		esperaComponente(15);
		elemento = driver.findElement(By.name("username"));

		elemento.sendKeys("insira o email aqui");





	public void campoSenha(){
		esperaComponente(1);
		elemento = driver.findElement(By.name("password"));
		elemento.sendKeys("insira a senha aqui");

	}

	public void btnEntrar(){
		esperaComponente(1);
		elemento = driver.findElement(By.name("password"));
		//inserir ID
		//elemento = driver.findElement(ByCssSelector("*[ui-id='"+uiId+"'] input:text"));
		elemento.submit();
	}
	
	public void btnNovoProjeto(){
		elemento = driver.findElementByCssSelector("workspaceview-newProject");
		elemento.click();
	}

	public void logar(){
		campoNome();
		campoSenha();
		btnEntrar();
	}
	
}
