package com.simpletodo;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    public void addTask(String task) {
        // Logique pour ajouter une tâche
        System.out.println("Ajout de la tâche : " + task);
    }

    public void removeTask(String task) {
        // Logique pour supprimer une tâche
        System.out.println("Suppression de la tâche : " + task);
    }
}
