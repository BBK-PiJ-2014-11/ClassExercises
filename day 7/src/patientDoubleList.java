/**
 * Created by Ehshan on 10/11/2014.
 */
public class patientDoubleList {

    private patientNode firstPatient;

    public patientDoubleList() {
        firstPatient = null;
    }


    public void addPatient(patientNode newPatient) {
        if (firstPatient == null) {
            firstPatient = newPatient;
            return;
        } else {
            patientNode currentPatient = firstPatient;
            while (currentPatient.getNext() != null) {
                currentPatient = currentPatient.getNext();
            }
            currentPatient.setNext(newPatient);
            newPatient.setPrevious(currentPatient);
        }
    }

    public boolean deletePatient(patientNode patient) {
        if (firstPatient == null) {
            //empty list
            return false;
        } else if (firstPatient == patient) {
            firstPatient = firstPatient.getNext();
            firstPatient.setPrevious(null);
        } else {
            patientNode currentPatient = firstPatient;
            while (true) {
                if (currentPatient.getNext() == null) {
                    System.out.println("Patient to delete not found");
                    return false;
                } else if (currentPatient.getNext() == patient) {
                    currentPatient.setNext(currentPatient.getNext().getNext());
                    currentPatient.getNext().setPrevious(currentPatient);
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
    public void printOut(patientNode patient) {
        if (patient != null) {
            System.out.println(patient.getName() + " " + patient.getAge() + " " + patient.getIllness());
        }
    }

    public void printBackwards() {
        if (firstPatient == null) {
            System.out.println("Empty List");
            return;
        } else {
            patientNode currentPatient = firstPatient;
            while (currentPatient.getNext() != null) {
                currentPatient = currentPatient.getNext();
            }
            printOut(currentPatient);
            while (currentPatient.getPrevious() != null) {
                currentPatient = currentPatient.getPrevious();
                printOut(currentPatient);
            }
        }
    }

    //Queue length:calculates length of list
    public int queueLength() {
        int length = 0;
        if (firstPatient != null) {
            length = 1;
            patientNode currentPatient = firstPatient;
            while (currentPatient.getNext() != null) {
                length++;
                currentPatient = currentPatient.getNext();
            }
        }
        return length;
    }
}


