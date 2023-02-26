package laboratory2.ui;

import java.io.FileNotFoundException;

import laboratory2.dao.BlockSectionDA;

public class COMReportVersion2 {
    public COMReportVersion2() throws FileNotFoundException {
        new BlockSectionDA();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new COMReportVersion2();
    }
}
