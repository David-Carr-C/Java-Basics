package basics.javadocs;

public class JavaDoc {
    /**
     * Descripcion: Funcion que convierte una cantidad de pesos mexicanos a dolares
     *
     * @param quantity Cantidad de pesos
     * @return regresa la cantidad actualizada en dolares
     * */
    public static double convertMXNToDollar(double quantity) {
        return quantity*0.049;
    }
    public static void main(String[] args) {
        System.out.println("Hello JavaDocs!");
        /**
         * @Author David Carrillo
         * */
        System.out.println("1100 pesos son "+convertMXNToDollar(1100)+" dolares");
    }

    //Settings -> Editor -> General -> Code Completion -> Show the documentation popup in * ms
    /*Generar javadocs:
    Tools -> Generate JavaDoc
    */
}
