package Hash;
/**
 * Created by Ehshan
 */
public class HashUtilities {
    public static int shortHash(int value) {
        return Math.abs(value%1000);
    }
}
