package bo.edu.ucb.practicacontenedor.dto;

public class Task {
    
    private int TaskId;
    private String Name;
    private String Date;
    private String Status;

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

    public void setTaskId(int taskId) {
        TaskId = taskId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
