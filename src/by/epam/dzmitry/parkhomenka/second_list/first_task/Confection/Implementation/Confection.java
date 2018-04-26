package by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation;

public class Confection{
	private String name;
	private int weight;
	private int price;
	private int size;

	public Confection() {
		this.name = "";
		this.weight = 0;
		this.price = 0;
		this.size = 0;
	}

	public Confection(String name, int weight, int price, int size) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
