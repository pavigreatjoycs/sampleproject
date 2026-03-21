package com.java.basics;
class Car{
	String brand="BMW";
	Engine eng;
}

class Engine{
	int id=111;
}
public class CarEngine {

	public static void main(String[] args) {
		Car car = new Car();
		car.brand="Tesla";
		car.eng=new Engine();
		car.eng.id=333;
		System.out.println(car.brand);
		System.out.println(car.eng.id);

	}

}
