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

    //Decorator - Um imposto pode ter outro imposto associado -O padrão Decorator permite
    // adicionar novos comportamentos a um objeto, tornando o código bastante flexível e dinâmico.
    //O padrão Decorator é muito poderoso e bastante comum de ser implementado, mas possui alguns detalhes
    // importantes a serem observados, como o fato do Decorator precisar possuir a mesma interface do objeto
    // que ele está decorando.
    //UM OBJETO DECORANDO O OUTRO
        //abstract class Imposto
        //class ICMS
        //class ISS
        //class TestesImpostos

    //Composite - compor um orçamento antigo em um novo, ou seja, reaproveitar o orcamento antigo
    //um orcamento vai ser composto por outro orçamento
    // classe ItemOrcamento e a classe Orcamento vai ter que ter algo em comum para fazer isso, seria criar uma inerface.
    //Vai compondo objetos como se fosse uma estrutura de arvores
    //Ao implementar uma interface que permita representar ItemOrcamentos e Orcamentos de forma semelhante,
    // podemos percorrer essa lista de Orcavels facilmente, para calcular o valor do orçamento,
    // que é a raiz da árvore.
    //UM OBJETO COMPONDO O OUTRO
        //class TestesComposicao
        //class ItemOrcamento
        //interface Orcavel

    //Facade
        //class GeraPedidoHandle

    //Proxy
}
