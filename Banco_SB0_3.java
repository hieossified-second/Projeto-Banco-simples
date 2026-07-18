import java.util.Scanner;

public class Banco_SB0_3 {

    public static void esperar() throws InterruptedException{
        Thread.sleep(2000);

    }

    static double[] saldo = new double[1];

    public static void empres() throws InterruptedException{
                    System.out.println("--------------------");
                    System.out.println("Digite o valor desejado");
                    System.out.println("Trabalhamos com juros de 8%");
                    System.out.println("--------------------");
                    verificar();

                    double money = sc.nextDouble();
                    double juross = money * 0.08;

                    System.out.println("Voce fez um emprestimo de R$: " + money);
                    System.out.println("Total a Pagar: " + money + " + " + juross);

                            saldo[0] = saldo[0] + money;
                            double[] saldoj = new double[1];
                            saldoj[0] = saldo[0] + juross;

                                boolean loop = true;

                                while(loop){
                                    System.out.println("--------------------");
                                    System.out.println("Escolha suas Parcelas: ");
                                    System.out.println("1x " + saldoj[0]);
                                    System.out.println("2x " + saldoj[0] / 2);
                                    System.out.println("3x " + saldoj[0] / 3);
                                    System.out.println("4x " + saldoj[0] / 4);
                                    System.out.println("5x " + saldoj[0] / 5);
                                    System.out.println("6x " + saldoj[0] / 6);
                                    System.out.println("Caso deseje cancelar essa acão digite 0");
                                    System.out.println("--------------------");

                                    verificar();
                                    int parc = sc.nextInt();
                                    
                                    if (parc == 1){
                                        System.out.println("Voce escolher pagar em " + 1 + " parcelas");
                                        System.out.println("Valor a pagar no proximo mes" + saldoj[0]);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 2){
                                        System.out.println("Voce escolher pagar em " + 2 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 2);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 3){
                                        System.out.println("Voce escolher pagar em " + 3 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 3);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 4){
                                        System.out.println("Voce escolher pagar em " + 4 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 4);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 5){
                                        System.out.println("Voce escolher pagar em " + 5 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 5);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 6){
                                        System.out.println("Voce escolher pagar em " + 6 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 6);
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 0){
                                        System.out.println("Voce cancelou essa acão retornando ao menu");
                                        System.out.println("--------------------");
                                        saldo[0] = saldo[0] - money;
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc > 6){
                                        System.out.println("--------------------");
                                        System.out.println("Digite apenas o valor das parcelas disponiveis");
                                        esperar();
                                        espacamento();
                                        continue;
                                    }
                                    if (parc < 0){
                                        System.out.println("--------------------");
                                        System.out.println("Digite apenas o valor das parcelas disponiveis");
                                        esperar();
                                        espacamento();
                                        continue;
                                    }
                                }
    }

    public static void verificar() throws InterruptedException {
        while (!sc.hasNextInt()){
                System.out.println("--------------------");
                System.out.println("Digite Apenas numeros!");
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
                    System.out.println(saldo[0]);
                    System.out.println("--------------------");
                    esperar();

                    if(saldo[0] == 0){
                        System.out.println("--------------------");
                        System.out.println("Nós percebemos que seu atual saldo esta zerado");
                        System.out.println("O System Brasil usa hoje a menor taxa de emprestimos");
                        System.out.println("Deseja fazer um emprestimo?");
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
                    }
                    break;
                case 2: 
                    System.out.println("--------------------");
                    System.out.println("Quanto deseja retirar?");
                    System.out.println("Seu saldo atual é: " + saldo[0]);

                    verificar();

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

                    int deposito1 = sc.nextInt();

                    System.out.println("--------------------");
                    System.out.println("Voce depositou " + deposito1);
                    saldo[0] += deposito1;

                    System.out.println("Saldo atual é de: " + saldo[0]);
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
                                System.out.println("--------------------");
                                System.out.println("Sua transferencia foi concluida");
                                System.out.println("Saldo atual: " + saldo[0]);
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