package model;

public class Dolar extends Moeda{
    private static final double USD_BRL = 5.38;

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return String.format("Dólar: %.2f", this.valor);
    }

    @Override
    public double converter() {
        return this.valor * USD_BRL;
    }
}