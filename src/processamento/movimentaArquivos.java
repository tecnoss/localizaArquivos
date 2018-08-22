package processamento;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.*;
import java.io.File;
import java.io.IOException;

public class movimentaArquivos {

	public void moveArquivos(ArrayList listadeArquivos, String destino) {
		
		Path destinationPath = Paths.get(destino);
		for (int i = 0; i < listadeArquivos.size(); i++) {
		
			Path sourcePath = Paths.get(listadeArquivos.get(i).toString());
			
			System.out.println(sourcePath);
			try {
			    Files.move(sourcePath, destinationPath,
			            StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
			    //moving file failed.
			    e.printStackTrace();
			}			
		}	
		
	}
	
	public void copiaArquivos(ArrayList listadeArquivos, String destino) {
		
		
		for (int i = 0; i < listadeArquivos.size(); i++) {
		
			File f = new File(listadeArquivos.get(i).toString());			
			
			Path destinationPath = Paths.get(destino + f.getName());
			Path sourcePath = Paths.get(f.getPath());
						
			System.out.println(sourcePath);
			try {
				Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
			//    //moving file failed.
			    e.printStackTrace();
			}			
		}	
		
	}	
}
