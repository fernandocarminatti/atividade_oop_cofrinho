package model;

public class Euro extends Moeda{
    private static final double EUR_BRL = 6.23;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return String.format("model.Euro: %.2f", this.valor);
    }

    @Override
    public double converter() {
        return this.valor * EUR_BRL;
    }
}