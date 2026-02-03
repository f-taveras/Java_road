import java.util.*;

public class Main {
public static void main(String[] args) {
// TODO: Create Queue using LinkedList

Queue<String> tasksQueue = new LinkedList<>();


// TODO: Add 5 tasks to the queue

// tasksQueue.offer("task 1");
// tasksQueue.offer("task 2");
// tasksQueue.offer("task 3");
// tasksQueue.offer("task 4");
// tasksQueue.offer("task 5");



System.out.println(tasksQueue);
System.out.println("The next one on queue is: " + tasksQueue.peek());

// TODO: Display all tasks without removing them

// TODO: Execute tasks using poll() in a loop
// while(!tasksQueue.isEmpty()){
//     String currentTask = tasksQueue.poll();
//     System.out.println("Currently serving:" + currentTask);
// }

String task1 = tasksQueue.poll();

System.out.println("Currently seeing " + task1);

try {
    tasksQueue.remove();
} catch (NoSuchElementException e) {
    System.out.println("remove() throws: " + e.getClass().getSimpleName());
}

// TODO: Try remove() on empty queue and handle exception

// TODO: Explain difference between poll() and remove()

// Poll selects the firs item of the queue soyou can print it out while remove just removes it from the queue. Removing an item that does not exist throws an exception while poll returns null.  
}
}