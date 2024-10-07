package com.simpletodo;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    public void addTask(String task) {
        // Logique pour ajouter une tâche
        System.out.println("Tâche ajoutée : " + task);
    }

    public void updateTask(String task) {
        // Logique pour mettre à jour une tâche
        System.out.println("Mise à jour de la tâche : " + task);
    }
}