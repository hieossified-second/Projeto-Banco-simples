import java.util.Scanner;

public class Banco_SB {

    public static void esperar() throws InterruptedException{
        Thread.sleep(2000);

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
        
        double[] saldo = new double[1];
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
                    
                    if(saldo[0] == 0){
                            System.out.println("Nós percebemos que seu saldo esta atualmente em zero, caso voce deseje System Brasil tem os " +
                                                "menores juros para emprestimos de todo o brasil");
                            System.out.println("Faca um emprestimo hoje e pague depois tranquilamente");
                            System.out.println("--------------------");
                            System.out.println("Deseja fazer um emprestimo?");
                            System.out.println(" ");
                            System.out.println("1 - Sim");
                            System.out.println("2 - Não");
                            System.out.println("--------------------");

                            verificar();

                            int empres = sc.nextInt();
                            System.out.println("--------------------");
                            esperar();
                            espacamento();


                            if (empres == 1){
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
                                        System.out.println("Voce escolher pagar em " + 2 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 2);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 4){
                                        System.out.println("Voce escolher pagar em " + 2 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 2);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 5){
                                        System.out.println("Voce escolher pagar em " + 2 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 2);
                                        System.out.println("--------------------");
                                        esperar();
                                        espacamento();
                                        loop = false;
                                    }
                                    if (parc == 6){
                                        System.out.println("Voce escolher pagar em " + 2 + " parcelas");
                                        System.out.println("Valor a pagar mensalmente " + saldoj[0] / 2);
                                        System.out.println("--------------------");
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
                        }

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