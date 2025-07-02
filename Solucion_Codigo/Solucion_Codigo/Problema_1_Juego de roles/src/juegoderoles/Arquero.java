package juegoderoles;

public class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("-> " + nombre + " dispara una flecha a " + enemigo.getNombre());
        enemigo.defender(20);
        subirNivel();
    }

    @Override
    public void defender(int dano) {
        int danoReducido = dano - 5;
        if (danoReducido < 0) danoReducido = 0;
        vida -= danoReducido;
        System.out.println("- " + nombre + " esquiva parcialmente. Recibe " + danoReducido + " de daño. Vida: " + vida);
    }
}
