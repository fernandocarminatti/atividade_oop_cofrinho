import java.util.Objects;

public abstract class Moeda {
    double valor;
    abstract String info();
    public abstract double converter();

    public Moeda(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(),valor);
    }
}