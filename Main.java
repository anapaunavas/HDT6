import java.io.IOException;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane; 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException, InterruptedException {
		Interaction view = new Interaction();
		FactoryConection<String, HashMap<String, Integer>> TypeHash = new FactoryConection<String, HashMap<String, Integer>>();
		int selection = view.Selection("Hash");

		Map<String, HashMap<String,Integer>> Products = TypeHash.FactoryMaps(selection);
		Operations(Products, view);	
	}

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
				// Agregar un producto a la colecci�n
				addNewProduct(Products, view);
				break;
				
			case 2:
				// Mostrar la categoria del producto.
				searchCategory(Products);
				break;
            }
}}
    }