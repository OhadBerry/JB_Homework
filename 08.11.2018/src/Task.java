
public class Task<T> {
	
	private T taskContent ;
	private int taskDuration ;
	
	public T getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(T taskContent) {
		this.taskContent = taskContent;
	}
	public int getTaskDuration() {
		return taskDuration;
	}
	public void setTaskDuration(int taskDuration) {
		this.taskDuration = taskDuration;
	}
	
	public Task(T taskContent, int taskDuration) {
		super();
		this.taskContent = taskContent;
		this.taskDuration = taskDuration;
	}
	
	@Override
	public String toString() {
		return "Task [taskContent=" + taskContent + ", taskDuration=" + taskDuration + "]";
	}
	
	
	

}
