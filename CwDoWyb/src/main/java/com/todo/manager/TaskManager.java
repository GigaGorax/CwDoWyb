package com.todo.manager;

import com.example.todo.Task;
import com.example.todo.TaskList;

public class TaskManager {
    private TaskList taskList;

    public TaskManager() {
        this.taskList = new TaskList();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        taskList.addTask(task);
    }

    public void completeTask(Task task) {
        task.setCompleted(true);
    }

    public void removeTask(Task task) {
        taskList.removeTask(task);
    }
}