package Patients;

import java.util.List;
import java.util.ArrayList;

public class PatientTest {
    private List<Patient> patients;

    public PatientTest(){
        patients = new ArrayList<Patient>();
    }

    public static void main(String[] args){
        PatientTest newList = new PatientTest();
        newList.launch();
    }

    public void launch(){
        patients.add(new Patient("Tom", 1985));
        patients.add(new Patient("Dick",1950));
        patients.add(new Patient("Harry",1875));

        for (int i = 0; i<patients.size(); i++){
            Patient p =  patients.get(i);
            System.out.println("Patient Name: "+p.getName() + ", Patient Age: " +(p.currentYear()-p.birthYear()));
        }
    }
}