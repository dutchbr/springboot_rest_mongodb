package com.workpress.carledwinti.easytask.api.controller;

import com.workpress.carledwinti.easytask.api.model.Tarefa;
import com.workpress.carledwinti.easytask.api.repository.TarefasRepository;
import com.workpress.carledwinti.easytask.api.service.TarefasService;
import com.workpress.carledwinti.easytask.api.to.RetornoTarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Properties;

@RestController
@RequestMapping("/")
public class TarefasController {
    @Autowired
    private TarefasService tarefasService;

    @GetMapping("/hello")
    public  String Hello()
    {
        return "Bem vindo ao Easy Task!!";
    }

    @PostMapping("/tarefas")
    public Tarefa create(@RequestBody Tarefa tarefa)
    {
        return tarefasService.save(tarefa);
    }
    @GetMapping("tarefas")
    public List<Tarefa> getAll()
    {
        return tarefasService.findAll();
    }

    @GetMapping("/tarefas/buscarPorId")
    public RetornoTarefa findById(@RequestParam String id)
    {
        RetornoTarefa result = new RetornoTarefa();

        result.setTarefa(tarefasService.findById(id));
        result.setSucesso("S");

         return  result;


    }

}
