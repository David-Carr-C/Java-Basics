package basics;

public class Arr {
    public static void main(String[] args) {
        String[] androidVersions;
        androidVersions = new String[4];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i < androidVersions.length ; i++) {
            System.out.println(androidVersions[i]);
        }

        System.out.println();
        String[][] cities = new String[4][2];
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (String city[] : cities) {
            for (String cityv2: city) {
                System.out.print(cityv2+" ");
            }
            System.out.print("\n");
        }

    }
}
