package eu.mapidev.duplicator;

public class LineDuplicatorUtil {

    private static String its = "@i";

    public static void setIts(String its) {
        LineDuplicatorUtil.its = its;
    }

    public static void printLine(String string, int start, int step, int end) {
        if (string == null || its == null || step < 1) {
            System.out.println(string + " " + null + " " + step);
            throw new IllegalArgumentException("Strings can not be null and step less than 1!");
        }

        for (int i = start; i <= end; i += step) {
            String replace = string.replaceAll(its, String.valueOf(i));
            System.out.println(replace);
        }

    }

}
