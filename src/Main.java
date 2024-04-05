import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual número você quer verificar?");
        int n = sc.nextInt();
        double calcOne = Math.sqrt(5 * Math.pow(n, 2) + 4);
        double calcTwo = Math.sqrt(5 * Math.pow(n, 2) - 4);
        if(calcOne == Math.floor(calcOne) || calcTwo == Math.floor(calcTwo)){
            System.out.println("Está na sequência de Fibonacci");
        }
        else{
            System.out.println("Não esta na sequência de Fibonacci");
        }
        sc.close();
    }
}
