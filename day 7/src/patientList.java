/**
 * Created by Ehshan on 10/11/2014.
 */

public class patientList {

    private patientNode firstPatient;

    public patientList(){
        firstPatient = null;
    }

    public void addPatient(patientNode newPatient) {
        if(firstPatient==null) {
            firstPatient = newPatient;
        } else {
            patientNode currentPatient = firstPatient;
            while(currentPatient.getNext()!=null) {
                currentPatient = currentPatient.getNext();
            }
            currentPatient.setNext(newPatient);
        }
    }

    public boolean deletePatient(patientNode patient){
        patientNode currentPatient = firstPatient;
        if (firstPatient == null){
            return false;
        }else if (firstPatient == patient){
            currentPatient  = currentPatient.getNext();
            return true;
        }else{
            currentPatient  = currentPatient.getNext();
            return currentPatient.deletePatient(patient);
        }
    }


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
