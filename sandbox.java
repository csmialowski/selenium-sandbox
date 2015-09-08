package br.com.brenda.folha.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sandbox {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		
		PaginaInicial pIni = new PaginaInicial(driver);

		pIni.navegarPaginaInicial();
		pIni.navegarMenuCultura();
		
		PaginaIlustrada pIlu = new PaginaIlustrada(driver);
		
		pIlu.navegarMenuMusica();
		
		BuscarNoticia bNot = new BuscarNoticia(driver);
		
		bNot.buscarShowFoda();
		
		Paginas pags = new Paginas();
		pags.getPaginaInicial(driver).navegarMenuCultura();
		
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}
	

}
