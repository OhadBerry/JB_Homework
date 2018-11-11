import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		Hashtable<String,Queue<Task>> items = new Hashtable<>();
		Queue<Task> bobToDoList = new LinkedList<>();
		Queue<Task> aliceToDoList = new LinkedList<>();
		bobToDoList.add(new Task("Buy food",20));
		bobToDoList.add(new Task(new String[]{"Clean room","Clean garden"},50));
		aliceToDoList.add(new Task("Cook food",20));
		aliceToDoList.add(new Task(new String[][]{{"Buy drink","Buy food"},{"Pay to post", "Pay to bank"}},120));
		items.put("Bob",bobToDoList);
		items.put("Alice",aliceToDoList);
		
		//Creating a String array of the keySet (Person's names)
		String[] keySet = items.keySet().toArray(new String[items.size()]);
		System.out.println(keySet[0]);
		
		//Summing up and printing the total duration of Bob's tasks
		int sumOfTaskDuration = 0;
		for (Task theTask : bobToDoList) {
			sumOfTaskDuration += theTask.getTaskDuration();
		}
		System.out.println("The total duration of all of "+keySet[0]+"'s tasks is: "+sumOfTaskDuration);
		
		//Printing the details of each of Bob's tasks
		System.out.println(bobToDoList.element().getTaskContent());
		bobToDoList.remove();
		String[] temp1 = (String[])bobToDoList.element().getTaskContent();
		for (String element : temp1)
			System.out.println(element);
		
		//Printing out Alice's name
		System.out.println(keySet[1]);
		
		//Summing up and printing the total duration of Alice's tasks
		sumOfTaskDuration = 0;
		for (Task theTask : aliceToDoList) {
			sumOfTaskDuration += theTask.getTaskDuration();
		}
		System.out.println("The total duration of all of "+keySet[1]+"'s tasks is: "+sumOfTaskDuration);
				
		//Printing the details of each of Alice's tasks
		System.out.println(aliceToDoList.element().getTaskContent());
		aliceToDoList.remove();
		String[][] temp2 = (String[][])aliceToDoList.element().getTaskContent();
		for (String element : temp2[0])
			System.out.println(element);
		for (String element : temp2[1])
			System.out.println(element);

	}

}
