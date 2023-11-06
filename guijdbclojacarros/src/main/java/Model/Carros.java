package Model;

public class Carros {
    //Atributos
    public String marca;
    public String modelo;
    public String ano;
    public String placa;
    public String valor;
    //Métodos
    public Carros(String marca, String modelo, String ano, String placa, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.placa = placa;
    }
    //getters and setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String string) {
        this.ano = string;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String string) {
        this.valor = string;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
