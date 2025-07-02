package juegoderoles;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegodeRoles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Personaje> personajes = new ArrayList<>();

        System.out.println("=== JUEGO DE ROLES ===");

        int cantidad = 0;
        while (cantidad < 2) {
            System.out.print("¿Cuántos personajes deseas crear?: ");
            if (sc.hasNextInt()) {
                cantidad = sc.nextInt();
                sc.nextLine();
                if (cantidad < 2) {
                    System.out.println("Debes crear al menos 2 personajes para iniciar el juego.");
                }
            } else {
                System.out.println("Ingresa un número válido.");
                sc.nextLine(); // limpiar entrada inválida
            }
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nCreando personaje #" + (i + 1));
            System.out.print("Nombre del personaje: ");
            String nombre = sc.nextLine();

            int tipo = 0;
            while (tipo < 1 || tipo > 3) {
                System.out.print("Selecciona tipo (1: Guerrero, 2: Mago, 3: Arquero): ");
                tipo = sc.nextInt();
                sc.nextLine();
            }

            switch (tipo) {
                case 1 ->
                    personajes.add(new Guerrero(nombre));
                case 2 ->
                    personajes.add(new Mago(nombre));
                case 3 ->
                    personajes.add(new Arquero(nombre));
            }

            System.out.println("Personaje " + nombre + " creado exitosamente.");
        }

        // Mostrar todos los personajes
        System.out.println("\nLista de personajes disponibles:");
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
        }

        // Elegir combatientes
        int p1 = 0, p2 = 0;
        while (p1 < 1 || p1 > personajes.size()) {
            System.out.print("\nElige el número del primer personaje para pelear: ");
            p1 = sc.nextInt();
        }

        while (p2 < 1 || p2 > personajes.size() || p2 == p1) {
            System.out.print("Elige el número del segundo personaje para pelear (distinto del primero): ");
            p2 = sc.nextInt();
        }

        Personaje jugador1 = personajes.get(p1 - 1);
        Personaje jugador2 = personajes.get(p2 - 1);

        System.out.println("\n️¡La pelea comienza entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");

        int ronda = 1;
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("--------------------");
            System.out.println("Ronda " + ronda);
            if (ronda % 2 == 1) {
                jugador1.atacar(jugador2);
            } else {
                jugador2.atacar(jugador1);
            }
            ronda++;
            System.out.println("Vida de " + jugador1.getNombre() + ": " + jugador1.getVida());
            System.out.println("Vida de " + jugador2.getNombre() + ": " + jugador2.getVida() + "\n");

            try {
                Thread.sleep(1000); // pausa de 1 segundo entre rondas
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
        }

        System.out.println("¡La batalla ha terminado!");
        if (jugador1.estaVivo()) {
            System.out.println("Ganador: " + jugador1.getNombre());
        } else {
            System.out.println("Ganador: " + jugador2.getNombre());
        }
        sc.close();
    }
}
