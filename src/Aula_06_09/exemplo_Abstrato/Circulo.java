package Aula_06_09.exemplo_Abstrato;

public class Circulo extends Figura {

    private double raio;

    public Circulo(){
        setNomeFigura("Círculo");
    }
    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*Math.PI*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
