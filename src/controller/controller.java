package controller;

import java.awt.List;
import java.util.ArrayList;

import processamento.Diretorio;
import processamento.compactaArquivos;
import processamento.descompactaArquivos;
import processamento.listaArquivos;
import processamento.movimentaArquivos;
import processamento.pesquisaArquivo;


public class controller {

	private static ArrayList base;
	
	public static int processamento() {	
			

/*		System.out.println("Renomeando Diretorios...");
		System.out.println("****************************");
		Diretorio ren = new Diretorio();
		ren.renomeiaDiretorio("C:\\DADOS\\Atendimentos","3 - GMUD","5 - GMUD");
		System.out.println("****************************");*/
		
		System.out.println("Criando Diretorios...");
		System.out.println("****************************");
		Diretorio ren = new Diretorio();
		ren.CriaDiretorio("C:\\DADOS\\Atendimentos","\\9 - Backup\\");
		System.out.println("****************************");		
		
		
/*		System.out.println("Listando arquivos...");
		System.out.println("****************************");
		listaArquivos lista = new listaArquivos();
		base = lista.localizaArquivo("\\\\crcmsfsp02\\vale.ti$\\","perh_fpw_prog_desc_amscd_");
		//base = lista.localizaArquivo("\\\\crcmsfsp02\\\\vale.ti$\\\\2017\\\\20170925-P\\","perh_fpw_prog_desc_amscd_");
		System.out.println("****************************");
		
		
		System.out.println("Movendo arquivos...");
		System.out.println("****************************");
		movimentaArquivos copia = new movimentaArquivos();
		copia.copiaArquivos(base, "C:\\Temp\\AAAA\\");		
		System.out.println("****************************");
		
		System.out.println("Descompacta arquivos...");
		System.out.println("****************************");		
		descompactaArquivos unzip = new descompactaArquivos();
		unzip.descompactaDeleta(base, "C:\\Temp\\AAAA\\");	
		System.out.println("****************************");

		System.out.println("Pesquisa arquivos...");
		System.out.println("****************************");		
		pesquisaArquivo localiza = new pesquisaArquivo();
		base = localiza.pesquisa("C:\\Temp\\AAAA\\");	
		System.out.println("****************************");
		
		System.out.println("Compacta arquivos...");
		System.out.println("****************************");		
		compactaArquivos zip = new compactaArquivos();
		zip.compacta(base, "C:\\Temp\\AAAA\\");	
		System.out.println("****************************");*/
		
		return 0;
	}
	
	

}
