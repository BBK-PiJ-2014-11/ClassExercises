package Phone;

/**
 * Created by Ehshan on 01/12/2014.
 */
public class OldPhone implements Phone {
    private String brand = null;

    public OldPhone(String brand) {
        this.brand = brand;
    }

    public void call(String number) {
        System.out.println("Calling " + number+"...");
    }

    public String getBrand() {
        return brand;
    }
}
