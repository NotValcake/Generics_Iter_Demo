public class MainDemo {

    public static void main(String[] args) {
        int[] coords = new int[3];

        coords[0] = 4;
        coords[1] = 3;
        coords[2] = 5;

        Settlement s1 = new Settlement("A", 0, coords);
        s1.setFuelFromStart(0);

        coords = new int[3];
        coords[0] = 45;
        coords[1] = 5;
        coords[2] = 5;

        Settlement s2 = new Settlement("B", 1, coords);
        s2.setFuelFromStart(1);

        coords = new int[3];
        coords[0] = 6;
        coords[1] = 3;
        coords[2] = 10;

        Settlement s3 = new Settlement("C", 2, coords);
        s3.setFuelFromStart(-1);


        coords = new int[3];
        coords[0] = 8;
        coords[1] = 2;
        coords[2] = 34;

        Settlement s4 = new Settlement("D", 3, coords);
        s4.setFuelFromStart(0);

        Coppia<Settlement> c1 = new Coppia<>(s1, s2);
        Coppia<Settlement> c2 = new Coppia<>(s1, s3);
        Coppia<Settlement> c3 = new Coppia<>(s1, s4);

        System.out.printf("%s\n%s\n%s\n", c1.getMax().getName(), c2.getMax().getName(), c3.getMax());

    }

}
