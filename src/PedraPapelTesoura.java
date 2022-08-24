import java.util.Random;
import java.util.Scanner;

class PedraPapelTesoura {
    Scanner scanner = new Scanner(System.in);
    String[] pedraPapelTesoura = {"Pedra", "Papel", "Tesoura"};
    String jogador, computador, continuar;
    byte vitoriasComputador, vitoriasJogador;

    void vitoria() {
        vitoriasJogador++;
        System.out.println("Computador jogou "+computador+"\n Ganhou! :)" + "\nVocê têm " + vitoriasJogador + " Vitórias, e eu " + vitoriasComputador);
    }
    void derrota() {
        vitoriasComputador++;
        System.out.println("Computador jogou "+computador+"\n Perdeu! xD" + "\nVocê têm " + vitoriasJogador + " Vitórias e eu " + vitoriasComputador);
    }
    void jogar() {
        while (true) {
            while (true) {
                System.out.println("Pedra,Papel ou Tesoura?");
                jogador = scanner.nextLine();
                if (jogador.equalsIgnoreCase("Pedra") || jogador.equalsIgnoreCase("Papel") || jogador.equalsIgnoreCase("Tesoura")) {break;}
                System.out.println(jogador + " não é uma jogada");
            }

            computador = pedraPapelTesoura[new Random().nextInt(pedraPapelTesoura.length)];

            //Salada if-else!
            if (jogador.equalsIgnoreCase(computador)) {
                System.out.println("Computador jogou"+computador+"\n Empate!");
            } else if (jogador.equalsIgnoreCase("Pedra")) {
                if (computador.equals("Papel")) {
                    derrota();
                } else if (computador.equals("Tesoura")) {
                    vitoria();
                }
            } else if (jogador.equalsIgnoreCase("Papel")) {
                if (computador.equals("Tesoura")) {
                    derrota();
                } else if (computador.equals("Pedra")) {
                    vitoria();
                }
            } else if (jogador.equalsIgnoreCase("Tesoura")) {
                if (computador.equals("Pedra")) {
                    derrota();
                } else if (computador.equals("Papel")) {
                    vitoria();
                }
            }

            while (true) {
                System.out.println("De novo? S/N?");
                continuar = scanner.nextLine();
                if (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("N")) {break;}
                System.out.println("S ou N?");
                }
                if (continuar.equalsIgnoreCase("N")) {
                    System.out.println("Tchau Tchau!");
                    scanner.close();
                    System.exit(0);
                }
            }
        }
        PedraPapelTesoura() {
            jogar();
        }
    }