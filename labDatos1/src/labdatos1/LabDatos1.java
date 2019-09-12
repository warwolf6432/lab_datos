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
        // crea un objeto file, el constructor recibe la
		// ruta del archivo del cual quiero saber sus propiedades
		File file = new File("C:\\archivos\\estudiantes.txt");
		// para saber si el archivo no existe, devuelve true o false
		System.out.println(file.exists());
		// para saber si directorio, devuelve true o false
		System.out.println(file.isDirectory());
		// para saber la fecha de modificación
		System.out.println(file.lastModified());
		// para saber el nombre del archivo
		System.out.println(file.getName());
		// para saber la ruta
		System.out.println(file.getPath());
		// para saber el tamaño en bytes que ocupa en disco
		System.out.println(file.length());
		// para saber si es de lectura, devuelve true o false
		System.out.println(file.canRead());
		// para saber si es de escritura, devuelve true o false
		System.out.println(file.canRead());
		// para saber el tamaño en bytes que ocupa en disco
		System.out.println(file.length());
		// crea un directorio en disco, devuelve true o false, para esto la ruta no debe ser .txt
		// ejemplo: "C:\\archivos\\estudiantes" y crea el directorio estudiantes
		System.out.println(file.mkdir());
 
		// elimina el arhivo o directorio (debe estar vacio), devuelve true o false
		// System.out.println(file.delete());
 
		// si fuera un directorio, para saber los arhivos que contiene
		for (String string : file.list())
			System.out.println(string);
    }
  

    
}


