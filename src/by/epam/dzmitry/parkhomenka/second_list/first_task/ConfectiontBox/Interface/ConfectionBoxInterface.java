package by.epam.dzmitry.parkhomenka.second_list.first_task.ConfectiontBox.Interface;

import by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation.Confection;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.HeavySweetException;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.LargeSweetException;
import by.epam.dzmitry.parkhomenka.second_list.first_task.UserException.NoSweetNameException;

public interface ConfectionBoxInterface {
	void addSweetToPresentBox(Confection sweet) throws NoSweetNameException, HeavySweetException, LargeSweetException;
	boolean deleteSweet(Confection sweet);
}
