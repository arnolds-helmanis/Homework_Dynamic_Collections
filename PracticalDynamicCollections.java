package Classes_And_Objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class PracticalDynamicCollections {

	public static void main(String[] args) {
		Random r = new Random();
		Car car1 = new Car ("Jim", "Audi", 15000, 2015);
		Car car2 = new Car ("Bob", "Opel", 1999, 2000);
		Car car3 = new Car ("John", "Range Rover", 73000, 2022);
		Car car4 = new Car ("Mike", "Nissan", 12000, 2016);
		Car car5 = new Car ("Ben", "Honda", 18000, 2020);
		Car car6 = new Car ("Bill", "Toyota", 7500, 2010);
		Car car7 = new Car ("Harry", "Ford", 11500, 2017);
		Car car8 = new Car ("Ron", "Opel", 1500, 1998);
		
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		System.out.println(list.size());
		ArrayList<Car> list2 = new ArrayList<Car>();
		list2.add(car6);
		list2.add(car7);
		list2.add(car8);
		
		list.addAll(list2);
		System.out.println(list2.size());
		list2.clear();
		System.out.println(list2.size());
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).scrapMetal() < 0) {
				list.remove(i);
			}
		}
		
		for (Car unit:list) {
			System.out.println(unit);
		}
		
		double totalSum = 0;
		double discountedSum = 0;
		for (Car car:list) {
			totalSum += car.getPrice();
			discountedSum += car.discountPrice();
		}
		double avgDiscount = (totalSum - discountedSum) / list.size();
		System.out.println("The average discount of given cars is " + avgDiscount + " euros.");
		System.out.println("");
		for (Car car:list) {
			if (car.isItNew()) {
				System.out.println("Congratulations, " + car.getName() + "! You have a new car.");
			} else {
				System.out.println(car.getName() + ", you don't have a brand new car, but at least it is not an old Opel.");
			}
		} 
		System.out.println("");
		for (int i = 0; i < list.size(); i++) {
			int magicNumber = r.nextInt(list.size());
			if (i == magicNumber) {
				list.get(i).loteryTicket(i, magicNumber);
				System.out.println("Lucky you, " + list.get(i).getName() + "! You receive a 'new' car!");
				System.out.println(list.get(i));
			}
		}
		System.out.println("");
		boolean check = list.equals(list2);
		System.out.println(check);
		boolean check2 = list2.contains(list);
		System.out.println(check2);
		boolean check3 = list2.isEmpty();
		System.out.println(check3);
		
		HashMap<Integer, Car> list3 = new HashMap<Integer, Car>();
		list3.put(1, car1);
		list3.put(2, car2);
		list3.put(3, car3);
		list3.put(4, car4);
		list3.put(5, car5);
		
		HashMap<Integer, Car> list4 = new HashMap<Integer, Car>();
		list4.put(0, car6);
		list4.put(2, car7);
		
		list3.putAll(list4);
		list3.remove(3);
		System.out.println(list3.size());
		list3.put(1, car8);
		System.out.println(list3.size());
		
		boolean test1 =  list3.containsKey(1);
		boolean test2 =  list3.containsKey(8);
		boolean test3 =  list3.containsValue(car4);
		boolean test4 =  list3.containsValue(car3);
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println("");
		for (Integer key : list3.keySet()) {
			System.out.println(key + " - " + list3.get(key).getName());
		}
		list3.get(0);
		Car first = list3.get(0);
		System.out.println(first.getName() + " is first in the line.");
		list3.clear();
		System.out.println(list3);
		
	}

}
