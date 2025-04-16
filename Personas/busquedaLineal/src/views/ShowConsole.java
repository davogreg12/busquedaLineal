package views;

import java.util.Scanner;

public class ShowConsole {

    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        ShowBanner();
    }

    public void ShowBanner(){
        System.out.println("*** Metodos De Busqueda ***");
    }

    
    
    /* public int inputCode(){
        System.out.println("Digite el codigo a buscar: ");
        int code = scanner.nextInt();
        return code;
    } */

    public String inputName() {
        System.out.println("Digite el nombre a buscar: ");
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        return ""; 
    }
    
    public void showMessage(String message){
        System.out.println(message);
    }

    

    
}
