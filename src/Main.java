import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("### PRATICANDO WHILE ###");
        int op = -1;
        int resultado;
        int primeiro;
        int segundo;
        while (op != 0){

            System.out.println("1 - Somar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Dividir");
            System.out.println("4 - Subtrair");
            System.out.println("0 - Sair");

            op = sc.nextInt();

            if(op == 1){
                System.out.println("Você escolheu somar.");
                System.out.println("Digito o primeiro número para somar: ");
                primeiro = sc.nextInt();

                System.out.println("Digito o segundo número para somar: ");
                segundo = sc.nextInt();

                resultado =  primeiro + segundo;
                System.out.println("Soma do número: " + resultado);

            }else if (op == 2){
                System.out.println("Você escolheu multiplicar.");
                System.out.println("Agora digite o número: ");
                primeiro = sc.nextInt();

                System.out.println("Beleza,agora digite o segundo número: ");
                segundo = sc.nextInt();
                resultado = primeiro * segundo;
                System.out.println("Multiplicando2: " + resultado);

            } else if (op == 3) {
                System.out.println("Você escolheu dividir");
                System.out.println("digite o número:");
                primeiro = sc.nextInt();

                if(primeiro != 0){
                System.out.println("Beleza,digite o segundo:");
                segundo = sc.nextInt();
                resultado = primeiro / segundo;
                System.out.println("Divisão dos números: " + resultado);

                } else {
                    System.out.println("NÃO É POSSIVEL, VC É BURRO? VC TENTOU DIVIDIR ZERO? ");
                    System.out.println("DIGITE A PORRA DO NÚMERO INTEIRO  ");
                }

            } else if (op ==4 ){
                System.out.println("Você escolheu subtrair.");
                System.out.println("Digite o primeiro número:");
                primeiro = sc.nextInt();

                System.out.println("Beleza,digite o segundo:");
                segundo = sc.nextInt();
                resultado = primeiro - segundo;

                System.out.println("Resultado da subtração: " + resultado);

            } else {
                System.out.println("WTF? Você digitou ZERO??????");

            }
        }

        System.out.println(" FALOU ARROMBADO ATÉ MAIS.");

        sc.close();
    }
}
