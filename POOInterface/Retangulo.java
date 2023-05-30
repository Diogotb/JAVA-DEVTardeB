package POOInterface;

public class Retangulo implements FigurasGeometricas {
    //atributos do retângulo
    int base;
    int altura;
    //contrutor
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos @Override
    @Override
    public double getArea() {
        return base*altura;
    }
    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }
    @Override
    public double getPerimetro() {
        return (base+altura)*2;
    }
    


}
