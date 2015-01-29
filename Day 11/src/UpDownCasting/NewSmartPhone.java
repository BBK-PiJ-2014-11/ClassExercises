package UpDownCasting;

/**
 * Created by Ehshan on 08/12/2014.
 */
public class NewSmartPhone {

    public static void main(String[] args) {
        NewSmartPhone myPhone = new NewSmartPhone();
        myPhone.launch();
    }

    public void launch() {

        System.out.println("Regular Casting");
        System.out.println("------------------------------------");
        SmartPhone myPhone = new SmartPhone("My Phone");
        myPhone.call("100");
        myPhone.ringAlarm("Wake Up!");
        myPhone.playGame("Tetris");
        myPhone.browseWeb("www.bbc.com");
        myPhone.findPosition();
        System.out.println (myPhone.getBrand());
        myPhone.printLastNumbers();
        System.out.println("");

        System.out.println("Direct Up Casting");
        System.out.println("------------------------------------");
        MobilePhone myMobile = new SmartPhone("My Phone");
        SmartPhone myNewSmartPhone = (SmartPhone)myMobile;
        myMobile.call("100");
        myMobile.ringAlarm("Wake Up!");
        myNewSmartPhone.playGame("Tetris");
        myNewSmartPhone.browseWeb("www.bbc.com");
        myNewSmartPhone.findPosition();
        System.out.println (myMobile.getBrand());
        myMobile.printLastNumbers();
        System.out.println("");

        System.out.println("Indirect Up Casting");
        System.out.println("------------------------------------");
        testPhone(myNewSmartPhone);
    }

    public void testPhone(Phone newPhone){
        newPhone.call("0800 800150");
    }

}
