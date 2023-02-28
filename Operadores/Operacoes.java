public class Operacoes {
    public void aritmetica() {
        System.out.println("===============================");
        int adicao = 5 + 2;
        System.out.println("Resultado da adição de 5 com 2: "
                + adicao);
        int subtracao = 5 - 2;
        System.out.println("Resultado da subtração de 5 pelo 2: "
                + subtracao);
        int multiplicacao = 5 * 2;
        System.out.println("Resultado da multiplicação de 5 pelo 2: "
                + multiplicacao);
        double divisao = 5.0 / 2.0;
        System.out.println("Resultado da divisão de 5 pelo 2: "
                + divisao);
        double moduloOuResto = 5.3 % 2.0;
        System.out.println("Resto da divisão de 5 pelo 2: "
                + moduloOuResto);
        System.out.println("Fim!");
        System.out.println("===============================");
    }

    public void atribuicao() {
        System.out.println("===============================");
        int umNumero = 5;
        umNumero += 2;
        System.out.println("Resultado da adição de 5 com 2: " + umNumero);
        umNumero = 5; // Voltando o valor para 5.
        umNumero -= 2;
        System.out.println("Resultado da subtração de 5 pelo 2: "
                + umNumero);
        umNumero = 5; // Voltando o valor para 5.
        umNumero *= 2;
        System.out.println("Resultado da multiplicação de 5 pelo 2: "
                + umNumero);
        umNumero = 5; // Voltando o valor para 5.
        umNumero /= 2;
        System.out.println("Resultado da divisão de 5 pelo 2: "
                + umNumero);
        umNumero = 5; // Voltando o valor para 5.
        umNumero %= 2;
        System.out.println("Resto da divisão de 5 pelo 2: " + umNumero);
        System.out.println("Fim!");
        System.out.println("===============================");
    }

    public void relacional() {
        System.out.println("===============================");
        // Faça testes alterando o valor das duas variáveis abaixo.
        int primeiraVariavel = 1;
        int segundaVariavel = 1;
        System.out.println("O valor da primeira variável é "
                + primeiraVariavel + " e o da segunda é "
                + segundaVariavel + ".");
        boolean primeiraVariavelEMaiorQueASegunda = primeiraVariavel > segundaVariavel;
        System.out.println("Primeira variável é maior que a segunda? "
                + primeiraVariavelEMaiorQueASegunda);
        boolean primeiraVariavelEMenorQueASegunda = primeiraVariavel < segundaVariavel;
        System.out.println("Primeira variável é menor que a segunda? "
                + primeiraVariavelEMenorQueASegunda);
        boolean primeiraVariavelEMaiorIgualASegunda = primeiraVariavel >= segundaVariavel;
        System.out.println("Primeira variável é maior ou igual a segunda? "
                + primeiraVariavelEMaiorIgualASegunda);
        boolean primeiraVariavelEMenorIgualASegunda = primeiraVariavel <= segundaVariavel;
        System.out.println("Primeira variável é menor ou igual a segunda? "
                + primeiraVariavelEMenorIgualASegunda);
        boolean primeiraVariavelEIgualASegunda = primeiraVariavel == segundaVariavel;
        System.out.println("Primeira variável é igual a segunda? "
                + primeiraVariavelEIgualASegunda);
        boolean primeiraVariavelEDiferenteDaSegunda = primeiraVariavel != segundaVariavel;
        System.out.println("Primeira variável é diferente da segunda? "
                + primeiraVariavelEDiferenteDaSegunda);
        System.out.println("Fim!");
        System.out.println("===============================");
    }
}
