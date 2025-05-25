package com;

import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {

		ArrayList<Driver> drivers = new ArrayList<>();

		drivers.add(new Driver(1, "sudhagar", "Car", 4500));
		drivers.add(new Driver(2, "anjali", "Bike", 5000));
		drivers.add(new Driver(3, "Ram", "auto", 8000));
		drivers.add(new Driver(4, "Srinu", "Car", 4500));
		drivers.add(new Driver(5, "Sita", "Auto", 9000));

		Travel travel = new Travel();

		System.out.println(travel.isCarDriver(drivers.get(0)));

		System.out.println(travel.retrievebyDriverId(drivers, 1));

		System.out.println(travel.retrieveCountOfDriver(drivers, "Car"));

		System.out.println(travel.retrieveDriver(drivers, "car"));

		System.out.println(travel.retrieveMaximumDistanceTravelledDriver(drivers).getDriverName());
	}
}
