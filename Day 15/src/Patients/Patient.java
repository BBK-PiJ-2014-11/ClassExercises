package Patients;

/**
 * Created by Ehshan on 26/01/2015.
 */

import java.util.Calendar;

public class Patient {

    private String name;
    private int birthYear;
    private int currentYear;

    public String getName(){
        return name;
    }

    public int birthYear(){
        return birthYear;
    }

    public int currentYear(){
        return currentYear;
    }

    public Patient(String name, int birthYear) throws IllegalArgumentException {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if (currentYear - birthYear >= 0 && currentYear - birthYear <= 130) {
            this.name = name;
            this.birthYear = birthYear;
        } else {
            throw new IllegalArgumentException("Impossible! you can't be "+(currentYear - birthYear)+" years old!");
        }
    }

}

