package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
        Map<String,Medication>  pharmacyMedicines = new HashMap<>();//hold Medication objects as values
    Pharmacy() {
        pharmacyMedicines.put("Paracetamol", new Medication("Paracetamol", 5.99, "In Stock"));
        pharmacyMedicines.put("Ibuprofen", new Medication("Ibuprofen", 7.49, "Out of Stock"));
        pharmacyMedicines.put("Aspirin", new Medication("Aspirin", 4.99, "In Stock"));
        pharmacyMedicines.put("Diclofenac", new Medication("Diclofenac", 9.99, "In Stock"));
    }
    public int getCount() {
        return pharmacyMedicines.size();  // Directly access the size
    }

    public void save(Medication medication) {
        pharmacyMedicines.put(medication.getName(), medication); //adding medicine
        System.out.println("Pharmacy saved: " + medication.getName());
    }
    public void displayMedicines() {
        System.out.println("Medicines in Pharmacy: "+ pharmacyMedicines);
    }
    public Medication findMedicine(String medicineNameToFind) {
            if(pharmacyMedicines.keySet().contains(medicineNameToFind)) { //searching key
                return pharmacyMedicines.get(medicineNameToFind); //this get is fetching key. return pharmacyMedicines.get("Aspirin");
            }
        return null;
    }
    public void deleteMedicine(String medicineNameToDelete) {
        System.out.println(medicineNameToDelete);
        if(pharmacyMedicines.keySet().contains(medicineNameToDelete)) {
            pharmacyMedicines.remove(medicineNameToDelete);
        }
    }
}
