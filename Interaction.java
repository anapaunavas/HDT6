import javax.swing.JOptionPane;

/**
 * It's a class that handles the user's input
 */
public class Interaction {
    private int Options() {
		String[] options = {"HashMap", "TreeMap", "LinkedHashMap"};
		for(int i = 0; i < options.length; i++) {
			System.out.println((i+1) + ". " + options[i]);
		}
		return options.length;
	}

    /**
     * This function prints out the options for the user to choose from
     * 
     * @return The length of the array.
     */
    private int Operations() {
		String[] options = {"Agregar un producto a la coleccion", "Mostrar la categoria del producto", 
				"Mostrar los datos del producto, categoria y la cantidad de cada articulo", 
				"Mostrar los datos del producto, categoria y la cantidad de cada articulo, ordenadas por tipo",
				"Mostrar el producto y la categoria de todo el inventario",
				"Mostrar el producto y la categoria existentes, ordenadas por tipo","Salir"};
		for(int i = 0; i<options.length; i++) {
			System.out.println((i+1 + ". " + options[i]));
		}
		return options.length;
	}

    /**
     * It prints out the options for the user to choose from
     * 
     * @return The length of the array.
     */
    private int answer() {
		String[] options = {"Si", "No"};
		for(int i = 0; i<options.length; i++) {
			System.out.println((i+1 + ". " + options[i]));
		}
		return options.length;
	}

    /**
     * This function is used to get the user's selection from the menu
     * 
     * @param option is the name of the menu that will be displayed
     * @return The selection of the user.
     */
    public int Selection(String option) {
		boolean next_step = false;
		int selection = 0, value = 0;
		do {
			if(option.equals("Hash")) {
				value = Options();
			}else if(option.equals("Operations")) {
				value = Operations();
			}else if(option.equals("Answer")) {
				value = answer();
			}
			try {
				selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones: "));
				if(selection < 0 || selection > value) {
					System.err.println("Ingrese una opcion valida :( )");
				}else {
					next_step = true;
				}
			}catch(NumberFormatException e){
				System.err.println("Ingrese un valor numerico :( )");
			}
		}while(!next_step);
		return selection;
	}
}
