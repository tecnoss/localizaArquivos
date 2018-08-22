package processamento;

import java.io.File;

public class Diretorio {

	public void renomeiaDiretorio(String dir, String olddir, String newdir) {

		File f	  = null;
		File s    = null;
		File oldF = null;
		File newF = null;
		File[] path;
		File[] subpath;	
		
		try {  
			
			f    = new File(dir);
			path = f.listFiles();
		 
			for(File paths:path) {
		 
				if (paths.isDirectory()) {
					
					s       = new File(paths.getPath());
					subpath = s.listFiles();					
					
					for(File subpaths:subpath) {
						 
						if (subpaths.isDirectory()) {
							
							if (subpaths.getPath().contains(olddir)) {
							
								newF = new File(subpaths.getPath().substring(0, subpaths.getPath().indexOf(olddir)) + newdir);
								subpaths.renameTo(newF);					
							}
						}
				     }
				}
		     }
		  } 
			
		  catch(Exception e) {		     

			  e.printStackTrace();
			  
		  }			
		
				
		
	}	
	
	public void CriaDiretorio(String dirraiz, String newdir) {

		File f	  = null;
		File s    = null;
		File oldF = null;
		File newF = null;
		File[] path;
		File[] subpath;	
		
		try {  
			
			f    = new File(dirraiz);
			path = f.listFiles();
		 
			for(File paths:path) {
		 
				if (paths.isDirectory()) {
					
					newF = new File(paths.getPath() + newdir);
					newF.mkdirs();
					
					
					
/*					s       = new File(paths.getPath());
					subpath = s.listFiles();					
					
					for(File subpaths:subpath) {
						 
						if (subpaths.isDirectory()) {
							
							if (subpaths.getPath().contains(olddir)) {
							
								newF = new File(subpaths.getPath().substring(0, subpaths.getPath().indexOf(olddir)) + newdir);
								subpaths.renameTo(newF);					
							}
						}
				     }*/
				}
		     }
		  } 
			
		  catch(Exception e) {		     

			  e.printStackTrace();
			  
		  }			
		
				
		
	}		
}
