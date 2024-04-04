package com.learning.core.day2session1;

public class D02P02 {

	public static void main(String[] args) {
		
		MedicineInfo medicine1 = new Tablet();
        MedicineInfo medicine2 = new Syrup();
        MedicineInfo medicine3 = new Ointment();

        System.out.println("Label for Tablet:");
        medicine1.displayLabel();

        System.out.println("\nLabel for Syrup:");
        medicine2.displayLabel();

        System.out.println("\nLabel for Ointment:");
        medicine3.displayLabel();

	}

}
