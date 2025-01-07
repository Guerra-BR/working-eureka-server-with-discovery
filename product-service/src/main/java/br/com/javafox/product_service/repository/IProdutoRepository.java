package br.com.javafox.product_service.repository;

import br.com.javafox.product_service.domain.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String> {
}
