package com.workpress.carledwinti.easytask.api.repository;

import com.workpress.carledwinti.easytask.api.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefasRepository extends MongoRepository<Tarefa, String> {
    List<Tarefa> findByDescricaoLikeIgnoreCase(String descricao);
}