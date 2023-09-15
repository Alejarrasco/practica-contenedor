package bo.edu.ucb.practicacontenedor.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import bo.edu.ucb.practicacontenedor.dto.Task;

public class TaskController {
    
    @GetMapping(path = "/api/v1/task")
    public String getTasks(@RequestBody final Task task) {
        System.out.println(task);
        return "OK";
    }

    @PostMapping(path = "/api/v1/task")
    public String postTasks(@RequestBody final Task task) {
        System.out.println(task);
        return "OK";
    }

    @DeleteMapping(path = "/api/v1/task/{id}")
    public String deleteTasks(@RequestBody final Task task) {
        System.out.println(task);
        return "OK";
    }
}
