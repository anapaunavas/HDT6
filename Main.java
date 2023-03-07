//@author Ana Paula Hong 22731

import java.io.IOException;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane; 
import java.util.ArrayList;

/**
 * The class is called Main and it's a public class
 */
public class Main {
    /**
     * The function main() is the entry point of the program. It creates an object of the class
     * Interaction, which is used to interact with the user. It also creates an object of the class
     * FactoryConection, which is used to create the HashMap. The function main() also calls the
     * function Operations(), which is used to perform the operations on the HashMap
     */
    public static void main(String[] args)throws IOException, InterruptedException {
		Interaction view = new Interaction();
		FactoryConection<String, HashMap<String, Integer>> TypeHash = new FactoryConection<String, HashMap<String, Integer>>();
		int selection = view.Selection("Hash");

		Map<String, HashMap<String,Integer>> Products = TypeHash.FactoryMaps(selection);
		Operations(Products, view);	
	}

    /**
     * It reads a file, then it calls a function to fix the data, then it asks the user for a
     * selection, then it calls a function to add a new product, then it calls a function to search for
     * a category
     * 
     * @param Products Map<String, HashMap<String, Integer>>
     * @param view is an object of the class Interaction, which is a class that contains the methods
     * that are used to interact with the user.
     */
    private static void Operations(Map<String, HashMap<String, Integer>> Products, Interaction view)throws IOException, InterruptedException {
		FileReader dataFile = new FileReader();
		String[] values = {};
		values = dataFile.read_file("ListadoProducto");
		
		Products = refixData(values);
		int selection = 0;
		
		while(selection != 7) {
			selection = view.Selection("Operations");
			switch(selection) {
			case 1:
				// Agregar un producto a la coleccion
				addNewProduct(Products, view);
				break;
				
			case 2:
				// Mostrar la categoria del producto.
				searchCategory(Products);
				break;

            case 3:
                
            }

            
}}

    private static void searchCategory(Map<String, HashMap<String, Integer>> products) {
    }

    private static void addNewProduct(Map<String, HashMap<String, Integer>> products, Interaction view) {
    }

    private static Map<String, HashMap<String, Integer>> refixData(String[] values) {
        return null;
    }
    }