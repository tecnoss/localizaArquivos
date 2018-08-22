package processamento;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class descompactaArquivos {

	public void descompacta(ArrayList listadeArquivos, String destino) {
		
		for (int i = 0; i < listadeArquivos.size(); i++) {
			
			File f = new File(listadeArquivos.get(i).toString());			
			
			String zipFilePath = destino + f.getName();
			
			String destDir = destino;
			
			unzip(zipFilePath, destDir);			
		}			
	}
	
	public void descompactaDeleta(ArrayList listadeArquivos, String destino) {
		
		for (int i = 0; i < listadeArquivos.size(); i++) {
			
			File f = new File(listadeArquivos.get(i).toString());			
			
			String zipFilePath = destino + f.getName();
			
			String destDir = destino;
			
			unzip(zipFilePath, destDir);
			
			File lixo = new File(destino + f.getName());
			lixo.delete();
		}			
	}	
	
	private static void unzip(String zipFilePath, String destDir) {
        File dir = new File(destDir);
        // create output directory if it doesn't exist
        if(!dir.exists()) dir.mkdirs();
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while(ze != null){
                String fileName = ze.getName();
                File newFile = new File(destDir + File.separator + fileName);
                System.out.println("Unzipping to "+newFile.getAbsolutePath());
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }	
}
