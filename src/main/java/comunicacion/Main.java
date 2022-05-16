package comunicacion;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");
        System.out.println(libro.interpretacion());
        System.out.println(libro.palabrasTotales(140));
    }
}
