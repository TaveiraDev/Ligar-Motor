import java.util.Scanner;

public class LigarMotor {
    private final String modelo;
    private final String marca;
    private boolean ligado;

    //Construtor da classe LigarMotor
    public LigarMotor(String marca, String modelo) {
        this.modelo = modelo;
        this.marca = marca;
        boolean ligado = false; //inicialmente, o motor está desligado
    }

    //método para ligar o motor do carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro da marca: " + marca + "modelo: " + modelo + "Foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    //método para desligar o motor do carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro da marca: " + marca + "modelo: " + modelo + "Foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
    //método para verificar se o carro já está ligado
    public boolean estaLigado() {
        return ligado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LigarMotor meuCarro = new LigarMotor("Chevrolet: ", "Onix ");

        while (true) {
            System.out.println("Escolha uma função: ");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Manter carro funcionando");

            int escolha = scanner.nextInt();

            if(escolha == 1) {
                meuCarro.ligar(); // chama o método ligar() do objeto LigarMotor.
            } else if (escolha == 2) {
                meuCarro.desligar(); // chama o método desligar() do objeto desligarMotor.
            } else if (escolha == 3) {
                System.out.println("Motor em funcionamento.");
                break;
            } else {
                System.out.println("Opção não aceita, tente novamente."); // erro escrito na tela caso o número seja inválido.
            }
        }
    }
}
