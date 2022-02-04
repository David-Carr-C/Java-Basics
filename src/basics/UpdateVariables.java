package basics;

public class UpdateVariables {
    public static void main(String[] args) {
        int salary = 1000;
        // -> Bono $200
        salary = salary + 200;  //Complete Code
        System.out.println(salary);
        salary += 200;          //Shortcut
        System.out.println(salary);

        // -> Descuento $50
        salary -= 50;
        System.out.println(salary);

        //Mini program
        //The employee has worked two hours more, so the enterprise will pay per hour $38
        //Then, He is going to buy some food. He is thinking about spend only $45
        int Salary = 1150;
        System.out.print("\nNext//His salary is: "+Salary);
        Salary = Salary + (30*2) - 45;
        System.out.println(", but at the end of the day he has: " + Salary);

        System.out.println();
        //Updating Strings
        String employeeName = "Carrillo";
        employeeName += " Castillo";
        System.out.println(employeeName);
        employeeName = "David " + employeeName;
        System.out.println(employeeName);
        System.out.println("My name's: " + employeeName);

    }
}
