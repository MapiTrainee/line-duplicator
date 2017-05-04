package eu.mapidev.duplicator.rule;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.rules.ExternalResource;

public class SystemOutPrint extends ExternalResource {

    private OutputStream os;

    public SystemOutPrint() {
    }

    @Override
    protected void before() throws Throwable {
        os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
    }

    @Override
    protected void after() {
        PrintStream originalOut = System.out;
        System.setOut(originalOut);
    }

    public String getPrint() {
        return os.toString();
    }

    public String getPrintln() {
        return os.toString() + System.getProperty("line.separator");
    }

}
