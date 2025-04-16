package controllers;

import java.util.Arrays;

import models.Person;

import views.ShowConsole;


public class MetodosBusqueda {
    /* public void metodoBusquedaLineal() {

        int	[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 6, 10 };
        int numeroBuscar = 6;

        System.out.println("Aquí está nuestra lista --> " + Arrays.toString(lista));

        System.out.println(); 
        System.out.println("El número a buscar es: <" + numeroBuscar + ">"); //El <> es solo para que se vea más bonito y resalte más :v

        //System.out.println(Arrays.toString(lista));  //La parte de Arrays.toString(nombre de la lista) es claaave pa imprimir la lista.
                                                       //Si uso println(lista) no me imprime la lista, como q imprime como q la direccion en la memoria de la lista :v


        for(int i = 0 ; i < lista.length; i++){
            if(lista[i] == numeroBuscar){
                System.out.println("El número: <" + numeroBuscar + ">"+ ", está en la posición: " + i);
            }  //si agregara un break y hubiera un numero duplicado no lo podria ver, quite el break para que se vea mas completo el codigo :b
        }

        System.out.println();

        System.out.print("["); 
        for(int i = 0 ; i < lista.length; i++){  //Esta parte es solo pa imprimir la lista de una forma mas bonita 
            if (lista[i] == numeroBuscar){
                System.out.print( "<|" + numeroBuscar + "|> ");  //aqui hago que el numero que se busca se pueda ver facilmente donde estaba
                if ( i < lista.length -1){
                    System.out.print(", ");  //habia intentado poner un 6 al final pero salia una coma de mas, lo arreglo haciendo lo mismo que abajo xd
                }
            }else{
                System.out.print(lista[i]);  //aqui solo estoy imprimiendo la lista
                if( i < lista.length -1){
                    System.out.print(", ");  //esto es solo pa que al final no salga una coma demas, antes estaba en la parte de arriba, pero no se veia bien 
                }
            }
        }
        System.out.print("]"); //pa que la lista este entre corchetes
    }  */

    private ShowConsole showConsole;

    private Person[] people;

    public void metodoBusquedaLineal(Person[] persons) {

        showConsole = new ShowConsole(); 
        this.people =  persons;
        //showPerson();
        showPersonByName();
    }

    public int busquedaLinea(int[] lista, int numeroBuscar) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numeroBuscar) {
                return i; // Devuelve la posición del número encontrado
            }
        }
        return -1; // Devuelve -1 si no se encuentra el número
    } 

    

        /**
         * 
         * @param code a buscar
         * @return posicion de la persona encontrada
         */
    
    public int findPersonByCode(int code){
        for(int i = 0; i <people.length; i++){
            if(people[i].getCode() == code){
                return i; 
            }
        }   
        return -1;
    }

    /* public void showPerson(){
        int codeToFind = showConsole.inputCode();
        int indexPerson= findPersonByCode(codeToFind);
        if(indexPerson != -1){
            showConsole.showMessage("Persona con codigo: " + "<<" + codeToFind + ">>" + " encontrada ");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona no encontrada");
        }
    }    */

        /**
         * 
         * @param name a buscar
         * @return posicion de la persona encontrada
         */

    public int findPersonByName(String name){
        for (int i = 0; i < people.length; i++){
            if (people[i].getName().equals(name)){  //IMPORTANTE, CUANDO NO SON NUMEROS USAR EL .equals, NO el ==
                return i; 
            }
        }
        return -1;
    }

    public void showPersonByName(){
        String nameToFind = showConsole.inputName();
        int namePerson= findPersonByName(nameToFind);
        if ( namePerson != -1){
            showConsole.showMessage("Persona con nombre: " + "<<" + nameToFind + ">>" + " encontrada ");
            showConsole.showMessage(people[namePerson].toString());
        }else{
            showConsole.showMessage("Persona no encontrada");
        }
    }
    
}
