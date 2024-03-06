/**
 * Estrutura de Dados
 * @author Mariane Batista de Souza
 */

//Nome do pacote ao qual o arquivo Java pertence:
package vetorlista;

//Declaração da classe VetorLista:
public class VetorLista 
{
    //Declaração dos atributos da classe:
    private Estudante[] elementos;
    private int totalDeObjetos;

    //Método construtor da classe:
    public VetorLista(int capacidade) 
    {
        elementos = new Estudante[capacidade];
        totalDeObjetos = 0;
    }
    
    //Método para adicionar um estudante no início da lista:
    public void adicionarInicio(Estudante estudante) 
    {
        //Verificação se a lista está cheia:
        if (listaCheia()) 
        {
            System.out.println("Não há mais espaço para registros na lista.");
            return;
        }
        //Caso a lista não esteja cheia, continua-se com a adição do novo elemento:
        //Chama-se o método adicionarPosicao() para inserir o estudante na posição inicial:
        adicionarPosicao(estudante, 0); 
    }

    //Método para adicionar um estudante no fim da lista:
    public void adicionarFim(Estudante estudante) 
    {
        //Verificação se a lista está cheia:
        if (listaCheia()) 
        {
            System.out.println("Não há mais espaço para registros na lista.");
            return;
        }
    
        //Caso a lista não esteja cheia, continua-se com a adição do novo elemento:
        //Atribui-se o estudante à posição atual da lista. 
        //totalDeObjetos representa o próximo índice disponível na lista:
        elementos[totalDeObjetos] = estudante;
        //Incrementando o contador para indicar que um novo objeto foi adicionado:
        totalDeObjetos++;
    }

    //Método para adicionar um estudante em uma posição específica da lista:
    public void adicionarPosicao(Estudante estudante, int posicao) 
    {
        // Verificação se a lista está cheia:
        if (listaCheia()) 
        {
            System.out.println("Não há mais espaço para registros na lista.");
            return;
        }
    
        //Caso a lista não esteja cheia, continua-se com a adição do novo elemento:
        if (!posicaoValida(posicao)) 
        {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = totalDeObjetos - 1; i >= posicao; i--) 
        {
            elementos[i + 1] = elementos[i];
        }

        elementos[posicao] = estudante;
        totalDeObjetos++;
    }

    //Método para remover um estudante de uma posição específica da lista:
    public void removerPosicao(int posicao) 
    {
        if (!posicaoOcupada(posicao)) 
        {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < totalDeObjetos - 1; i++) 
        {
            elementos[i] = elementos[i + 1];
        }
        elementos[totalDeObjetos - 1] = null;
        totalDeObjetos--;
    }
    
    //Método para verificar se um determinado estudante existe na lista:
    public boolean contem(Estudante estudante) 
    {
        for (int i = 0; i < totalDeObjetos; i++) 
        {
            if (estudante.equals(elementos[i])) 
            {
                return true;
            }
        }
        return false;
    }

    //Método para retornar o tamanho da lista:
    public int tamanho() 
    {
        return totalDeObjetos;
    }

    //Método para verificar se a lista está cheia:
    public boolean listaCheia() 
    {
        return totalDeObjetos == elementos.length;
    }

    //Método para verificar se a lista está vazia:
    public boolean listaVazia() 
    {
        return totalDeObjetos == 0;
    }

    //Método para listar todos os elementos da lista:
    public void listarElementos() 
    {
        //Verificação se a lista está vazia:
        if (listaVazia()) 
        {
            System.out.println("A lista está vazia");
            return;
        }
    
        for (int i = 0; i < totalDeObjetos; i++) 
        {
            System.out.println(elementos[i].getNome() + " - " + elementos[i].getRa());
        }
    }
    
    //Método privado para verificar se a posição é válida na lista:
    private boolean posicaoOcupada(int posicao) 
    {
        return posicao >= 0 && posicao < totalDeObjetos;
    }

    //Método privado para verificar se a posição é válida na lista para adição:
    private boolean posicaoValida(int posicao) 
    {
        return posicao >= 0 && posicao <= totalDeObjetos;
    }
}

