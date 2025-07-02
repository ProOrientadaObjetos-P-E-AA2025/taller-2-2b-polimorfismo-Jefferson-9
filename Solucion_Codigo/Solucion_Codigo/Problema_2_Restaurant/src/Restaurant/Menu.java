package Restaurant;

 public abstract class Menu {
    protected String nombrePlato;
    protected double valor;
    protected double valorInicial;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }
    
    public abstract void calcularValorMenu();
    
    public double getValorMenu(){
        return valor;
    }

    @Override
    public String toString() {
        return "Menu{" + "nombrePlato=" + nombrePlato + ", valor=" + valor + '}';
    }        
}
