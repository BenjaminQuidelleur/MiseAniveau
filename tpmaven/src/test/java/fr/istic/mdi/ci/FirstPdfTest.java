package fr.istic.mdi.ci;
import junit.framework.*;
public class FirstPdfTest extends TestCase{
    public void testCalculer() throws Exception {

        assertEquals(2, fr.esir.mdi.ci.tpmaven.FirstPdf.calculer(1,1));
    }
}
