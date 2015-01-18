/**
 * Created by Ehshan on 10/11/2014.
 */
public class hospitalManager {

    private patient patientListStart = null;

    public static void main(String[] args){
        hospitalManager admissions = new hospitalManager();
        admissions.launch();
        System.out.println("");
        admissions.patientListTest();
        admissions.doubleListTest();
        admissions.circularTest();
    }

    //linked list using patient class

    public void launch(){
        patient one = new patient("Tom",18, "Tuberculosis");
        patientListStart = one;
        patient two = new patient("Dick", 72, "Flu");
        patientListStart.addPatient(two);
        patient three = new patient("Harry", 43, "Broken Leg");
        patientListStart.addPatient(three);
        patient four = new patient("Sally", 20, "Broken Heart");
        patientListStart.addPatient(four);
        patient five = new patient("Rita", 28, "Diabetic");
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

        System.out.println("Deleting Tom");
        patientListStart.deletePatient(one);
        System.out.println("Deleting Dick");
        patientListStart.deletePatient(two);
        System.out.println("Deleting Harry");
        patientListStart.deletePatient(eight);


        System.out.println("Admissions Updated");
        patientListStart.print(patientListStart);
        System.out.println("");
    }

    //linked list using patientNode class ()

    public void patientListTest(){
        //creating new list
        patientList listTest = new patientList();
        //adding patient to list
        System.out.println("Patient admissions with patientNode class test");
        System.out.println("");
        patientNode one = new patientNode("Tom",18, "Tuberculosis");
        listTest.addPatient(one);
        patientNode two = new patientNode("Dick", 72, "Flu");
        listTest.addPatient(two);
        patientNode three = new patientNode("Harry", 43, "Broken Leg");
        listTest.addPatient(three);
        patientNode four = new patientNode("Sally", 20, "Broken Heart");
        listTest.addPatient(four);
        patientNode five = new patientNode("Rita", 28, "Diabetic");
        listTest.addPatient(five);
        patientNode six = new patientNode("Mr Fisher", 40,"Unspecified");
        listTest.addPatient(six);
        patientNode seven = new patientNode("Anon", 35, "Depression");
        listTest.addPatient(seven);
        patientNode eight = new patientNode("Joe", 9, "Cold");
        listTest.addPatient(eight);
        patientNode nine = new patientNode("Jane", 16, "Cancer");
        listTest.addPatient(nine);
        patientNode ten = new patientNode("Mrs Etc", 60, "Unknown");
        listTest.addPatient(ten);
        //printing out list
        printList(listTest);
        //printing list length
        System.out.println("List length is "+ listTest.queueLength()+" patients");
        System.out.println("");

        //Deleting patients
        System.out.println("Deleting Tom");
        listTest.deletePatient(one);
        System.out.println("Deleting Dick");
        listTest.deletePatient(two);
        System.out.println("Deleting joe");
        listTest.deletePatient(eight);
        System.out.println("");
        //printing out updated list
        printList(listTest);
        //printing list length
        System.out.println("List length is "+ listTest.queueLength()+" patients");
        System.out.println("");

    }

    public void doubleListTest(){
        patientDoubleList doubleTest = new patientDoubleList();
        System.out.println("Patient admissions using double linked list");
        System.out.println("");
        patientNode one = new patientNode("Tom",18, "Tuberculosis");
        doubleTest.addPatient(one);
        patientNode two = new patientNode("Dick", 72, "Flu");
        doubleTest.addPatient(two);
        patientNode three = new patientNode("Harry", 43, "Broken Leg");
        doubleTest.addPatient(three);
        patientNode four = new patientNode("Sally", 20, "Broken Heart");
        doubleTest.addPatient(four);
        patientNode five = new patientNode("Rita", 28, "Diabetic");
        doubleTest.addPatient(five);
        patientNode six = new patientNode("Mr Fisher", 40,"Unspecified");
        doubleTest.addPatient(six);
        patientNode seven = new patientNode("Anon", 35, "Depression");
        doubleTest.addPatient(seven);
        patientNode eight = new patientNode("Joe", 9, "Cold");
        doubleTest.addPatient(eight);
        patientNode nine = new patientNode("Jane", 16, "Cancer");
        doubleTest.addPatient(nine);
        patientNode ten = new patientNode("Mrs Etc", 60, "Unknown");
        doubleTest.addPatient(ten);
        //printing out list
        printList(doubleTest);
        //printing list length
        System.out.println("List length is "+ doubleTest.queueLength()+" patients");
        System.out.println("");

        //Deleting patients
        System.out.println("Deleting Tom");
        doubleTest.deletePatient(one);
        System.out.println("Deleting Dick");
        doubleTest.deletePatient(two);
        System.out.println("Deleting joe");
        doubleTest.deletePatient(eight);
        printList(doubleTest);
        System.out.println("");

        //print backwards
        backwardsPrint(doubleTest);
        System.out.println("");

        //printing last patient
        // System.out.println("Last patient is "+ doubleTest.getLastPatient());
        //printing list length
        System.out.println("List length is "+ doubleTest.queueLength()+" patients");
        System.out.println("");

    }

    public void circularTest(){
        patientCircularList circleTest = new patientCircularList();
        //adding patient to list
        System.out.println("Patient admissions using circular list");
        System.out.println("");
        patientNode one = new patientNode("Tom",18, "Tuberculosis");
        circleTest.addPatient(one);
        patientNode two = new patientNode("Dick", 72, "Flu");
        circleTest.addPatient(two);
        patientNode three = new patientNode("Harry", 43, "Broken Leg");
        circleTest.addPatient(three);
        patientNode four = new patientNode("Sally", 20, "Broken Heart");
        circleTest.addPatient(four);
        patientNode five = new patientNode("Rita", 28, "Diabetic");
        circleTest.addPatient(five);
        patientNode six = new patientNode("Mr Fisher", 40,"Unspecified");
        circleTest.addPatient(six);
        patientNode seven = new patientNode("Anon", 35, "Depression");
        circleTest.addPatient(seven);
        patientNode eight = new patientNode("Joe", 9, "Cold");
        circleTest.addPatient(eight);
        patientNode nine = new patientNode("Jane", 16, "Cancer");
        circleTest.addPatient(nine);
        patientNode ten = new patientNode("Mrs Etc", 60, "Unknown");
        circleTest.addPatient(ten);
        //printing out list
        //printList(circleTest);
        //printing list length
        System.out.println("List length is "+ circleTest.queueLength()+" patients");
        System.out.println("");

        //Deleting patients
        System.out.println("Deleting Tom");
        circleTest.deletePatient(one);
        System.out.println("Deleting Dick");
        circleTest.deletePatient(two);
        System.out.println("Deleting joe");
        circleTest.deletePatient(eight);
        System.out.println("");

        //printing last patient
        System.out.println("Last patient is "+circleTest.getLastPatient());
        //circleTest.print(circleTest.getLastPatient());
        //printing list length
        System.out.println("List length is "+ circleTest.queueLength()+" patients");
        System.out.println("");


    }

    public void printList(patientList list) {
        System.out.println("Admissions (second batch)");
        list.print();
        System.out.println("");
    }

    public void printList(patientDoubleList list) {
        System.out.println("Admissions (double list)");
        list.print();
        System.out.println("");
    }

    public void backwardsPrint(patientDoubleList list) {
        System.out.println("Admissions list backwards");
        list.printBackwards();
        System.out.println("");
    }


    public void printList(patientCircularList list) {
        System.out.println("Admissions (done in a circle)");
        list.print();
        System.out.println("");
    }


}


