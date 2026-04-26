import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome da pessoa 1?");
        String pessoa1 = scanner.next();
        System.out.println("Qual o nome da pessoa 2?");
        String pessoa2 = scanner.next();

        System.out.println("Qual a idade da pessoa 1?");
        int idadePessoa1 = scanner.nextInt();
        System.out.println("Qual a idade da pessoa 2?");
        int idadePessoa2 = scanner.nextInt();
        
        int diferencaIdade = idadePessoa1 - (idadePessoa2);
        diferencaIdade = Math.abs(diferencaIdade);

        System.out.printf("A diferença de idade entre pessoa 1 e pessoa 2 é: %d.", diferencaIdade);
    }
}
