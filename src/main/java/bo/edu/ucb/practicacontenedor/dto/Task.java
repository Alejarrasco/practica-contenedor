package bo.edu.ucb.practicacontenedor.dto;

public class Task {
    
    private final int taskId;
    private final String Name;
    private final String Date;
    private final String status;

    public Task(int taskId, String Name, String Date, String status) {
        this.taskId = taskId;
        this.Name = Name;
        this.Date = Date;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" + "taskId=" + taskId + ", Name=" + Name + ", Date=" + Date + ", status=" + status + '}';
    }
}
