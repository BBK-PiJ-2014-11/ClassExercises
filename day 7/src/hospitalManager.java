/**
 * Created by Ehshan on 10/11/2014.
 */
public class hospitalManager {

    private patient patientListStart = null;
    public static void main(String[] args){
        hospitalManager admissions = new hospitalManager();
        admissions.launch();
    }
    public void launch(){
        patient one = new patient("Tom",18, "Tuberculosis");
        patientListStart = one;
        patient two = new patient("Dick", 72, "Flu");
        patientListStart.addPatient(two);
        patient three = new patient("Harry", 43, "Broken Leg");
        patientListStart.addPatient(three);
        patient four = new patient("Sally", 20, "Broken Heart");
        patientListStart.addPatient(four);
        patient five = new patient("Rita", 28, "Daibetic");
        patientListStart.addPatient(five);
        patient six = new patient("Mr Fisher", 40,"Unspecified");
        patientListStart.addPatient(six);
        patient seven = new patient("Anon", 35, "Depression");
        patientListStart.addPatient(seven);
        patient eight = new patient("Joe", 9, "Cold");
        patientListStart.addPatient(eight);
        patient nine = new patient("Jane", 16, "Cancer");
        patientListStart.addPatient(nine);
        patient ten = new patient("Mrs Etc", 60, "Unknown");
        patientListStart.addPatient(ten);

        System.out.println("Admissions");
        patientListStart.print(patientListStart);
        System.out.println("");

        patientListStart.deletePatient(one);
        patientListStart.deletePatient(two);
        patientListStart.deletePatient(eight);


        System.out.println("Admissions Updated");
        patientListStart.print(patientListStart);
    }

}
