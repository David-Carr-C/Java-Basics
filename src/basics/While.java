package basics;

public class While {
    public static String sos() {
        return ". . . _ _ _ . . .";
    }
    public static void turnOnOff(boolean []lamp) {
        lamp[0] = (lamp[0])? false: true;
    }
    public static void main(String[] args) {
        boolean []isOnOff = {false};
        int i = 0;

        turnOnOff(isOnOff); //Pass by reference
        while (isOnOff[0] && i<10) {
            System.out.println(sos());
            i++;
        }
    }
}