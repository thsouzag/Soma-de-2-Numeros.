import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
// Variavel
    int N1 ,N2 , Soma;
// processamento
    System.out.println("digite o primeiro numero ?");
    N1 = console .nextInt();
    System.out.println("digite o segundo numero ?");
     N2 = console .nextInt();
    Soma = N1 + N2;
// saida 
  System.out.println("\n a soma dos numeros e ! \t" + Soma);
   
  }
}