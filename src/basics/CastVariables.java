package basics;

public class CastVariables {
    public static void main(String[] args) {
        //Ejercicio:
        /*char c = ‘z’; conviertelo a int
        int i = 250; conviertelo a long y luego de long a short
        double d = 301.067; conviertelo a long
        int i = 100; súmale 5000.66 y conviertelo a float
        int i = 737; multiplícalo por 100 y conviertelo a byte
        double d = 298.638; divídelo entre 25 y conviertelo a long*/

        char c = (int)'z';
        System.out.println("El valor de "+c+" a entero es: "+(int)'z');

        int i = 250;
        long l = i;
        short s = (short) l;
        System.out.println("El valor de "+i+" se transformo en long: "+(long)i+", y despues en short: "+ (short)i);

        double d = 301.067;
        l = (long)d;
        System.out.println("El valor de "+d+" se convirtio a long: "+l);

        i = 100;
        int i2 = (int) (i+5000.66);
        float f = i2;
        System.out.println("El valor de "+i+" se le sumo 5000.66 resultando en: "+i2+ " y se convirtio a float: "+f);

        i = 737;
        i2 = i*100;
        byte b = (byte) i2;
        System.out.println("El valor de "+i+" se multiplico por 100, resultando: "+i2+ " y se convirtio a byte: "+b);//Interesante...

        d = 298.638;
        double d2 = d/25;
        l = (long)d2;
        System.out.println("El valor de "+d+ " se dividio entre 25, resultado: "+d2+" y posteriormente se convirtio a long: "+l);
    }
}
