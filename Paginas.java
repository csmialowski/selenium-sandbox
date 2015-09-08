package br.com.brenda.folha.pages;

import org.openqa.selenium.WebDriver;

public class Paginas {
	
	WebDriver driver;
	
	public PaginaInicial getPaginaInicial(WebDriver driver){
		return new PaginaInicial(driver);
		
		}
	
	public PaginaIlustrada getPaginaIlustrada(WebDriver driver){
		return new PaginaIlustrada(driver);
	}

	public PaginaInicial getNomeDaPaginaInicial(WebDriver driver){
		return new PaginaInicial(driver);
		
	}
	
	public PaginaIlustrada getNomeDaPaginaIlustrada(WebDriver driver){
		return new PaginaIlustrada(driver);
		
	}
}
