package Aula_06_09.exemplo_Abstrato;

public class Retangulo extends Figura{

    private double base;
    private double altura;

    public Retangulo(){
        setNomeFigura("Retangulo");
    }
    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return (2*base) + (2*altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
