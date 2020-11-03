package com.workpress.carledwinti.easytask.api.validate;

import com.workpress.carledwinti.easytask.api.model.Tarefa;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class TarefasValidador {

    protected static final String MENSAGEM_NOT_FOUND_CONSULTA = "Nenhum document encontrado para a consulta solicitada";
    protected static final String MENSAGEM_NOT_FOUND_ALTERACAO = "Nenhum document encontrado para a alteração solicitada";
    protected static final String MENSAGEM_NOT_FOUND_EXCLUSAO = "Nenhum document encontrado para a exclusão solicitada";
    protected static final String MENSAGEM_BAD_REQUEST_ALTERACAO_TAREFA = "Dados inválidos para efeturar a alteração da tarefa informada";

    protected void tratarTarefaNotFound(Tarefa tarefa,String mensagem)
    {
        if (tarefa==null)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,mensagem);
        }
    }

    protected  void tratarTarefasNotFound(List<Tarefa> tarefas)
    {
        if (tarefas==null || tarefas.isEmpty())
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,MENSAGEM_NOT_FOUND_CONSULTA);
        }
    }

}
