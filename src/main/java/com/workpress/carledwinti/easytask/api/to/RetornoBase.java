package com.workpress.carledwinti.easytask.api.to;

import com.workpress.carledwinti.easytask.api.enums.StatusTarefa;
import lombok.Data;

import java.time.LocalDate;


public class RetornoBase {
    private String sucesso;
    private String mensagem;

    public void setSucesso(String sucesso) {
        this.sucesso = sucesso;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getSucesso() {
        return sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }


}

