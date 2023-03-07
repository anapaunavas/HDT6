//@author Ana Paula Hong 22731

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class FileReader {

    /**
     * It reads a file and returns an array with the data of the file
     * 
     * @param file_name The name of the file to be read.
     * @return The method returns an array of strings.
     */
    public String[] read_file(String file_name) {
        ArrayList<String> data = new ArrayList<String>();
        String[] products;
        Path filePath = Paths.get("Archivos\\" + file_name + ".txt");
            	
    	try {
            // Try to read the file by the route.
            BufferedReader br = Files.newBufferedReader(filePath);
            String line;
            // Lecture line by line of the file.
            while ((line = br.readLine()) != null) {
                // Store the values in the array, separating by comas.
            	String separador = Pattern.quote("|");
            	String[] dataTemp = line.split(separador);
            	for(int i = 0; i < dataTemp.length; i++) {
            		data.add(dataTemp[i].trim());        		
            	}            	
            }
        } catch (IOException exception) {
        	System.out.println("El archivo no existe, debe ingresar un nombre valido :( )");
            System.out.println("Recordatorio: agregue el archivo a la carpeta de archivos");
        }
    	
    	// Creating a new array of strings with the size of the arraylist.
        products = new String[data.size()];	
    	for(int i = 0; i < products.length; i++) {
    		products[i] = data.get(i);
    	}
    	return products;
    }

    /**
     * It creates a new file in the folder "Archivos" with the name of the file_name parameter
     * 
     * @param file_name The name of the file to create.
     */
    public void new_file(String file_name) {
        File File;
        try {
            // ruta archivos
            File = new File("Archivos\\" + file_name + ".txt");
            // Verificar si existe
            if (File.exists()) {
                System.out.println("El archivo ya existe");
            } else if (File.createNewFile()) {// crear en caso de no existir
                System.out.println("Se ha creado el archivo exitosamente");
            }
        } catch (IOException exception) {// Throwable, excepcion padre (general) de todas las excepciones.
            System.err.println("No se ha creado el archivo :( )");
        }
    }
}
