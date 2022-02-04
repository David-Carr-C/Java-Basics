package basics;

public class For {
    public static void printArr(int... integer) {
        for (int i = 0; i <integer.length ; i++) {
            System.out.println(integer[i]);
        }
    }
    public static void main(String[] args) {
        printArr(1,2,3,4,5,6,7,8,9);
    }
}
