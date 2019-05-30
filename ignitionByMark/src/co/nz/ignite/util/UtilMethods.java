package co.nz.ignite.util;

/**
 * Created by jesperbergman on 2018-03-24.
 */
public class UtilMethods {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
