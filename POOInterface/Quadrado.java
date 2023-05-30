package POOInterface;

public class Quadrado implements FigurasGeometricas{
    //assinou um contrato com FigurasGeometricas
    //obrigatoriamente declarar os métodos da classe FigurasGeo
    
    //atributos da classe Quadrado
    int lado;

    //construtor com parâmetro
    public Quadrado(int lado) {
        this.lado = lado;
    }

    //métodos importados de FigurasGeometricas
    @Override
    public double getArea() {
        int area = lado*lado;
        return area;
    }
    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }
    @Override
    public double getPerimetro() {
        int perimetro = 4*lado;
        return perimetro;
    }
    
    
}
