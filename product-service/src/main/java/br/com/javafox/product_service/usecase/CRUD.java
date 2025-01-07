package br.com.javafox.product_service.usecase;

import br.com.javafox.product_service.domain.Produto;
import br.com.javafox.product_service.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CRUD {
    private IProdutoRepository produtoRepository;

    @Autowired
    public CRUD(IProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Page<Produto> buscarTodos(Pageable pageable){
        return produtoRepository.findAll(pageable);
    }


}
