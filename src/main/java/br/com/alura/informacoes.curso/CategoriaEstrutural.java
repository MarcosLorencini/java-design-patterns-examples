package br.com.alura.informacoes.curso;

public class CategoriaEstrutural {

    //Adapter - pode-se criar vários adaptadores que implementa a interface HttpAdapter
    //na hora de chamar o registro TestesAdapter.java passa o novo adaptador,para não ficar ingessado
    //resumindo: Tem a classe RegistroDeOrcamento precisa conversar com uma outra classe JavaHttpClient(infra)
    //atraves do adaptador interface HttpAdapter. Usando interface e polimorfismo. Pode criar novos adaptadores
    //sem mexer no código já existente. Uma classe não pode depender a infra estrutura de outra classe.
    
    //Que padrões estruturais nos ajudam a relacionar diversas classes de forma organizada
    //Que detalhes de infraestrutura devem ser abstraídos através de interfaces
    //Como o padrão Adapter pode nos ajudar a trocar detalhes de infraestrutura, sem muitas dores de cabeça
        //class RegistroDeOrcamento
        //class HttpAdapter
        //class JavaHttpClient
        //class TestesAdapter

    //Decorator

    //Composite

    //Facade

    //Proxy
}
