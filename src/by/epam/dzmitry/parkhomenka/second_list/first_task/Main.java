package by.epam.dzmitry.parkhomenka.second_list.first_task;

import java.io.File;
import java.util.Collections;

import by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation.Confection;
import by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation.Sweet;
import by.epam.dzmitry.parkhomenka.second_list.first_task.ConfectionBox.Implementation.ConfectionBox;
import by.epam.dzmitry.parkhomenka.second_list.first_task.ConfectionBoxHelper.ConfectionBoxHelper;
import by.epam.dzmitry.parkhomenka.second_list.first_task.ConsoleHelper.ConsoleHelpers;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.HeavySweetException;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.LargeSweetException;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.NoSweetNameException;
import by.epam.dzmitry.parkhomenka.second_list.first_task.Work_with_files.Implementation.FileInputStreamMethods;
import by.epam.dzmitry.parkhomenka.second_list.first_task.Work_with_files.Implementation.FileMethods;
import by.epam.dzmitry.parkhomenka.second_list.first_task.Work_with_files.Implementation.FileOutputStreamMethods;

public class Main {
	public static void main(String[] args) throws Exception {
		try {
			testPresentBox();
		} catch (Exception e) {
		}
	}

	public static void testPresentBox() throws Exception {
		// creating Sweets objects
		Confection chocolateSweet = new Sweet("Chocolate Sweet", 1, 60, 2, "Brown");
		Confection appleSweet = new Sweet("Apple Sweet", 2, 50, 3, "Green");
		Confection appleSweet1 = new Sweet("Apple Sweet", 2, 50, 3, "Green");
		Confection stragneSweet = new Sweet("Strange Sweet", 3, 40, 4, "Grey");
		Confection berrySweet = new Sweet("Berry Sweet", 4, 30, 1, "Purple");
		Confection lemonSweet = new Sweet("Lemon Sweet", 5, 20, 6, "Yellow");
		Confection blackSweet = new Sweet("Black Sweet", 6, 10, 5, "Black");
		Confection blackSweet1 = new Sweet("Black Sweet", 11, 10, 5, "Black"); // sweet object is used for HeavySweetException throwing
		Confection blackSweet2 = new Sweet("Black Sweet", 6, 10, 11, "Black"); // sweet object is used for LargeSweetException throwing
		Confection nullSweet = new Sweet(); // sweet object is used for NoSweetNameException throwing

		// creating necessary objects of classes
		ConfectionBox present = new ConfectionBox();
		FileInputStreamMethods fileInputStreamMethods = new FileInputStreamMethods();
		FileOutputStreamMethods fileOutputStreamMethods = new FileOutputStreamMethods();
		FileMethods fileMethods = new FileMethods();

		// adding Sweets to PresentBox
		ConsoleHelpers.printDivideLive();

		addSweet(present, chocolateSweet);
		addSweet(present, appleSweet);
		addSweet(present, stragneSweet);
		addSweet(present, berrySweet);
		addSweet(present, lemonSweet);
		addSweet(present, blackSweet);
		addSweet(present, appleSweet1);
		addSweet(present, nullSweet); // NoSweetNameException will be caught here
		addSweet(present, blackSweet1); // HeavySweetException will be caught here
		addSweet(present, blackSweet2); // LargeSweetException will be caught here

		// print present weight
		ConsoleHelpers.printDivideLive();
		System.out.println("Present weight is " + ConfectionBoxHelper.countPresentWeight(present.getItems()));

		// sorting Sweets by name in the Present Box
		Collections.sort(present.getItems(), Sweet.getCompByName());

		// print sorted sweets by name
		ConsoleHelpers.printDivideLive();
		ConfectionBoxHelper.printSortedConfectionByName(present.getItems());

		// find sweet in box by size
		ConsoleHelpers.printDivideLive();
		System.out.println(ConfectionBoxHelper.findSweetBySize(4, present.getItems()));

		// removing sweets from the present
		ConsoleHelpers.printDivideLive();
		deleteSweet(present, chocolateSweet);
		deleteSweet(present, appleSweet);
		deleteSweet(present, stragneSweet);

		// create file on disk
		File file = fileMethods.createFile();

		// write sweet names to file
		fileOutputStreamMethods.writeSweetNamesToFile(present.getItems(), fileOutputStreamMethods, file);

		// read written sweet names from file
		ConsoleHelpers.printDivideLive();
		fileInputStreamMethods.readFile(file);

	}

	static void addSweet(ConfectionBox confectionBox, Confection sweet) {
		try {
			confectionBox.addSweetToPresentBox(sweet);
			System.out.println(sweet.getName() + " has been added to Present Box");
		} catch (NoSweetNameException e) {
			System.out.println(e.getMessage());
		} catch (HeavySweetException e) {
			System.out.println(e.getMessage());
		} catch (LargeSweetException e) {
			System.out.println(e.getMessage());
		}
	}

	static void deleteSweet(ConfectionBox confectionBox, Confection sweet) {
		confectionBox.deleteSweet(sweet);
		System.out.println(sweet.getName() + " has been removed from the Present Box");
	}

}
