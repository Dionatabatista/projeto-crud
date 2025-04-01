package br.com.crud.produtos.controle;

import org.springframework.web.bind.annotation.GetMapping;

import br.com.crud.produtos.modelo.ProdutoModelo;
import br.com.crud.produtos.servico.ProdutoServico;

public class ProdutoControle {
  
  private ProdutoServico ps;

  @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return ps.listar();
    }
}
