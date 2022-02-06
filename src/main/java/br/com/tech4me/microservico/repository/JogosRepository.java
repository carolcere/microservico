package br.com.tech4me.microservico.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.com.tech4me.microservico.model.Jogos;

@Repository
public interface JogosRepository extends MongoRepository<Jogos, String> {
    
}

