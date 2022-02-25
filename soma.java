import java.util.Scanner;

public class soma {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = entrada.nextInt();
        System.out.println("Digite um número:");
        int n2 = entrada.nextInt();
         
        int soma = n1+n2;
        
        System.out.println("A soma de " + n1+  " mais " + n2 +" é igual a " + soma);
    }
}
