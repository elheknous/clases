import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ingredientes1 = {"Pan","Salchicha","Tomate","Palta"};
        String[] servicios1 = {"Servilleta"};
        Plato plato1 = new Plato("Completo",2000,ingredientes1,servicios1);

        System.out.println("El precio del plato es: "+ plato1.getPrecio());
        System.out.println("Ingrese la propina: ");
        int propina = sc.nextInt();
        int precioTotal = plato1.propina(propina);
        System.out.println("EL precio total mas propina es: "+precioTotal);



    }
}
