
public class Celular {
    private String nombre, color;

    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Celular(){}

    public void llamar(){
        System.out.println("Llamando desde el celular "+nombre);
    }

    public void detallesCelular(Celular celular){
        System.out.println("---------Detalles-----------");
        System.out.println("Nombre: " +celular.nombre);
        System.out.println("Color: " +celular.color);
        System.out.println("----------------------------");

    }
}
