import java.util.Scanner;

public class Banco_SB {

    public static void esperar() throws InterruptedException{
        Thread.sleep(2000);

    }

    static double[] saldo = new double[1];

    public static void empres() throws InterruptedException{
                    System.out.println("--------------------");
                    System.out.println("Digite o valor desejado");
                    System.out.println("Trabalhamos com juros de 4%");
                    System.out.println("--------------------");
                    verificar();

                    double money = sc.nextDouble();
                    double juross = money * 0.04;

                    System.out.println("Voce fez um emprestimo de R$: " + money);
                    System.out.printf("Total a Pagar: %.2f + %.2f%n", money, juross);

                            saldo[0] = saldo[0] + money;
                            double[] jurosap = new double[1];
                            jurosap[0] = money + juross;

                                boolean loop = true;

                                while(loop){
                                    System.out.println("--------------------");
                                    System.out.println("Escolha suas Parcelas: ");
                                    System.out.printf("1 - 1x: %.2f%n", jurosap[0]);
                                    System.out.printf("2 - 2x: %.2f%n", jurosap[0] / 2);
                                    System.out.printf("3 - 3x: %.2f%n", jurosap[0] / 3);
                                    System.out.printf("4 - 4x: %.2f%n", jurosap[0] / 4);
                                    System.out.printf("5 - 5x: %.2f%n", jurosap[0] / 5);
                                    System.out.printf("6 - 6x: %.2f%n", jurosap[0] / 6);
                                    System.out.println("Caso deseje cancelar essa acão digite 0");
                                    System.out.println("--------------------");

                                    verificar();
                                    int parc = sc.nextInt();
                                    
                                    if (parc == 1){
                                        System.out.println("Voce escolher pagar em " + 1 + " parcelas");
                                        System.out.printf("Valor a pagar: %.2f%n", jurosap[0]);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    else if (parc == 2){
                                        System.out.println("Voce escolher pagar em " + 2 + " parcelas");
                                        System.out.printf("Valor a pagar mensalmente: %.2f%n ", jurosap[0] / 2);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    else if (parc == 3){
                                        System.out.println("Voce escolher pagar em " + 3 + " parcelas");
                                        System.out.printf("Valor a pagar mensalmente: %.2f%n", jurosap[0] / 3);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    else if (parc == 4){
                                        System.out.println("Voce escolher pagar em " + 4 + " parcelas");
                                        System.out.printf("Valor a pagar mensalmente: %.2f%n", jurosap[0] / 4);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    else if (parc == 5){
                                        System.out.println("Voce escolher pagar em " + 5 + " parcelas");
                                        System.out.printf("Valor a pagar mensalmente: %.2f%n", jurosap[0] / 5);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    else if (parc == 6){
                                        System.out.println("Voce escolher pagar em " + 6 + " parcelas");
                                        System.out.printf("Valor a pagar mensalmente: %.2f%n", jurosap[0] / 6);
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    else if (parc == 0){
                                        System.out.println("Voce cancelou essa acão retornando ao menu");
                                        System.out.println("--------------------");
                                        saldo[0] = saldo[0] - money;
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    else if (parc > 6){
                                        System.out.println("--------------------");
                                        System.out.println("Digite apenas o valor das parcelas disponiveis");
                                        esperar();
                                        espacamento();
                                        continue;
                                    }
                                    else if (parc < 0){
                                        System.out.println("--------------------");
                                        System.out.println("Digite apenas o valor das parcelas disponiveis");
                                        esperar();
                                        espacamento();
                                        continue;
                                    }
                                }
    }

    public static void verificar() throws InterruptedException {
        while (!sc.hasNextDouble()){
                System.out.println("--------------------");
                System.out.println("Digite Apenas numeros!");
                System.out.println("Por favor faca a acao novamente");
                System.out.println("--------------------");
                sc.next();
                esperar();
                continue;
            }
    }

    public static void espacamento(){
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException{
        
        saldo[0] = 0;

        System.out.println("Bem-vindo ao System Brasil");
        
        while(true){ 

            System.out.println("O que voce deseja fazer");
            System.out.println("--------------------");
            System.out.println(" ");
            System.out.println("1 - Ver seu saldo");
            System.out.println("2 - Fazer um saque");
            System.out.println("3 - Fazer um deposito");
            System.out.println("4 - Fazer um emprestimo");
            System.out.println("5 - Fazer uma transferencia bancaria");
            System.out.println("0 - Sair");
            System.out.println(" ");
            System.out.println("--------------------");
            
            
            verificar();

            int op = sc.nextInt();

          
            
            if (op > 5){
                espacamento();
                System.out.println("--------------------");
                System.out.println("Numero invalido tente novamente");
                System.out.println("--------------------");
                esperar();
                espacamento();
                continue;
            }else if (op < 0){
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
                    System.out.printf("%.2f%n",saldo[0]);
                    System.out.println("--------------------");
                    esperar();
                
                    if(saldo[0] == 0){
                        System.out.println("--------------------");
                        System.out.println("Percebemos que seu saldo esta zerado");
                        System.out.println("O System Brasil tem a menor taxa de emprestimos");
                        System.out.println("Deseja fazer um emprestimo?");
                        System.out.println("--------------------");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        System.out.println("Digite qualquer outro numero para sair para o menu");
                        System.out.println("--------------------");


                        verificar();
                        int emps_n = sc.nextInt();

                        if (emps_n == 1){
                            System.out.println("--------------------");
                            System.out.println("Direcionando...");
                            esperar();
                            espacamento();
                            empres();}
                        if (emps_n == 2){
                            System.out.println("--------------------");
                            System.out.println("Direcionando ao menu...");
                            esperar();
                            espacamento();
                            continue;
                        }

                        espacamento();

                    }
                    break;
                case 2: 
                    System.out.println("--------------------");
                    System.out.println("Quanto deseja retirar?");
                    System.out.printf("Seu saldo atual é: %.2f%n", saldo[0]);

                    verificar();

                    double retirou = sc.nextDouble();

                    if (saldo[0] > retirou){
                        saldo[0] = saldo[0] - retirou;
                        System.out.println("--------------------");
                        System.out.printf("Voce retirou "+ retirou + " Agora seu saldo é: %.2f%n", saldo[0]);
                        System.out.println("--------------------");
                        esperar();
                        espacamento();
                    }else if(retirou == saldo[0]){
                        saldo[0] = 0;
                        System.out.println("--------------------");
                        System.out.printf("Voce retirou "+ retirou + " Agora seu saldo é: %.2f%n", saldo[0]);
                        System.out.println("--------------------");
                        esperar();
                        espacamento();
                    }
                    
                    if (saldo[0] < retirou){
                        System.out.println("--------------------");
                        System.out.println("Quantidade desejada indisponivel (saldo insuficiente!)");
                        System.out.printf("Seu saldo é de: %.2f%n", saldo[0]);
                        System.out.println("--------------------");
                        espacamento();
                        System.out.println("--------------------");

                        
                    }

                    if (saldo[0] <= -1){
                        saldo[0] = 0;
                    }
                    
                    
                    break;

                case 3:
                    System.out.println("--------------------");
                    System.out.println("Voce escolheu depositar");
                    System.out.println("Digite a quantidade desejada");

                   verificar();

                    double deposito1 = sc.nextDouble();

                    System.out.println("--------------------");
                    System.out.println("Voce depositou " + deposito1);
                    saldo[0] += deposito1;

                    System.out.printf("Saldo atual é de: %.2f%n", saldo[0]);
                    System.out.println("--------------------");
                    esperar();
                    espacamento();
                    break;
                case 4:
                        empres();
                        break;
                case 5: 
                    System.out.println("--------------------");
                    System.out.println("Digite o numero da conta do destinatario: ");
                    System.out.println("--------------------");

                    
                    boolean condition = true;

                    while (condition) {
                        verificar();
                        int destinatario = sc.nextInt();

                        System.out.println("--------------------");
                        System.out.println("O seu destinatario é: " + destinatario);
                        System.out.println("--------------------");
                        

                        boolean condition1 = true;
                    
                        while (condition1){
                            System.out.println("Qual o valor da transferencia?");
                            System.out.println("--------------------");

                            verificar();
                            double transf = sc.nextDouble();

                            
                            if (transf > saldo[0]){
                                System.out.println("--------------------");
                                System.out.println("Saldo insuficiente");
                                System.out.println("Digite o valor novamente");
                                System.out.println("--------------------");
                                continue;
                            }
                            if (transf <= saldo[0]){
                                double transfi = saldo[0] - transf;
                                saldo[0] = transfi;

                                System.out.println("--------------------");
                                System.out.println("Sua transferencia foi concluida");
                                System.out.printf("Saldo atual: %.2f%n", saldo[0]);
                                System.out.println("--------------------");
                                System.out.println(" ");
                                System.out.println("Voltando ao menu...");
                                System.out.println("--------------------");
                                esperar();
                                espacamento();
                                condition = false;
                                condition1 = false;
                            }
                        }
                    }
                       
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Voce tem certeza que deseja sair?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    System.out.println("--------------------");

                    verificar();

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
                    break;
                default:
                    break;
            }
            
        }
    }
}