import java.util.Scanner;

public class calculadora {
   static String escolha;
   public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
         do{
           System.out.println(" ");
           System.out.println(" <<<<< Calculadora >>>>");
           System.out.println("");
           System.out.println("_______________________________________________");
           System.out.println("||___________________________________________||");
           System.out.println("||                                           ||");
           System.out.println("|| (*) Multiplicação.                        ||");
           System.out.println("|| (/) Divisão.                              ||");
           System.out.println("|| (-) Subtração.                            ||");
           System.out.println("|| (+) Soma.                                 ||");
           System.out.println("|| (#) Sair.                                 ||");
           System.out.println("|| Digite o simbolo de uma opções desejadas: ||");
           System.out.println("||___________________________________________||");
           System.out.println("||___________________________________________||");
           escolha = entrada.nextLine();

  
           switch(escolha){
                case "*":
                   System.out.println("Digite um número:");
                   int n1m = entrada.nextInt();
                   System.out.println("Digite um número:");
                   int n2m = entrada.nextInt();
                   int m = n1m*n2m;
                   System.out.println("A multiplicação de " + n1m+  " com " + n2m +" é igual a " + m);break;
               
                case "-":
                   System.out.println("Digite um número:");
                   int n1su = entrada.nextInt();
                   System.out.println("Digite um número:");
                   int n2su = entrada.nextInt();
                   int sub = n1su-n2su;
                   System.out.println("A multiplicação de " + n1su+  " com " + n2su +" é igual a " + sub);break;
                   
                case "/":
                   System.out.println("Digite um número:");
                   int n1d = entrada.nextInt();
                   System.out.println("Digite um número:");
                   int n2d = entrada.nextInt();
                   int d = n1d/n2d;
                   System.out.println("A multiplicação de " + n1d+  " com " + n2d +" é igual a " + d);break;

                case "+":
                   System.out.println("Digite um número:");
                   int n1so = entrada.nextInt();
                   System.out.println("Digite um número:");
                   int n2so = entrada.nextInt();
                   int soma = n1so+n2so;
                   System.out.println("A multiplicação de " + n1so+  " com " + n2so +" é igual a " + soma);break;
                case "#":
                   System.out.println("Sessão finalizada!");break;
                default:
                     System.out.println("((( =>=>=>=> Opção inválida! <=<=<=<= )))");break;

           }

   }while(escolha != "#");
      
    }
}
