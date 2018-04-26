package by.epam.dzmitry.parkhomenka.second_list.first_task.ConfectionBoxHelper;

import java.util.List;

import by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation.Confection;

public class ConfectionBoxHelper {
	public static void printSortedConfectionByName(List<Confection> present) {
		for (Confection sweet : present) {
			System.out.println(sweet.getName());
		}
	}
	
	public static int countPresentWeight(List<Confection> present) {
		int weight = 0;
		for (int i = 0; i < present.size(); i++) {
			weight += present.get(i).getWeight();
		}
		return weight;
	}

	public static String findSweetBySize(int size, List<Confection> present) {
		String result = "Sweet has not been found";
		for (Confection sweet : present) {
			if (sweet.getSize() == (size)) {
				return result = "Found " + sweet.getName();
			}
		}
		return result;
	}
}
