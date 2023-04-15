package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//Design patter STATE igual ao Strategy resolve o probelma de muitos ifs
public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        itens = new ArrayList<>();
        //quando orçamento é criado fica em analise no primeiro estágio
        this.situacao = new EmAnalise();
    }

    //aplicando o design STATE
    //o desconto vai variar de acordo com a situacao atual do orcamento
    //a calcula a situacao atual do desconto mandando o proprio orcamento
    //a situacao atual vai definir o desconto e transitar para o prox estado quando possível
    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
        System.out.println("Situação atual: "+ situacao +" valor como desconto "+valor);
    }

    //metodos para transitar de estados - State
    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }




    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this.valor;
    }

    public int getQuantidadeDeItens() {
        return itens.size();
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
        //se o tipoi da instancia está finalizado
        return situacao instanceof Finalizado;
    }

    //metodo para add qualquer coisa que seja orcavel
    public void adicionarItem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
}
