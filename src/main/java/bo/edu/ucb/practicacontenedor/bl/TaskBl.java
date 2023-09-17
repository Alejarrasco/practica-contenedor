package bo.edu.ucb.practicacontenedor.bl;

import java.util.ArrayList;
import java.util.List;

import bo.edu.ucb.practicacontenedor.dto.Task;

public class TaskBl {

    private List<Task> database;
    
    public TaskBl() {
        this.database = new ArrayList<>();
        //Test tasks
        this.database.add(new Task(1, "Tarea 1", "2021-08-01", "Pendiente"));
        this.database.add(new Task(2, "Tarea 2", "2021-08-02", "Pendiente"));
    }



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
