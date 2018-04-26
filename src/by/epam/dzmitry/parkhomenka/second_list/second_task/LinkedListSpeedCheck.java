package by.epam.dzmitry.parkhomenka.second_list.second_task;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSpeedCheck {
	List<Integer> linkedlist = new LinkedList<Integer>();

	public List<Integer> getLinkedList() {
		return linkedlist;
	}

	// adding
	public static void addToArray(List<Integer> linkedlist) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			linkedlist.add(i);
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Add time to LinkedList " + estimatedTime);
	}

	// removing
	public static void removeFromArray(List<Integer> linkedlist) {

		long startTime = System.nanoTime();

		linkedlist.remove(5600);

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Remove time from LinkedList " + estimatedTime);
	}

	// searching
	public static void searchInArray(List<Integer> linkedlist) {
		long startTime = System.nanoTime();

		for (int temp : linkedlist) {
			if (temp == 564) {
			}
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Search time in LinkedList " + estimatedTime);
	}
}
