package basics;

public class Func {
    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public static double sphereVolume(double r) {
        return (4.0/3.0) * Math.PI * Math.pow(r,3);
    }
    public static double convertMXNToDollar(double quantity) {
        return quantity*0.049;
    }
    public static void main(String[] args) {
        System.out.println("Hello there!");
        System.out.println("El area de un circulo de 2 de radio es: "+circleArea(2));
        System.out.println("El area de una esfera de 2 de radio es: "+sphereArea(2));
        System.out.println("El volumen de una esfera de 2 de radio es: "+sphereVolume(2));

        System.out.println("Tengo 25 pesos que equivalen a "+convertMXNToDollar(25)+" dolares");
    }
}
