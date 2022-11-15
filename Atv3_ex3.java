import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv3_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer codBebida = 0;
        System.out.println("---------|MENU BEBIDAS|---------\n1- Coca-Cola - R$ 5\n2 - Coca-Cola 0 - R$ 4.50\n"
                + "3 - Pepsi - R$ 4,40\n4 - Guaraná Antarctica - R$ 3,50\n5 - Fanta Laranja - R$ 4,23\n" +
                "6 - Água - R$ 2,50\n0 - SAIR DO MENU");
        try {
            boolean flag = false;
            do {
                System.out.println("Digite o codigo da bebida: ");
                codBebida = sc.nextInt();
                imprimirValorBebida(codBebida);
                flag = (codBebida >= 0 && codBebida <= 6) ? true : false;
            } while (!flag);
        }catch(InputMismatchException e){
            System.out.println("Erro de entrada de dados. Reinicie o programa.");
        }
    }

    private static void imprimirValorBebida(Integer codBebida) {
        switch (codBebida){
            case 1:
                System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.COCA_COLA.getNome(), Bebidas.COCA_COLA.getPreco()); break;
            case 2:
                System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.COCA_COLA_ZERO.getNome(), Bebidas.COCA_COLA_ZERO.getPreco());; break;
            case 3:
                System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.PEPSI.getNome(), Bebidas.PEPSI.getPreco()); break;
            case 4:
                System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.GUARANA_ANTARTICA.getNome(), Bebidas.GUARANA_ANTARTICA.getPreco()); break;
            case 5 :
                System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.FANTA_LARANJA.getNome(), Bebidas.FANTA_LARANJA.getPreco()); break;
            case 6 :
                System.out.printf("Voce escolheu a bebida %s. Valor R$%.2f.", Bebidas.AGUA.getNome(), Bebidas.AGUA.getPreco()); break;
            case 0:
                System.out.println("Voce esta saindo do menu. Obrigado pela preferencia!"); break;
            default:
                System.out.println("Codigo da bebida nao encontrado. Digite novamente um numero entre 1 e 6!");
        }
    }
}
