package queuecollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectionsMain {
	public static void main(String[] args) {
		Queue<String> queueList = new LinkedList<String>();
		
		//Add methods
		queueList.add("Ryan");
		queueList.offer("Maryssa");//Differs when the Queue has a maximum size
		queueList.add("Diego");
		queueList.offer("Paul");
		
		//Print Queue
		System.out.println(queueList);
		
		//Prints the first element of the queue
		System.out.println("First element of the queue: "+queueList.peek());//Differ when the queue is empty, returns null
		
		//Prints the first element of the queue
		System.out.println("First element of the queue: "+queueList.element());//Differ when the queue is empty, returns exception
		
		//Remove first element of the queue (Ryan)
		queueList.poll();
		
		//print Queue
		System.out.println("Ryan removed, new queue: "+queueList);
	}
}
