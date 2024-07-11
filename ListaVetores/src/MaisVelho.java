import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                          
        System.out.print("Quantas pessoas voce quer adicionar?: ");
        int quantidadePessoas = scanner.nextInt(); 
        int maiorIdade = 0;
        String pessoaMaisVelha = "";

        String nomePessoas[] = new String[quantidadePessoas];
        int idadePessoas[] = new int [quantidadePessoas];

        for(int i =0; i < quantidadePessoas; i++){
            System.out.println("Dados da "+ (i+1) +"° pessoa: ");
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            nomePessoas[i] = nome;
            idadePessoas[i] = idade;

            if(i == 0 ){
                maiorIdade = idadePessoas[i];
                pessoaMaisVelha = nomePessoas[i];
            } else if(idadePessoas[i] > maiorIdade){
                maiorIdade = idadePessoas[i];
                pessoaMaisVelha = nomePessoas[i];
            }
          }

          System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
        
    }
}
