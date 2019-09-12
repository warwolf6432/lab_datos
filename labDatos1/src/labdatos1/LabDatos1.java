/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdatos1;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 *
 * @author Jack Howard Ortega
 */
public class LabDatos1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pinicial p=new Pinicial();
        p.setVisible(true);
        
		File file = new File("C:\\archivos\\estudiantes.txt");
		
		System.out.println(file.exists());
		
		System.out.println(file.isDirectory());
		
		System.out.println(file.lastModified());
		
		System.out.println(file.getName());
	
		System.out.println(file.getPath());
		
		System.out.println(file.length());
		
		System.out.println(file.canRead());
		
		System.out.println(file.canRead());
		
		System.out.println(file.length());
		
		System.out.println(file.mkdir());
 
                
                
		for (String string : file.list())
			System.out.println(string);
    }
  

    
}


