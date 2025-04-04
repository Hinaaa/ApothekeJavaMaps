package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        //current medicine Count
        System.out.println("Number of medicines in Pharmacy: " +pharmacy.getCount());
        //save new medicine
        Medication medications = new Medication("Cetirizine", 4.50, "In Stock"); //new medicine
        pharmacy.save(medications);
        //display medicine
        pharmacy.displayMedicines();
        //display medicine count after new medicine added
        System.out.println("Number of medicines in Pharmacy after adding new Medicine: "+pharmacy.getCount());

        //find medicine
        System.out.println("Medicine Found, Name: "+ pharmacy.findMedicine("Aspirin"));


        //delete Medicine
        pharmacy.deleteMedicine("Ibuprofen");
        //validate Count after deleting enter and Display to see its not appearing
        System.out.println("Number of medicines in Pharmacy after deleting given Medicine: " +pharmacy.getCount());
        pharmacy.displayMedicines();
    }
}
