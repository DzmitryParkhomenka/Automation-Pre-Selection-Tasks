package by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation;

import java.util.Comparator;

public class Sweet extends Confection {
	private String coverColor;

	public Sweet() {
		super();
		this.coverColor = "";
	}

	public Sweet(String name, int weight, int price, int size, String coverColor) {
		super(name, weight, price, size);
		this.coverColor = coverColor;
	}

	public String getCoverColor() {
		return coverColor;
	}

	public void setCoverColor(String coverColor) {
		this.coverColor = coverColor;
	}

	public static Comparator<Confection> getCompByName() {
		Comparator<Confection> comp = new Comparator<Confection>() {
			@Override
			public int compare(Confection sw1, Confection sw2) {
				return sw1.getName().compareTo(sw2.getName());
			}
		};
		return comp;
	}

}
