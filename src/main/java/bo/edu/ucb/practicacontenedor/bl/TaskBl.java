package bo.edu.ucb.practicacontenedor.bl;

import java.util.ArrayList;
import java.util.List;

import bo.edu.ucb.practicacontenedor.dto.Task;

public class TaskBl {

    List<Task> database = new ArrayList<>();
    
    public void create(Task task){
        database.add(task);
    }

    public List<Task> listAll(){
        return database;
    }

    public void delete(int taskId){
        for (Task task : database) {
            if(task.getTaskId() == taskId){
                database.remove(task);
                break;
            }
        }
    }
}
