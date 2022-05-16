package comunicacion;

public class Main {
    public static void main(String[] args) {
        Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2,
                "no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
        String  comp = "pensamiento\n" +
                "La tortuga y la liebre\n" +
                "Esopo\n" +
                "2\n" +
                "no se debe uno burlar de los demas, ni presumir o ser vanidoso";

        System.out.println(fabula.toString());
    }
}
