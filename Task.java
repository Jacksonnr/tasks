public class Task {

    // Criação da classe "Task" para funcionar como objeto de criação das tarefas que iremos 
    // fazer para que os usuários possam manipular de acordo com o que o sistema permite. 

    private String nameTask;
    private String description;
    private int daysToComplete;     
    private String priority;
    
    public Task(String nameTask, String description, int daysToComplete, String priority) {
        this.nameTask = nameTask;
        this.description = description;
        this.daysToComplete = daysToComplete;
        this.priority = priority;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(int daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}
