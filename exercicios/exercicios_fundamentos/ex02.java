import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado?");
        int lado = scanner.nextInt();
        int areaQuadrado = lado * lado;
        System.out.printf("A área do quadrado é de %d.", areaQuadrado);
    }
}
