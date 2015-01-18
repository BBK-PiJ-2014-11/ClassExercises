/**
 * Created by Ehshan on 10/11/2014.
 */

/**
 * Same as patient.java using a node class
 */

public class patientList {

    private patientNode firstPatient;

    public patientList(){
        firstPatient = null;
    }

    public void addPatient(patientNode patient) {
        if(firstPatient==null) {
            firstPatient = patient;
        } else {
            patientNode currentPatient = firstPatient;
            while(currentPatient.getNext()!=null) {
                currentPatient = currentPatient.getNext();
            }
            currentPatient.setNext(patient);
        }
    }

    public boolean deletePatient(patientNode patient){
        if (firstPatient == null){
            return false;
        }else if (firstPatient == patient){
            firstPatient  = firstPatient.getNext();
            return true;
        }else{
            patientNode currentPatient = firstPatient;
            while(true) {
                if(currentPatient.getNext()==null) {
                    //the selected patient does not exist
                    return false;
                } else	if(currentPatient.getNext()==patient) {
                    currentPatient.setNext(currentPatient.getNext().getNext());
                    break;
                } else {
                    currentPatient = currentPatient.getNext();
                }
            }
        }
        return true;
    }


    //changed from boolean to void
    //applied to each patientNode
    public void print() {
        if (firstPatient == null) {
            System.out.println("Empty List");
            return;
        } else {
            patientNode currentPatient = firstPatient;
            while (currentPatient.getNext() != null) {
                printOut(currentPatient);
                currentPatient = currentPatient.getNext();
            }
            printOut(currentPatient);
        }
    }

    //actual printout method
    public void printOut(patientNode patient){
        if (patient != null){
            System.out.println(patient.getName() + " " + patient.getAge() + " " + patient.getIllness());
        }
    }


    //Queue length:calculates length of list
    public int queueLength() {
        int length = 0;
        if(firstPatient!=null) {
            length = 1;
            patientNode currentPatient = firstPatient;
            while(currentPatient.getNext()!=null) {
                length++;
                currentPatient = currentPatient.getNext();
            }
        }
        return length;
    }


}
