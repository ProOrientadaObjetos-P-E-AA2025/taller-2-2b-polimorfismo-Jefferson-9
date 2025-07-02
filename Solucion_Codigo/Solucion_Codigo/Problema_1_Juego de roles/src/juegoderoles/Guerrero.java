
package juegoderoles;

public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("+️ " + nombre + " ataca con su espada a " + enemigo.getNombre());
        enemigo.defender(30);
        subirNivel();
    }

    @Override
    public void defender(int dano) {
        int danoReducido = dano - 10;
        if (danoReducido < 0) danoReducido = 0;
        vida -= danoReducido;
        System.out.println("- " + nombre + " bloquea parte del daño. Recibe " + danoReducido + " de daño. Vida: " + vida);
    }
}
