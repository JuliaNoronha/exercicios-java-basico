import java.util.Scanner;

public class ex03{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a base do retângulo:");
        int base = scanner.nextInt();
        System.out.println("digite a altura do retângulo:");
        int altura = scanner.nextInt();

        int areaRetangulo = base * altura;

        System.out.printf("A área do retângulo é de %d.", areaRetangulo);
    }
}