//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int primeironumero = 10;
        int segundonumero = 20;

        int soma = primeironumero + segundonumero;
        int subtração = primeironumero - segundonumero;
        int multiplicação = primeironumero * segundonumero;
        int divisão = primeironumero / segundonumero;

        int somaViaFunção = somarValores(primeironumero , segundonumero);
        System.out.println("Valor soma " + somaViaFunção);
        int subtrairViaFunção = subtraiaValores(-50 ,  -50);
        System.out.println(subtrairViaFunção);
        int MultiplicaçãoViaFunção = multiplicarValores(primeironumero , segundonumero);
        System.out.println("Valor da Multiplicação " + MultiplicaçãoViaFunção);
        int dividirViaFunção = dividirValores(10 , 2);
        System.out.println("Valor da Divisão " + dividirViaFunção);


    }

    public static int somarValores(int numA, int numB){
        return numA + numB;

    }

    public static int subtraiaValores(int numA , int numB){

        if (numA < 0){
            numA = numA * -1;
        }

        return numA-numB;
    }

    public static int multiplicarValores(int numA, int numB) {
        return numA * numB;



}
    public static int dividirValores(int numA, int numB){
        return numA / numB;
    }
}