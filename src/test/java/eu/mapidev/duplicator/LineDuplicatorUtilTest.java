package eu.mapidev.duplicator;

import eu.mapidev.duplicator.rule.SystemOutPrint;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class LineDuplicatorUtilTest {

    @Rule
    public SystemOutPrint sout = new SystemOutPrint();

    @Test
    public void testPrintLine_correctArguments_duplicatedLineWithIteration() {
        LineDuplicatorUtil.printLine("User @i", 1, 1, 5);
        String separator = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append("User 1").append(separator);
        sb.append("User 2").append(separator);
        sb.append("User 3").append(separator);
        sb.append("User 4").append(separator);
        sb.append("User 5").append(separator);

        Assert.assertThat(sout.getPrint(), is(sb.toString()));
    }

    @Test
    public void testPrintLine_correctArgumentsWithNewIts_duplicatedLineWithIteration() {
        LineDuplicatorUtil.setIts("#it");
        LineDuplicatorUtil.printLine("Password#it", 1, 2, 5);
        String separator = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append("Password1").append(separator);
        sb.append("Password3").append(separator);
        sb.append("Password5").append(separator);

        Assert.assertThat(sout.getPrint(), is(sb.toString()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintLine_incorrectArguments_thrownException() {
        LineDuplicatorUtil.printLine("@i", 1, -2, 5);
    }

}
