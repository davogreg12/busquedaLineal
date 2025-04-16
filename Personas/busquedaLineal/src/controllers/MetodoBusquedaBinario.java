package controllers;

import java.util.jar.Attributes.Name;

import models.Person;

import views.ShowConsole;

public class MetodoBusquedaBinario {

    private Person[] people2;

    private ShowConsole pantalla;
    
    public MetodoBusquedaBinario(Person[] people2){
        this.people2 = people2;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("*** Metodo de Busqueda Binario ***");
    }

    /* private int findPersonByCode(int code) {
        int bajo = 0;
        int alto = people2.length - 1;

        while (alto >= bajo) {
            int central = (bajo + alto) / 2;

            if(people2[central].getCode() == code){
                return central;
            }

            if (people2[central].getCode() > code) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1; 
    }

    public void showPersonByCode(){
        System.out.println("Digite el codigo que quiere buscar: ");
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson != -1) {
            pantalla.showMessage("Persona encontrada: " + people2[indexPerson].toString());
        }
        if (indexPerson == -1){
            pantalla.showMessage("Persona no encontrada");
        }
    } */

    //ordenar aqui la lista
    public void ordenarListaNombre(){
        for(int i = 0; i < people2.length; i++){
            for(int j = i + 1; j < people2.length; j++){
                if(people2[i].getName().compareToIgnoreCase(people2[j].getName()) > 0){
                    Person temp = people2[i];
                    people2[i] = people2[j];
                    people2[j] = temp;
                }
            }
        }
    }

    private int findPersonByName(String name){
        int bajo = 0;
        int alto = people2.length - 1;
        while (alto >= bajo) {
            int central = (bajo + alto) / 2;

            if(people2[central].getName().equalsIgnoreCase(name)){
                return central;
            }
            if (people2[central].getName().compareToIgnoreCase(name) > 0 ) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1;
    }

    public void showPersonByName(){
        System.out.println("Ingrese el nombre que quiere buscar: ");
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson != -1) {
            pantalla.showMessage("Persona encontrada: " + people2[indexPerson].toString());
        }
        if (indexPerson == -1){
            pantalla.showMessage("Persona no encontrada");
        }
    }
}