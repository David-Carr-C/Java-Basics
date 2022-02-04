package basics;

public class Apuntes {
    public static String sos() {
        return ". . . _ _ _ . . .";
    }
    public static void turnOnOff(boolean... lamp) {
        lamp[0] = true;
        if (lamp[0]) {
            return; //Break the function
            //break <label>
            //continue <label>
        }
        System.out.println(lamp.length);
    }
    public static void main(String[] args) {
        Boolean isOnOff = false;
        //LOS WRAPPERS NO PUEDEN SER PASADOS POR REFERENCIA DEBIDO A QUE ESTOS SON INMUTABLES
        //ARR
        turnOnOff(isOnOff, true, true , true);
        while (isOnOff) {
            System.out.println(sos());
        }

        //Wrapper - -- --- - - - --- - - - - -- - - -- --
        Integer integer = new Integer("10");
        System.out.println(integer.toString());
        //integer.getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(integer.getClass().getName());
        //ESTO ES UNA CLASE INMUTABLE, POR LO TANTO ES FINAL, Y CUANDO SE VUELVEN A CAMBIAR SUS ATRIBUTOS, POR EJEMPLO SU VALOR DE ENTERO, TODO EL OBJETO CAMBIA:
        integer = 20;
        //esto es lo mismo que
        integer = new Integer("20");
        integer.toString();
    }
}
//boolean... x
//Significa que se recibiran como parametros varios booleanos, y estos seran ingresados en un array