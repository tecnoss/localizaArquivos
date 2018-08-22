package processamento;

import java.awt.List;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;



public class listaArquivos {

	private ArrayList listadeArquivos = new ArrayList();
	private Integer cont = 0; 

	public ArrayList localizaArquivo(String dir, String mascara) {

		File f = null;
		File[] paths;		
		
		try {  
			  
			f = new File(dir);
			paths = f.listFiles();
			//ArrayList listadeArquivos = new ArrayList(); 
		 
			for(File path:paths) {
		 
				if (path.isFile()) {
					if (path.getName().contains(mascara)) {				
					
						listadeArquivos.add(path);			
						System.out.println(++cont + " - " + path);
					}
				}
				else if (path.isDirectory()) {
					
					localizaArquivo(path.getPath(),mascara);
				}
		     }
			
		     
		  } 
			
		  catch(Exception e) {		     

			  e.printStackTrace();
			  
		  }			
		
		return listadeArquivos;		
		
	}
	
	
	
	
}
