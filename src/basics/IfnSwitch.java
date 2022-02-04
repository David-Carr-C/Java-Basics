package basics;

public class IfnSwitch {
    public static void main(String[] args) {
        boolean isBlueToothEnable = false; //Explanation
        if (isBlueToothEnable) {
            System.out.println("Archive sent!");
        } else {
            System.out.println("Error!");
        }

        char seleccion = 'c';
        if (seleccion=='a') {
            System.out.println("Seleccionaste A!");
            int a;
        } else if (seleccion=='b'){
            System.out.println("Seleccionaste B!");
        } else if (seleccion=='c'){
            System.out.println("Seleccionaste C!");
        } else {
            System.out.println("Error!");
        }
        //La variable 'a' fuera del scope no se puede acceder
        //a = 12; <- Error!

        System.out.println();
        boolean condicionA = 2 + 2 < 4; // falso
        boolean condicionB = 2 + 2 <= 5; // true

        boolean condicionC = "Pepito" == "Pepito"; // verdadero
        boolean condicionD = "Pepito" == "Pepe"; // falso

        System.out.println("4 es menor que 5, por lo tanto: "+condicionB);

        char select = 'b';
        switch (select) {
            case 'a':
                System.out.println("Hello A!");
                break;
            case 'b':
                System.out.println("Hello B!");
                //Sin el break, el programa seguira e imprimira/ejecutara los siguientes casos hasta el proximo break o cuando acabe el switch
            default:
                System.out.println("Hello!");
        }
        //Switch NO admite: boolean, long, float, double, Boolean, Long, Float y Double
        //Continue nos va a servir para dirigir directamente a la linea de la condicion del bucle

        //Java 12+
        /*
        switch (edad) {
        case 1 -> System.out.println("¡Tienes 1 año!");
        case 20 -> System.out.println("Tienes 20 años!");
        default -> System.out.println("Tu edad no es 1 ni 20");
        }
        */
    }
}
