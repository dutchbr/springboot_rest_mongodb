package com.workpress.carledwinti.easytask.api.model;

import lombok.Data;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import com.workpress.carledwinti.easytask.api.enums.*;

import java.time.LocalDate;


@Document
@Data
public class Tarefa {
    @Id
    private String id;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private StatusTarefa statusTarefa;



}
