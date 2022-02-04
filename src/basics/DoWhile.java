package basics;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int r = -1;
        do {
            System.out.println("Selecciona la opcion deseada");
            System.out.println("1) Movies");
            System.out.println("2) Series");
            System.out.println("0) Exit");
            r = scanner.nextInt();
            if (r==0){
                isExit = true;
            }
        }while (!isExit);
        System.out.println("Se termino el programa");
    }
}
