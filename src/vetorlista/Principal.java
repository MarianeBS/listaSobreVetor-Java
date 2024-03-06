/**
 * Estrutura de Dados
 * @author Mariane Batista de Souza
 */

//Nome do pacote ao qual o arquivo Java pertence:
package vetorlista;

//Importação da classe ArrayList, responsável por implementar listas dinâmicas:
import java.util.ArrayList;

//Declaração da classe Principal do programa: 
public class Principal 
{
    //Método Principal da execução do programa:
    public static void main(String[] args) 
    {
        // Criando uma lista de estudantes com capacidade para 5 elementos:
        //Instância da classe Lista:
        VetorLista listaEstudantes = new VetorLista(5);
        
        //Criando estudantes para popular a lista:
        
        /*Instância da classe Estudante, atribuindo à variável estudante, que 
        armazenará referência para objetos do tipo Estudante:*/
        Estudante estudante1 = new Estudante("Renato Ferreira", "123456-0");
        Estudante estudante2 = new Estudante("Antonia Soares", "744125-8");
        Estudante estudante3 = new Estudante("Mario Andrade", "123456-X");
        Estudante estudante4 = new Estudante("Juliana Mendes", "789123-3");
        Estudante estudante5 = new Estudante("Lurdes Melo", "852367-Y");
        /*Instância criada apenas para testar se alista continuaria aceitando 
        elementos acima de sua capacidade:*/ 
        //Estudante estudante6 = new Estudante("Teste", "852367-Y");
        
        //Adicionando elementos à lista de estudantes:
        
        /*Utilização de métodos que posicionam os elementos em diferentes 
        localidades da lista, sendo elas: no início, no fim ou, na posição
        desejada.*/ 
        listaEstudantes.adicionarInicio(estudante1);
        listaEstudantes.adicionarFim(estudante5);
        listaEstudantes.adicionarPosicao(estudante2, 1);
        listaEstudantes.adicionarPosicao(estudante3, 2);
        listaEstudantes.adicionarPosicao(estudante4, 3);
        /*Elemento criado para testar se alista continuaria aceitando 
        elementos acima de sua capacidade:*/
        //listaEstudantes.adicionarInicio(estudante6);
        
        //Organização dos estudantes na lista: 
        // Posição 0: Renato (estudante1); // Posição 1: Antonia (estudante2)
        // Posição 2: Mario (estudante3); // Posição 3: Juliana (estudante4)
        // Posição 4: Lurdes (estudante5)
        
        //Estrutura de condição IF:
        //"Se a lista de estudantes estiver vazia,...
        if (listaEstudantes.listaVazia()) 
        {
            //faça:"
            //Mensagem informativa de que a lista está vazia:
            System.out.println("Erro: A Lista está vazia");
        //"Senão...(caso a lista não esteja vazia)
        //A execução deve continnuar tranquilamente:"
        } else {
            // Verificação do tamanho da lista
            int tamanho = listaEstudantes.tamanho();
            //Apresentando o tamanho total da lista:
            System.out.println("TAMANHO DA LISTA TOTAL: "+listaEstudantes.tamanho());
            //Apresentando todos os estudantes presentes na lista:
            listaEstudantes.listarElementos();
            
            //Estrutura de condição IF:
            //"Se o tamanho da lista estiver diferente de 5 posições...
            if (tamanho != 5) 
            {
                //apresente uma mensagem a respeito do tamanho errado da lista":
                System.out.println("Erro: O tamanho da lista está errado.");
            }

            // Removendo um estudante da lista:
            //Passa-se um valor como argumento dentro dos parênteses:
            //Este valor corresponde à posição do estudante que será removido.
            listaEstudantes.removerPosicao(4);
            //Atribuição do valor atual da lista de estudantes à variável tamanho
            //(Após a remoção de um elemento, o tamanho de elementos na lista diminuirá):
            tamanho = listaEstudantes.tamanho();

            //Verificando o tamanho da lista após a remoção
            //Após a remoção, deve haver apenas 4 elementos na lista.
            //Estrutura de condição IF:
            //"Se o tamanho da lista for diferente de 4 elementos...
            if (tamanho != 4) 
            {
                //apresente uma mensagem a respeito do tamanho errado da lista":
                System.out.println("Erro: O tamanho da lista está errado.");
            }

            // Verificando se um estudante removido não está mais na lista:
            //Após a remoção do estudante, seu nome não deve mais ser apresentado.
            //Estrutura de condição IF:
            //"Se a lista de estudantes contiver o estudante que foi removido...
            /*(Deve-se passar como argumento qual o objeto que está sendo procurado.
            Neste caso, foi utilizado o estudante5.*/
            if (listaEstudantes.contem(estudante5)) 
            {
                /*apresente uma mensagem a respeito da presença de um aluno que não deveria
                estar na lista":*/
                System.out.println("Erro: Achou um aluno que não deveria estar na lista");
            }

            // Verificando se um estudante está contido na lista
            //Estrutura de condição IF:
            /*"Se a lista de estudantes NÃO contém determinado estudante especificado na
            passagem de argumento...*/ 
            //(Neste caso, o objeto utilizado foi o estudante1)
            if (!listaEstudantes.contem(estudante1)) 
            {
                /*apresente uma mensagem a respeito da falta de presença de um aluno que deveria
                estar na lista":*/
                System.out.println("Erro: Não achou um aluno que deveria estar na lista.");
            }
            
            //Apresentando o tamanho da lista após a mudança ocorrida:
            System.out.println("TAMANHO DA LISTA APÓS REMOÇÃO: "+listaEstudantes.tamanho());
            //Apresentando todos os estudantes presentes na lista após a remoção:
            listaEstudantes.listarElementos();
        }
    }
}