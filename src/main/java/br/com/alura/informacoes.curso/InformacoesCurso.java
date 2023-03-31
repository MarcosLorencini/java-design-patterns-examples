package br.com.alura.informacoes.curso;

public class InformacoesCurso {

    //Curso focado na categoria comportamental:

    //Strategy -Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação
    // (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.
        //class TestesImpostos
        //class CalculadoraDeImpostos
        //interface Imposto
        //class ICMS
        //class ISS

    //Chain of Responsability
        //class CalculadoraDeDescontos
        //class TestesDescontos
        //class DescontoParaOrcamentoComMaisDeCincoItens
        //class DescontoParaOrcamentoComValorMaiorQueQuinhentos
        //class Desconto


    //Template Method -Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
        //class TestesDescontos
        //class Desconto

    //State - O padrão State, assim como o padrão Strategy, resolve o problema de muitos ifs no código.
                //representa questão de estado, quando tem um transição de estados, ou quando deve aplicar alguma
                //regra ou algoritmos de mudançã de estado do objeto
        //class Orcamento
        //class  SituacaoOrcamento
        //class EmAnalise

    //Command - represetacao da interface com o usuario, qualquer interface, web, mobile, api,
                //puxa os dados da API, ou interface mobile ou web
                //Padrão de projeto que representa um comando a ser executado, normalmente neste padrão
                //existem várias classes para executar aluma lógica. Esta classes implementa um interface
                //por execemplo "Command" e cada classes sobrescreve o método "executar()". Classe 1
                //executar(), classe 2 executar()... não sabemos o que cada uma vai fazer, só sabemos que
                //cada uma tem um comando para executar através de uma interface comum.
                //Temos uma variação chamada CommandHendler para separar a parte dos dados, para separar a
                //representação das informações: infos vinda da web, da linha de comando, vinda de uma API,
                // de um protocolo http. Como eu separo esta infos da logica em si? A ideia é separar em duas
                //classes. Uma classe representa dos dados, as infos necessárias para comando e outra classe
                //para execultar o comando(GeraPedidoHandler) com as dependencias(PedidoRepository.java,
                // emailService...) para serem executados.

        //class Pedido
        //class TestesPedido
        //class GeraPedidoHandler
        //class GeraPedido
        //interface AcaoAposGerarPedidos


    //Observer -
        //interface AcaoAposGerarPedidos
        //class EnviarEmailPedido
        //class SalvarPedidoNoBancoDeDados
        //class GeraPedidoHandler
}
