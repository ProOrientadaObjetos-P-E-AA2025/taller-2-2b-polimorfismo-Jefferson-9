package juegoderoles;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int experiencia;
    
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.experiencia = 0;
    }
    
    public abstract void atacar(Personaje enemigo);
    public abstract void defender(int dano);
    
    public void subirNivel() {
        experiencia += 15;
        if (experiencia >= 50) {
            vida += 20;
            experiencia = 0;
            System.out.println(nombre + " ha subido de nivel! Vida aumentada " + vida);
        }
    }
    
    public boolean estaVivo(){
        return vida > 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getVida() {
        return vida;
    }
}
