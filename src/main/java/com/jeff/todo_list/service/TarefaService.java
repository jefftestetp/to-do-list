package com.jeff.todo_list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeff.todo_list.model.Tarefa;
import com.jeff.todo_list.repository.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;
    

    public List<Tarefa> getTarefas(){

      return tarefaRepository.findAll();
    }

    public Optional<Tarefa> getTarefaById(Integer id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa criarTarefa(Tarefa tarefa){

      return tarefaRepository.save(tarefa);
    }

    public String atualizarTarefa(Tarefa tarefa){

        try{
            tarefaRepository.save(tarefa);
            return "Salvo com sucesso";
        } catch (Exception e){

            e.getMessage();
        }

        return "Não foi possível atualizar";
    }

    public String deletarTarefa(Integer id){

        try {
            tarefaRepository.deleteById(id);

            return "Deletado com sucesso.";
        }catch (Exception e) {
            e.getStackTrace();
        }

        return "Não foi possível deletar";
    } 

}
