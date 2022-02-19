public class Calculadora{

    private int resultSoma;
    private int resultSub;


    public Calculadora() {
    }

    public int somar(int valor1, int valor2){
        this.resultSoma = valor1 + valor2;
        return resultSoma;
    }

    @Override
    public String toString() {
        return "\nSoma = " + resultSoma +
                "\nSubtração = " + resultSub;
    }
}