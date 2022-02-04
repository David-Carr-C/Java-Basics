package basics;

public class VarOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        a*=b;
        System.out.println(a);
        a%=b;
        System.out.println(a);

        // a++ vs ++a
        a++; // <- se accede primero al dato de la variable y despues la variable 'a' se incrementa en 1 // postfijo
        ++a; // primero se incrementa la variable 'a' y se obtiene esta variable    // prefijo
    }
}
