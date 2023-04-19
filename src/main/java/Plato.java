public class Plato {
    String nombre;
    int precio;
    String[] ingredientes;
    String[] servicios;

    public Plato(String nombre, int precio, String[] ingredientes, String[] servicios) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.servicios = servicios;
    }

    public void valorarPlato(){
        System.out.println("Ingrese la valoracion del plato");
    }
    public int propina(int propina){
        return precio + propina;
    }

    public int getPrecio() {
        return precio;
    }
}