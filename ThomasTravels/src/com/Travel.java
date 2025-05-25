package com;

import java.util.ArrayList;

public class Travel {
	public boolean isCarDriver(Driver driver) {
		return "Car".equalsIgnoreCase(driver.getCategory());
	}

	public String retrievebyDriverId(ArrayList<Driver> list, int driverId) {
		for (Driver d : list) {
			if (d.getDriverId() == driverId) {

				return "Driver name is " + d.getDriverName() + " belonging to the category " + d.getCategory()
						+ " traveled " + d.getTotalDistance() + " km so far";
			}
		}
		return "not found";
	}

	public int retrieveCountOfDriver(ArrayList<Driver> list, String category) {
		int count = 0;
		for (Driver d : list) {
			if (category.equalsIgnoreCase(d.getCategory())) {
				count++;
			}
		}
		return count;
	}

	public ArrayList<Driver> retrieveDriver(ArrayList<Driver> list, String category) {
		ArrayList<Driver> result = new ArrayList<>();
		for (Driver d : list) {
			if (category.equalsIgnoreCase(d.getCategory())) {
				result.add(d);
			}
		}
		return result;
	}

	public Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> list) {
		if (list == null || list.isEmpty())
			return null;

		Driver maxDriver = list.get(0);

		for (Driver d : list) {
			if (d.getTotalDistance() > maxDriver.getTotalDistance()) {
				maxDriver = d;
			}
		}
		return maxDriver;
	}
}
