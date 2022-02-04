package basics;

public class Apuntes2 {
    public static void interrupt() {
        if(true) {
            return;
        }
        System.out.println("Hello world!");
    }
    public static void passByReference(int[] b){
        b[0] = 0;
    }
    public static void passByValue(int a) {
        a = 20;
    }
    public static void main(String[] args) {
        //Wrappers son inmutables
        Integer hola = new Integer("10");
        hola = 20;
        //es lo mismo que
        hola = new Integer("20");

        //Paso por valor
        int a = 10;
        passByValue(a);
        System.out.println(a); //10, it doesn't change

        //Paso por referencia
        int []b = {10};
        passByReference(b);
        System.out.println(b[0]);

        //Interrupt
        interrupt();

        //Goto = continue -> break -> return
        z:
        for (int i = 0; i <10 ; i++) {
            System.out.println("2");
            continue z;
        }
    }
}
