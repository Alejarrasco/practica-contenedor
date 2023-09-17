package bo.edu.ucb.practicacontenedor.dto;

public class Task {
    
    private final int TaskId;
    private final String Name;
    private final String Date;
    private final String Status;

    public Task(int taskId, String Name, String Date, String status) {
        this.TaskId = taskId;
        this.Name = Name;
        this.Date = Date;
        this.Status = status;
    }

    public int getTaskId() {
        return TaskId;
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }

    public String getStatus() {
        return Status;
    }

    @Override
    public String toString() {
        return "Task{" + "taskId=" + TaskId + ", Name=" + Name + ", Date=" + Date + ", status=" + Status + '}';
    }
}
