package teste.array;
import java.util.Scanner;

class App {
    public static void main(String[] args) {

        String[] arrayString = new String[25];
        Scanner myObj = new Scanner(System.in);
        int i;

        try {
            
            for (i = 0; i < arrayString.length; i++) {

                System.out.println("Digite o nome do aluno " +(i+1)+":");         
                arrayString[i] = myObj.nextLine();
                System.out.println("Aluno ["+(i+1)+"]: " + arrayString[i]);

            }

            System.out.println("");
            System.out.println("Alunos cadastrados:");
            System.out.println("");

            for (i = 0; i < arrayString.length; i++) {

                System.out.println("Aluno ["+(i+1)+"]: " + arrayString[i]);

            }

            System.out.println("");
            System.out.println("Cadastre mais 5 alunos:");
            System.out.println("");
            
            String arrayString2[] = prepareArray(arrayString, 5);

            for (i = arrayString.length; i < arrayString2.length; i++) {

                System.out.println("Digite o nome do aluno " +(i+1)+":");         
                arrayString2[i] = myObj.nextLine();
                System.out.println("Aluno ["+(i+1)+"]: " + arrayString2[i]);

            }

            System.out.println("");
            System.out.println("Alunos cadastrados:");
            System.out.println("");

            for (i = 0; i < arrayString2.length; i++) {

                System.out.println("Aluno ["+(i+1)+"]: " + arrayString2[i]);

            }

        } finally {

            myObj.close();

        }
        
    } 

    public static String[] prepareArray(String[] array, int i) {
        
        String arrayString2[] = new String[array.length + i];

        System.arraycopy(array, 0, arrayString2, 0, array.length);

        return arrayString2;
    }

}

/** Qual a dificuldade de inserir os novos alunos nessa estrutura de dados? 
 * Justifique a sua resposta direcionando aos conceitos de gerenciamento de mem??ria. 
 * 
 * A dificuldade de cadastrar os novos alunos ?? gerada pela limita????o imposta ao definirmos 
 * que o primeiro array de cadastros ter?? um limite de 25 posi????es. Ou seja, criamos uma 
 * estrutura est??tica de armazenamento de dados, alocando para ela uma quantidade fixa da 
 * mem??ria dispon??vel e preenchemos toda essa lista com os 25 primeiros alunos. Se tentarmos
 * cadastrar novos alunos, sem sobreescrever os j?? cadastrados, o programa tenta acessar um
 * ??ndice inexistente no array.
 * Dessa forma, a solu????o foi copiar o array cadastrado anteriormente para um novo array com 
 * mais 5 posi????es dispon??veis.
 */
