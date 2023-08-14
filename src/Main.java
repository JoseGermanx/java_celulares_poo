// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular("LG", "Negro");
        celular1.llamar();

        Celular celular2 = new Celular("MOTOROLA", "Rojo");
        celular2.llamar();

        Celular imprimirDetalles = new Celular();

        imprimirDetalles.detallesCelular(celular1);
        imprimirDetalles.detallesCelular(celular2);

        }
    }
