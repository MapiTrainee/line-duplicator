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
            prop.load(new FileInputStream(configPath + "/lp.properties"));
            System.out.println("id=" + prop.getProperty("id"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (args == null) {
            throw new IllegalStateException("Arguments can not be null!");
        } else if (args.length == 3) {
            //todo
        } else if (args.length == 4) {
            //todo
        } else {
            System.out.println("You must specify at least 3 or 4 input arguments e.g. \n"
                    + "\"Hello World!\" 1 5 or \n"
                    + "\"Hello World!\" 1 2 10 \n"
                    + "\"Hello $i \" 1 5");
        }

    }
}
