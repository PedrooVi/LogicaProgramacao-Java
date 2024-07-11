package aprovados;

import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdAlunos; 
        int somaNotas = 0;
        double mediaTurma = 0;
        String aprovadoAluno = null;
        
        System.out.print("Quantos alunos serao digitados: ");
        qtdAlunos = sc.nextInt();
        
        String vetAlunos[] = new String[qtdAlunos];
        double vetNota1[] = new double[qtdAlunos];
        double vetNota2[] = new double[qtdAlunos];
        double notaIndividual[] = new double[qtdAlunos];
        String aprovados[] = new String[qtdAlunos];
        
        for(int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o do aluno: ");
            vetAlunos[i] = sc.next();
            vetNota1[i] = sc.nextDouble();
            vetNota2[i] = sc.nextDouble();
            notaIndividual[i] = (vetNota1[i] + vetNota2[i])/2;
            System.out.println(notaIndividual[i]);
            somaNotas += (vetNota1[i] + vetNota2[i]);
        }
        
        mediaTurma = somaNotas/(qtdAlunos*2);
        
        System.out.println("MEDIA DA TURMA: " + mediaTurma);
        
        System.out.println("APROVADOS: ");
        
        for(int i = 0; i < qtdAlunos; i++) {
            if(notaIndividual[i] >= mediaTurma) {
                aprovados[i] = vetAlunos[i];
            }
        }
        
        for(int i = 0; i < qtdAlunos; i++) {
            System.out.println(aprovados[i]);
        }
        }
    }

