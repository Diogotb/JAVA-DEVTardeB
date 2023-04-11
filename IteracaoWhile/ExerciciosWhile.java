package IteracaoWhile;

public class ExerciciosWhile {
    
    public void exercicio1() {
        //B[i]=A[i]
        int vetorA[]=new int[]{3,5,7,11,13};
        int vetorB[]=new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i];
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio2() {
        //B[i]=A[i]*2
        int vetorA[]=new int[]{3,5,7,11,13,17,23,29};
        int vetorB[]=new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i]*2;
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio3() {
        //B[i]=A[i]*A[i] // Math.pow(vetor,2)
        int vetorA[]=new int[]{3,5,7,11,13,17,23,29,31,37,43,47,53,59,61};
        int vetorB[]=new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i]*vetorA[i];
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio4() {
        //B[i]=Math.sqrt(A[i]) -> o vetor que vai receber o valor tem que ser double
        int vetorA[]=new int[]{3,5,7,11,13,17,23,29,31,37,43,47,53,59,61};
        double vetorB[]=new double[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=Math.sqrt(vetorA[i]);
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio5() {
        //B[i]=A[i]*i
        int vetorA[]=new int[]{3,5,7,11,13,17,23,29,31,37};
        double vetorB[]=new double[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i]*i;
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio6() {
        //C[i]=A[i]+B[i]
        int vetorA[]=new int[]{3,5,7,11,13,17,23,29,31,37};
        int vetorB[]=new int[]{5,7,11,13,17,23,29,31,37,3};
        int vetorC[]=new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorC[i]=vetorA[i]+vetorB[i];
            System.out.println("VetorC["+i+"]="+vetorC[i]);
            i++;
        }
    }
}
