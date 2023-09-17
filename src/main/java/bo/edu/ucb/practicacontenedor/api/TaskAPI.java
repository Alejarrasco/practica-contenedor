package bo.edu.ucb.practicacontenedor.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bo.edu.ucb.practicacontenedor.bl.TaskBl;
import bo.edu.ucb.practicacontenedor.dto.Task;

@RestController
public class TaskAPI {

    private TaskBl taskBl;
    
    public TaskAPI() {
        this.taskBl = new TaskBl();
    }



    @GetMapping(path = "/api/v1/task")
    public Map<String,String> listAll(){
        
        Map<String, String> result = new HashMap<String, String>();
        result.put("code", "TASK-0000");
        result.put("result", "Task loaded successfully");
        result.put("errorMessage", "");
        result.put("resultSet", taskBl.listAll().toString());
        return result;
    }

    @PostMapping(path = "/api/v1/task")
    public Map<String, String> create(@RequestBody Task task){
        taskBl.create(task);
        Map<String, String> result = new HashMap<String, String>();
        result.put("code", "TASK-0000");
        result.put("result", "Task created successfully");
        result.put("errorMessage", "");
        return result;
    }
/* 
    @DeleteMapping(path = "/api/v1/task/{taskId}")
    public Map<String,String> delete(int taskId){
        taskBl.delete(taskId);
        Map<String, String> result = new HashMap<String, String>();
        result.put("code", "TASK-0000");
        result.put("result", "Task deleted successfully");
        result.put("errorMessage", "");
        return result;
    } */
}
