package br.com.alura.loja.http;

import java.util.Map;


//ADAPTER
//é um adapator de Hppt
public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);
}
