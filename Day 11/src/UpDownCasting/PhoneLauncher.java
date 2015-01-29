package UpDownCasting;
/**
 * Created by Ehshan on 01/12/2014.
 */
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher phoneTest = new PhoneLauncher();
        phoneTest.launch();
    }
    public void launch() {
        RestrictedSmartPhone newPhone = new RestrictedSmartPhone("Brick");


        System.out.println("Creating New Phone");
        System.out.println("------------------------------------");
        System.out.println("I have just purchased a "+newPhone.getBrand());
        System.out.println("");

        System.out.println("Checking empty call log");
        System.out.println("------------------------------------");
        newPhone.printLastNumbers();
        System.out.println("");

        System.out.println("Calling 4 chums");
        System.out.println("------------------------------------");
        newPhone.call("020 7631 6000");
        newPhone.call("1471");
        newPhone.call("999");
        newPhone.call("118 118");
        System.out.println("");

        System.out.println("Checking call log");
        System.out.println("------------------------------------");
        newPhone.printLastNumbers();
        System.out.println("");

        System.out.println("Calling more chums");
        System.out.println("------------------------------------");
        newPhone.call("100");
        newPhone.call("+0020 7631 6000");
        newPhone.call("Unknown");
        newPhone.call("Anonymous");
        newPhone.call("Private Number");
        newPhone.call("Myself");
        newPhone.call("0800 800150");
        newPhone.call("081 8118181");
        System.out.println("");

        System.out.println("Setting Alarm");
        System.out.println("------------------------------------");
        newPhone.ringAlarm("Wake Up");
        System.out.println("");

        System.out.println("Playing a Game");
        System.out.println("------------------------------------");
        newPhone.playGame("Tetris");
        System.out.println("");


        System.out.println("Web browsing");
        System.out.println("------------------------------------");
        newPhone.browseWeb("www.bbc.com");
        System.out.println("");

        System.out.println("Checking GPS");
        System.out.println("------------------------------------");
        newPhone.findPosition();
        System.out.println("");

        newPhone.printLastNumbers();
    }
}
