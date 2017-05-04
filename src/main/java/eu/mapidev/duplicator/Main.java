package eu.mapidev.duplicator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties prop = new Properties();

        try {
            File mainPath = new File(Main.class.getProtectionDomain()
                    .getCodeSource().getLocation().getPath());
            String configPath = mainPath.getParentFile().getAbsolutePath();
            prop.load(new FileInputStream(configPath + "/ld.properties"));
            LineDuplicatorUtil.setIts(prop.getProperty("its"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (args == null) {
            throw new IllegalStateException("Arguments can not be null!");
        } else if (args.length == 3) {
            int start = Integer.parseInt(args[1]);
            int end = Integer.parseInt(args[2]);
            LineDuplicatorUtil.printLine(args[0], start, 1, end);
        } else if (args.length == 4) {
            int start = Integer.parseInt(args[1]);
            int step = Integer.parseInt(args[2]);
            int end = Integer.parseInt(args[3]);
            LineDuplicatorUtil.printLine(args[0], start, step, end);
        } else {
            System.out.println("You must specify at least 3 or 4 input arguments e.g.:\n"
                    + "\"Hello World!\" 1 5 or\n"
                    + "\"Hello World!\" 1 2 10 or\n"
                    + "\"Hello $i \" 1 5");
        }
    }
}
