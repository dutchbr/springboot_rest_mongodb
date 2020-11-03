package com.workpress.carledwinti.easytask.api.to;

import com.workpress.carledwinti.easytask.api.model.Tarefa;

public class RetornoTarefa extends  RetornoBase {
    private Tarefa tarefa;

    public Tarefa getTarefa() {
        return tarefa;
    }
    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
