package com.workpress.carledwinti.easytask.api.service;


import com.workpress.carledwinti.easytask.api.enums.StatusTarefa;
import com.workpress.carledwinti.easytask.api.model.Tarefa;
import com.workpress.carledwinti.easytask.api.repository.TarefasRepository;
import com.workpress.carledwinti.easytask.api.to.RetornoBase;
import com.workpress.carledwinti.easytask.api.validate.TarefasValidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDate;
import java.util.List;

@Service
public class TarefasService extends TarefasValidador {

    @Autowired
    private TarefasRepository tarefasRepository;

    @ResponseStatus(HttpStatus.OK)
    public Tarefa findById(String id)
    {
        Tarefa tarefa = tarefasRepository.findById(id).orElse(null);
        tratarTarefaNotFound(tarefa,MENSAGEM_NOT_FOUND_CONSULTA);
        return  tarefa;
    }
    @ResponseStatus(HttpStatus.OK)
    public List<Tarefa> findAll()
    {
        List<Tarefa> tarefas = tarefasRepository.findAll();
        tratarTarefasNotFound(tarefas);
        RetornoBase xs = new RetornoBase();
        return  tarefas;
    }

    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa save(Tarefa tarefa)
    {
        if (StringUtils.isEmpty(tarefa.getStatusTarefa()))
        {
            tarefa.setStatusTarefa(StatusTarefa.A_FAZER);
        }
        tarefa.setDataCriacao(LocalDate.now());
        return  tarefasRepository.save(tarefa);
    }
}
