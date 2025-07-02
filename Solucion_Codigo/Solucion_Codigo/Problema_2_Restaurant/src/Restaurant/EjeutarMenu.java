package Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class EjeutarMenu {
    public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<>();
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese su nombre: ");
        String name = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu a la carta: ");
        String platoCarta = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu del dia: ");
        String platoDia = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu de ninos: ");
        String platoNinos = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu economico: ");
        String platoEcon = sc.nextLine();
        System.out.println("");
        System.out.println("=== MENU PRINCIPAL ===\n");
        
        menu.add(new MenuCarta(platoCarta, 22, 5, 3, 10));
        menu.add(new MenuDia(platoDia, 10, 2, 1.5));
        menu.add(new MenuNinos(platoNinos, 5, 1, 2));
        menu.add(new MenuEconomico(platoEcon, 7, 20));

        Cuenta cuenta = new Cuenta(name, menu);
        
        cuenta.calcularSubtotal();
        cuenta.calcularTotal();
        
        System.out.println(cuenta);
    }
}
