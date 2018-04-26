package by.epam.dzmitry.parkhomenka.second_list.first_task.ConfectionBox.Implementation;

import java.util.ArrayList;
import java.util.List;

import by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation.Confection;
import by.epam.dzmitry.parkhomenka.second_list.first_task.ConfectiontBox.Interface.ConfectionBoxInterface;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.HeavySweetException;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.LargeSweetException;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.NoSweetNameException;

public class ConfectionBox implements ConfectionBoxInterface {
	private List<Confection> items = new ArrayList<Confection>();

	public ConfectionBox() {
	}

	public List<Confection> getItems() {
		return items;
	}

	public void addSweetToPresentBox(Confection sweet) throws NoSweetNameException, HeavySweetException, LargeSweetException {
		if (sweet.getName() == "") {
			throw new NoSweetNameException("Sweet hasn't been added. Sweet has no name");
		} else if (sweet.getWeight() >= 10) {
			throw new HeavySweetException("Sweet hasn't been added. Sweet is too heavy");
		} else if (sweet.getSize() >= 10) {
			throw new LargeSweetException("Sweet hasn't been added. Sweet is too big");
		}
		
		items.add(sweet);
	}

	public boolean deleteSweet(Confection sweet) {
		return items.remove(sweet);
	}

}
