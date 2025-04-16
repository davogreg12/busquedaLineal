
import views.ShowConsole;

import java.util.Scanner;

import controllers.MetodosBusqueda;

import models.Person;


public class App {
    /* public static void main(String[] args) throws Exception {
        busquedaLineal busqueda = new busquedaLineal(); 
        busqueda.metodoBusquedaLineal(); // Con esto mostramos tooodo lo que esta en el otro archivo
    }   */

    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Person[] persons = new Person[7]; // Creamos un array de personas
        persons[0] = new Person(134, "Juanito");
        persons[1] = new Person(215, "Pedro"); 
        persons[2] = new Person(343, "Maria"); 
        persons[3] = new Person(476, "Jose"); 
        persons[4] = new Person(544, "Luis"); 
        persons[5] = new Person(697, "Ana"); 
        persons[6] = new Person(705, "Luisa");
        MetodosBusqueda mB = new MetodosBusqueda();

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Persona: " + persons[i].getName() + "             -Codigo: " + persons[i].getCode());
        }

        mB.metodoBusquedaLineal(persons);

        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {
            mB.showPersonByName(); // Llamar al método para buscar por nombre
            System.out.println("¿Desea buscar otra persona? (si/no): ");
            continuar = scanner.nextLine(); // Leer si el usuario quiere continuar
        }
    
        System.out.println("Programa finalizado.");
        
        // Llamar al método showPerson para buscar una persona
        //mB.showPerson();
        
    }  
    
}
