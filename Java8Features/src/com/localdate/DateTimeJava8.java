package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class DateTimeJava8 {
	

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate dob = LocalDate.of(2002, 03, 19);
		System.out.println(dob);

		LocalDate yestday = LocalDate.parse("2025-06-20");
		System.out.println(yestday);

		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());

		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow.getDayOfWeek());

		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday.getDayOfWeek());

		System.out.println(yesterday.isBefore(today));
		System.out.println(yesterday.isAfter(today));
		System.out.println(today.isAfter(yesterday));
		System.out.println(today.isBefore(yesterday));

		LocalDate leap = LocalDate.of(2024, 01, 10);
		System.out.println(leap.isLeapYear());

		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMMM-yyyy"); // MMMM - month name
		DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("MM/dd/YYYY");

		System.out.println(today);
		System.out.println(today.format(pattern1));
		System.out.println(LocalDate.of(2025, 6, 21).format(pattern));

	}
}
