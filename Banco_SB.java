import java.util.Scanner;

public class Banco_SB {

    public static void esperar() throws InterruptedException{
        Thread.sleep(2000);

    }

    public static void espacamento(){
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException{
        
        int[] saldo = new int[1];
        saldo[0] = 0;

        System.out.println("Bem-vindo ao System Brasil");
        
        while(true){ 

            System.out.println("O que voce deseja fazer");
            System.out.println("--------------------");
            System.out.println(" ");
            System.out.println("1 - Ver seu saldo");
            System.out.println("2 - Fazer um saque");
            System.out.println("3 - Fazer um deposito");
            System.out.println("4 - Sair");
            System.out.println(" ");
            System.out.println("--------------------");
            
            
            if (!sc.hasNextInt()){
                System.out.println("--------------------");
                System.out.println("Digite Apenas numeros!");
                System.out.println("--------------------");
                sc.next();
                esperar();
                espacamento();
                continue;
            }

            int op = sc.nextInt();

          
            
            if (op > 4){
                espacamento();
                System.out.println("--------------------");
                System.out.println("Numero invalido tente novamente");
                System.out.println("--------------------");
                esperar();
                espacamento();
                continue;
            }else if (op < 1){
                espacamento();
                System.out.println("--------------------");
                System.out.println("Numero invalido tente novamente");
                System.out.println("--------------------");
                esperar();
                espacamento();
                continue;
            }

            switch (op) {
                case 1:
                    espacamento();
                    System.out.println("--------------------");
                    System.out.println("Saldo atual");
                    System.out.println(saldo[0]);
                    System.out.println("--------------------");
                    esperar();

                    break;
                case 2: 
                    System.out.println("--------------------");
                    System.out.println("Quanto deseja retirar?");
                    System.out.println("Seu saldo atual é: " + saldo[0]);

                    if (!sc.hasNextInt()){
                        System.out.println("--------------------");
                        System.out.println("Digite Apenas numeros!");
                        System.out.println("--------------------");
                        esperar();
                        espacamento();
                        sc.next();
                        continue;
                    }

                    int retirou = sc.nextInt();

                    if (saldo[0] > retirou){
                        saldo[0] = saldo[0] - retirou;
                        System.out.println("--------------------");
                        System.out.println("Voce retirou "+ retirou + " Agora seu saldo é " + saldo[0]);
                        System.out.println("--------------------");
                        esperar();
                        espacamento();
                    }else if(retirou == saldo[0]){
                        saldo[0] = 0;
                        System.out.println("--------------------");
                        System.out.println("Voce retirou "+ retirou + " Agora seu saldo é " + saldo[0]);
                        System.out.println("--------------------");
                        esperar();
                        espacamento();
                    }
                    
                    if (saldo[0] < retirou){
                        System.out.println("--------------------");
                        System.out.println("Quantidade desejada indisponivel (saldo insuficiente!)");
                        System.out.println("Seu saldo é de: " + saldo[0]);
                        System.out.println("--------------------");
                        esperar();
                        espacamento();
                    }

                    if (saldo[0] <= -1){
                        saldo[0] = 0;
                    }
                    break;

                case 3:

                    System.out.println("--------------------");
                    System.out.println("Voce escolheu depositar");
                    System.out.println("Digite a quantidade desejada");

                    if (!sc.hasNextInt()){
                        System.out.println("--------------------");
                        System.out.println("Digite Apenas numeros!");
                        System.out.println("--------------------");
                        esperar();
                        espacamento();
                        sc.next();
                        continue;
                    }

                    int deposito1 = sc.nextInt();

                    System.out.println("--------------------");
                    System.out.println("Voce depositou " + deposito1);
                    saldo[0] += deposito1;

                    System.out.println("Saldo atual é de: " + saldo[0]);
                    System.out.println("--------------------");
                    esperar();
                    espacamento();

                case 4:
                    System.out.println("--------------------");
                    System.out.println("Voce tem certeza que deseja sair?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    System.out.println("--------------------");

                    if (!sc.hasNextInt()){
                        System.out.println("--------------------");
                        System.out.println("Digite Apenas numeros!");
                        System.out.println("--------------------");
                        sc.next();
                        esperar();
                        espacamento();
                        continue;
                    }

                    int sairr = sc.nextInt();
                    boolean esc = true;

                    while (esc){
                        if (sairr == 1){
                            System.out.println("Saindo....");
                            esperar();
                            return;
                        }
                        else if(sairr == 2){
                            System.out.println("--------------------");
                            System.out.println("Retornando");
                            esc = false;
                            esperar();
                            espacamento();
                            System.out.println("--------------------");
                        }
                        else{
                            System.out.println("--------------------");
                            System.out.println("Digite 1 ou 2.");
                            esc = false;
                            esperar();
                            espacamento();
                            System.out.println("--------------------");

                        }
                    }
                default:
                    break;
            }
            
        }
    }
}