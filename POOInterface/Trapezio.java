package POOInterface;

public class Trapezio implements FigurasGeometricas{
    //atributos
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;
    //contrutor com 4 parametros
    public Trapezio(int baseMenor, int altura, int lado1, int lado2) {
        baseMaior = 10;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //contrutor com todos os parametros
    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //construtor vazio
    public Trapezio() {
    }
    
    //métodos do implements
    @Override
    public double getArea() {
        
        return (baseMaior+baseMenor)*altura/2;
    }
    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }
    @Override
    public double getPerimetro() {
      
        return lado1+lado2+baseMaior+baseMenor;
    }
    
    
    
}
