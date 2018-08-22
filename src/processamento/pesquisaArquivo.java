package processamento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class pesquisaArquivo {

	private ArrayList listaArq;
	private ArrayList arquivosEncontrados = new ArrayList();
	
	public ArrayList pesquisa(String destino) {
		
		File f = null;
		File[] paths;		
		
		try {  
			  
			f = new File(destino);
			paths = f.listFiles();
		 
			for(File path:paths) {
		 
				FileReader fr  = new FileReader(path.getPath());
				BufferedReader br = new BufferedReader(fr);

				
				
				while(br.ready()){ 
					String linha = br.readLine(); 
					
					if (linha.substring(4, 12).equals("00933218")) {
				
						System.out.println(path.getPath());
						arquivosEncontrados.add(path);						
						break;
					}
				} 
				br.close();	
			
		     }
			
		     
		  } 
			
		  catch(Exception e) {		     

			  e.printStackTrace();
			  
		  }
		
		return arquivosEncontrados;
	}
}
