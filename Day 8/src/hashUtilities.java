/**
 * Created by Ehshan
 */
public class hashUtilities {
    public static int shortHash(int value) {
        return Math.abs(value%1000);
    }
}
