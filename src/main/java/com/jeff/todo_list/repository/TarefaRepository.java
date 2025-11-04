package com.jeff.todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeff.todo_list.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

    
} 
