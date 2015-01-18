/**
 * Created by Ehshan on 10/11/2014.
 */
public class patientCircularList {

    private patientNode firstPatient;

    public patientCircularList(){
        firstPatient = null;
    }

    public void addPatient(patientNode newPatient) {
        if(firstPatient == null) {
            firstPatient = newPatient;
            firstPatient.setNext(newPatient);
        } else {
            patientNode currentPatient = firstPatient;
            while(currentPatient.getNext()!= firstPatient) {
                currentPatient = currentPatient.getNext();
            }
            currentPatient.setNext(newPatient);
            newPatient.setNext(firstPatient);
        }
    }


    public boolean deletePatient(patientNode newPatient) {
        if(firstPatient == null) {
            //empty list
            return false;
        } else if(firstPatient == newPatient) {
            patientNode lastPatient = firstPatient;
            while(lastPatient.getNext()!= firstPatient) {
                lastPatient = lastPatient.getNext();
            }
            lastPatient.setNext(firstPatient.getNext());
            firstPatient = firstPatient.getNext();
        } else {
            patientNode currentPatient = firstPatient;
            while(true) {
                if(currentPatient.getNext() == firstPatient) {
                    return false;
                } else if(currentPatient.getNext()== newPatient) {
                    currentPatient.setNext(currentPatient.getNext().getNext());
                    break;
                } else {
                    currentPatient = currentPatient.getNext();
                }
            }
        }
        return true;
    }



    public int queueLength() {
        int length = 0;
        if(firstPatient != null) {
            length++;
            patientNode currentPatient = firstPatient;
            while(currentPatient.getNext()!=firstPatient) {
                length++;
                currentPatient = currentPatient.getNext();
            }
        }
        return length;
    }


    //debugging
    public patientNode getLastPatient() {
        if(firstPatient == null) {
            //empty list
            return null;
        } else {
            patientNode currentPatient = firstPatient;
            //printOut(firstPatient);
            //printOut(currentPatient);
            while(currentPatient.getNext()!= firstPatient) {
                //printOut(currentPatient);
                currentPatient = currentPatient.getNext();
                //printOut(currentPatient);
            }
            printOut(currentPatient);
            return currentPatient;
        }
    }



    //changed from boolean to void
    //applied to each patientNode
    public void print() {
        if (firstPatient == null) {
            System.out.println("Empty List");
            return;
        } else {
            patientNode currentPatient = firstPatient;
            printOut(firstPatient);
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
}
