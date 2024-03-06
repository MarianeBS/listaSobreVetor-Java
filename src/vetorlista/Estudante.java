/**
 * Estrutura de Dados
 * @author Mariane Batista de Souza
 */

//Nome do pacote ao qual o arquivo Java pertence:
package vetorlista;

//Declaração da classe Estudante:
class Estudante 
{ 
    //Declaração dos atributos da classe Estudante, sendo eles Nome e RA:
    private String nome;
    private String ra;
    
    //Método construtor da classe:
    public Estudante(String nome, String ra) 
    {
        //Inicialização dos atributos Nome e RA com seus valores passados como argumentos:
        this.nome = nome;
        this.ra = ra;
    }
    
    //Método Get
    //Responsável por obter o nome do estudante:
    public String getNome() 
    {
        return nome;
    }

    //Método Set
    //Responsável por definir o nome do estudante:
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    //Método Get
    //Responsável por obter o RA do estudante:
    public String getRa() 
    {
        return ra;
    }
    
    //Método Set
    //Responsável por definir o RA do estudante:
    public void setRa(String ra) 
    {
        this.ra = ra;
    }
}
