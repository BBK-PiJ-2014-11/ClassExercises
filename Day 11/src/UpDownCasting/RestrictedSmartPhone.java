package UpDownCasting;

/**
 * Created by Ehshan on 01/12/2014.
 */
public class RestrictedSmartPhone extends SmartPhone {
    public RestrictedSmartPhone(String brand) {
        super(brand);
    }

    @Override
    public void playGame(String game) {
        System.out.println(game + " has restricted access on this version of " + getBrand());
    }
}
