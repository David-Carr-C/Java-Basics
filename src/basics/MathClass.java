package basics;

public class MathClass {
    public static void main(String[] args) {
        double x = 3.1;
        double y = 2;
        System.out.println(Math.ceil(x)); //Redondeo hacia arriba
        System.out.println(Math.floor(x)); //Redondeo hacia abajo
        System.out.println(Math.pow(y,2)); //pow
        System.out.println(Math.max(y,x)); //Numero mayor
        System.out.println(Math.sqrt(y)); //Raiz cuadrada/Square root
        System.out.println(Math.PI*Math.pow(y,2)); //Area de un circulo
        System.out.println((4.0/3.0)*Math.PI*Math.pow(y,3)); //Volumen de una esfera
    }
}
