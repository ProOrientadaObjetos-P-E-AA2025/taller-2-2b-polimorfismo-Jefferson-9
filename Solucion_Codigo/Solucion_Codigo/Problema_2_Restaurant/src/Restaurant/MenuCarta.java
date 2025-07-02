package Restaurant;

public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String nombrePlato, double valorInicial, double guarnicion, double bebida, double adicional) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = guarnicion;
        this.valorBebida = bebida;
        this.porcentajeAdicional = adicional;
    }

    @Override
    public void calcularValorMenu() {
        valor = valorInicial + valorGuarnicion + valorBebida + (valorInicial * porcentajeAdicional / 100);
    }

    @Override
    public String toString() {
        return "\n"+
                "\nMenú a la Carta\n" +
                "----------------\n"
                + "Plato: " + nombrePlato + "\n"
                + String.format("Valor del menú: %.2f\n", valor)
                + String.format("Valor Inicial: %.2f\n", valorInicial)
                + String.format("Guarnición: %.2f\n", valorGuarnicion)
                + String.format("Bebida: %.2f\n", valorBebida)
                + String.format("%% Adicional: %.2f%%\n", porcentajeAdicional);
    }
}
