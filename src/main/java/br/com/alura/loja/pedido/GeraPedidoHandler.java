package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

//design patter COMMAND
//Um Command Handler tem como responsabilidade, normalmente, apenas orquestrar as tarefas a serem executadas,
// ou seja, chamar as classes necessárias que realizam as tarefas desejadas.
public class GeraPedidoHandler {

    private List<AcaoAposGerarPedidos> acoes;
    //usando o poliformismo de todas a acoes que possam surgir, mais coeso com menos dependencias
    public GeraPedidoHandler(List<AcaoAposGerarPedidos> acoes) {
        this.acoes = acoes;
    }

    //logica que execulta do pedido
    //FACADE: processo complexo que envolve várias etapas, várias classes, várias chamadas de metodos
    //ao invez de expor esta complexidade para o cliente, ele simplesmente chama uma fachada
    //que incapsula e abstrai toda esta complexidade. Não exponde a complexidade
    //Uma classe e metodo desse tipo nos fornece poucos métodos públicos (um só, no nosso caso),
    // com toda a infraestrutura necessária para realizar a tarefa.
    public void  executa(GeraPedido dados) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        //com estas funções aqui vai perder a coesão o certo é extrair para uma classe separada
        //System.out.println("Salvar Pedido no banco de dados");
        //System.out.println("Evniar email com dados do novo pedido");

        //Se não tiver injecao de dependencia seria este código, porém isso é um problema, pois a classe sempre
        //vai crescer, temos que separar estas responsabilidades, mesmo assim sempre vai crescer
        //Porque a implementação de cada tarefa pode mudar com o tempo e o Command Handler não deve precisar saber disso
        // * a ideia é usar um poliformisfo para executar estas tarefas criando uma interface de uso
        // * o handler continua intacto

        //EnviarEmailPedido emailPedido = new EnviarEmailPedido();
        //emailPedido.executar(pedido);
        //SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
        //salvar.executar(pedido);

        //é so passar a acão para o construtror da classe que implementa a interface
        //** design patter OBSERVER, pois as 2 classes ficam observando, ouvindo para fazer algo
        //** aqui é a classe que está disparando o evento que as duas classes ficam observando,ouvindo(listener)
        acoes.forEach(a -> a.executarAcao(pedido));
    }


}
