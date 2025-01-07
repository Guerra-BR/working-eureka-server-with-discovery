package br.com.javafox.product_service.controller;

import br.com.javafox.product_service.domain.Produto;
import br.com.javafox.product_service.usecase.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProdutoConteroller {

//    private CRUD database;
//
//    @Autowired
//    public ProdutoConteroller(CRUD database){
//        this.database = database;
//    }

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> buscarTodos(Pageable pageable) {
        return ResponseEntity.ok("FUNFOU");
    }
}
