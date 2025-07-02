package Restaurant;

public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicial, double postre, double bebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = postre;
        this.valorBebida = bebida;
    }

    @Override
    public void calcularValorMenu(){
        valor = valorInicial + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return   "\n"+
                "\nMenú del Día\n" +
                "--------------\n"
               +"Plato: " + nombrePlato + "\n" +
               String.format("Valor del menú: %.2f\n", valor) +
               String.format("Valor Inicial: %.2f\n", valorInicial) +
               String.format("Postre: %.2f\n", valorPostre) +
               String.format("Bebida: %.2f\n", valorBebida);
    }
}
