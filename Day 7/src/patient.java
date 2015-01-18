/**
 * Created by Ehshan on 10/11/2014.
 */

public class patient {

    public String name;
    public int age;
    public String illness;
    private patient nextPatient;

    public patient(String name, int age, String illness){
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void addPatient(patient newPatient){
        if (this.nextPatient == null){
            this.nextPatient = newPatient;
        }else{
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(patient patient){
        if (this.nextPatient == null){
            return false;
        }else if (this.nextPatient.name.equals(patient.name)){
            this.nextPatient = nextPatient.nextPatient;
            return true;
        }else{
            return this.nextPatient.deletePatient(patient);
        }
    }

    public boolean print(patient patient){
        if (this.nextPatient == null){
            System.out.println (this.name + " " + this.age + " " + this.illness);
            return false;
        }else{
            System.out.println (this.name + " " + this.age + " " + this.illness);
            return this.nextPatient.print(patient);
        }
    }
}
