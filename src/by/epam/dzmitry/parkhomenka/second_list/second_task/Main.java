package by.epam.dzmitry.parkhomenka.second_list.second_task;

public class Main {
	public static void main(String[] args) {
		ArrayListSpeedCheck arraylist = new ArrayListSpeedCheck();
		ArrayListSpeedCheck.addToArray(arraylist.getArraylist());
		ArrayListSpeedCheck.removeFromArray(arraylist.getArraylist());
		ArrayListSpeedCheck.searchInArray(arraylist.getArraylist());
		System.out.println();
		LinkedListSpeedCheck linkedlist = new LinkedListSpeedCheck();
		LinkedListSpeedCheck.addToArray(linkedlist.getLinkedList());
		LinkedListSpeedCheck.removeFromArray(linkedlist.getLinkedList());
		LinkedListSpeedCheck.searchInArray(linkedlist.getLinkedList());
		System.out.println("--------------------------------------------------------");
		HashSetSpeedCheck hashset = new HashSetSpeedCheck();
		HashSetSpeedCheck.addToArray(hashset.getHashset());
		HashSetSpeedCheck.removeFromArray(hashset.getHashset());
		HashSetSpeedCheck.searchInArray(hashset.getHashset());
		System.out.println();
		TreeSetCheckSpeed treeset = new TreeSetCheckSpeed();
		TreeSetCheckSpeed.addToArray(treeset.getTreeset());
		TreeSetCheckSpeed.removeFromArray(treeset.getTreeset());
		TreeSetCheckSpeed.searchInArray(treeset.getTreeset());
		System.out.println("--------------------------------------------------------");
		HashMapSpeedCheck hashmap = new HashMapSpeedCheck();
		HashMapSpeedCheck.addToArray(hashmap.getHashmap());
		HashMapSpeedCheck.removeFromArray(hashmap.getHashmap());
		HashMapSpeedCheck.searchInArray(hashmap.getHashmap());
		System.out.println();
		TreeMapSpeedCheck treemap = new TreeMapSpeedCheck();
		TreeMapSpeedCheck.addToArray(treemap.getTreemap());
		TreeMapSpeedCheck.removeFromArray(treemap.getTreemap());
		TreeMapSpeedCheck.searchInArray(treemap.getTreemap());
	}
}
