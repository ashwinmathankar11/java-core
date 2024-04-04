package com.learning.core.day2session1;

public class Syrup implements MedicineInfo{
	
	@Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on Doctors prescription.");
    }

}
