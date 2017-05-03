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
            System.out.println(prop.getProperty("id"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
