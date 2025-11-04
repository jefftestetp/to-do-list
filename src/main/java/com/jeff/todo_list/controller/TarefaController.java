package com.jeff.todo_list.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeff.todo_list.service.TarefaService;
import com.jeff.todo_list.model.Tarefa;
@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){

        this.tarefaService = tarefaService;
    }


    @GetMapping
    public List<Tarefa> getTarefas(){

        return tarefaService.getTarefas();
    }


    @GetMapping("{id}")
    public Tarefa getTarefa(@PathVariable Integer id){

        return tarefaService.getTarefaById(id).get();
    }


}
