package laboratory2.dao;

import laboratory2.domain.BlockSection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BlockSectionDA {
    private ArrayList<BlockSection> blockSections;

    public BlockSectionDA() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src/blockSection.csv"));

        blockSections = new ArrayList<BlockSection>();

        while (scanner.hasNextLine()) {
            String[] blockSectionInfo = scanner.nextLine().split(",");

            StudentDA studentDA = new StudentDA(blockSectionInfo[0]);

            blockSections.add(new BlockSection(blockSectionInfo[0],
                    blockSectionInfo[1], blockSectionInfo[2], studentDA.getStudents()));
        }

        for (BlockSection blockSection : blockSections) {
            System.out.println(blockSection); // The only System.out.println();
        }

        scanner.close();
    }
}
