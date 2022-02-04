package basics;

public class Cast {
    public static void main(String[] args) {
        //Problema 1: En un año se ubico 30 perritos en hogares
        //Cuantos perritos se ubicaron al mes?
        int monthlyDogs = 30/12;
        monthlyDogs = (int) (30.0/12.0);
        System.out.println(monthlyDogs); //En estos casos se quiere saber la estimacion, no la precision

        //Solucion 2: si tuvieramos double...
        double mD = 30.0/12.0;
        monthlyDogs = (int) mD;
        System.out.println(monthlyDogs); // Quita el punto decimal, NO hace redondeo

        //Problema 2: Se quiere saber el promedio de las calificaciones de 3 alumnos
        int []arr = new int[3];
        arr[0] = 8;
        arr[1] = 7;
        arr[2] = 10;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double result = (float)sum/ (float)arr.length; //poner -> (float) (sum/arr.length) -> es un error
        System.out.println(result);

    }
}
