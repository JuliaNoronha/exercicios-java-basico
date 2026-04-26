import java.util.Scanner;

public class ex01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String name = scanner.nextLine();
        System.out.println("Qual o seu ano de nascimento?");
        int anoNascimento = scanner.nextInt();

        int idade = 2026 - anoNascimento;

        System.out.printf("Olá, %s, sua idade é %d.", name, idade);
    }
}