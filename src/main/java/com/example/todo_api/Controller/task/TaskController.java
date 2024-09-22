package com.example.todo_api.Controller.task;

import com.example.todoapi.controller.TasksApi;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController implements TasksApi {

    @Override
    public ResponseEntity<Void> tasks1Get() {
        return ResponseEntity.ok().build();
    }
}
