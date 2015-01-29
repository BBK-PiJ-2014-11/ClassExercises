package UpDownCasting;

/**
 * Created by Ehshan on 19/01/2015.
 */
public class SmartPhone extends MobilePhone {
    public SmartPhone(String brand) {
        super(brand);
    }


    public void browseWeb(String url) {
        System.out.println("Opening " + url + "...");
    }

    public double[] findPosition() {
        double[] location = {51.520997, -0.127844};
        System.out.println("Latitude: " + location[0]);
        System.out.println("Longitude: " + location[1]);
        return location;
    }

    @Override
    public void call(String number) {
        if(number.charAt(0)=='+') {
            System.out.println("Calling " + number + " through the internet to save money");
            logCall(number);
        } else {
            super.call(number);
        }
    }

    public void playGame(String gameName) {
        System.out.println("Opening " + gameName + "...");
    }
}
