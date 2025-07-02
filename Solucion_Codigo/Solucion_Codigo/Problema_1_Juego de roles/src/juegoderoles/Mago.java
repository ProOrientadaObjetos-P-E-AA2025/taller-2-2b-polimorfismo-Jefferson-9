package juegoderoles;

public class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("o " + nombre + " lanza un hechizo a " + enemigo.getNombre());
        enemigo.defender(25);
        subirNivel();
    }

    @Override
    public void defender(int dano) {
        vida -= dano;
        System.out.println("- " + nombre + " recibe " + dano + " de daño mágico. Vida: " + vida);
    }
}
