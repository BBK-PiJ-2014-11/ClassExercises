/**
 * Created by Ehshan on 09/01/2015.
 */
public class patientNode {

        private String name;
        private int age;
        private String illness;
        private patientNode nextPatient;


        public patientNode(String name, int age, String illness){
            this.name = name;
            this.age = age;
            this.illness = illness;
            this.nextPatient = null;
        }

        public patientNode getNext() {
            return this.nextPatient;
        }

        public void setNext(patientNode patient) {
            this.nextPatient = patient;
    }


}
