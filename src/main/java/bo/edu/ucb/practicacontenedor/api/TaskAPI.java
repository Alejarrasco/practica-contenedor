package bo.edu.ucb.practicacontenedor.api;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.edu.ucb.practicacontenedor.bl.TaskBl;
import bo.edu.ucb.practicacontenedor.dto.Task;

@RestController
@RequestMapping(value = "/api/v1/task")
public class TaskAPI {

    private TaskBl taskBl;
    
    public TaskAPI() {
        this.taskBl = new TaskBl();
    }

    @GetMapping(path = "/")
    public void create(Task task){
        taskBl.create(task);
    }
/* 
    public Map listAll(){
        return taskBl.listAll();
    }

    public Map delete(int taskId){
        taskBl.delete(taskId);
    } */
}
