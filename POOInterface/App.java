package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(8);//parametro para lado
        Retangulo figura2 = new Retangulo(10, 5);//2 parametros
        Trapezio figura3 = new Trapezio(4, 4, 5, 5);

        System.out.println(figura1.getNomeFigura()
                            +"\n Area: "+figura1.getArea()
                            +"\n Perímetro: "+figura1.getPerimetro());
        System.out.println(figura2.getNomeFigura()
                            +"\n Area: "+figura2.getArea()
                            +"\n Perímetro: "+figura2.getPerimetro());
        System.out.println(figura3.getNomeFigura()
                            +"\n Area: "+figura3.getArea()
                            +"\n Perímetro: "+figura3.getPerimetro());
    }
}
