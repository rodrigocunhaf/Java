package collectionsdequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionsDequeueMain {
	
	public static void main(String[] args) {
		
		Deque <String> listDequeue = new ArrayDeque<String>();
		
		//Add Dequeue methods
		listDequeue.push("Lord of the Rings");
		listDequeue.push("Harry Potter");
		listDequeue.push("The Hunger Games");
		
		//Print Dequeue
		System.out.println("Full dequeue: "+listDequeue);
		
		//Remove peek Dequeue (The Hunger Games)
		listDequeue.poll();
		
		//Print Dequeue
		System.out.println("Removed The Hunger Games, new dequeu: "+listDequeue);
		
	}
}
