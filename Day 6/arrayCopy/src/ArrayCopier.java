/**
 * Created by Ehshan on 05/11/2014.
 */
public class ArrayCopier {

    public static void copy(int[] src, int[] dst) {

        if (src.length >= dst.length){

            for (int i = 0; i < src.length; i++) {
                dst[i] = src[i];
            }

        }else{

            for (int i = 0; i < dst.length; i++) {
                dst[i] = src[i];
            }

        }
    }
}
