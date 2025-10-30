public class Real extends Moeda{
    public Real(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return String.format("Real: %.2f", this.valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }
}