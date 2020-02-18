import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JavaParseCsvFile {
    public static void main(String args[]){
        System.out.println("=============Java CSV Parse Example================");

        File csvFile=new File("sample_file.csv");

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(csvFile));
            CSVParser csvParser= CSVFormat.DEFAULT.parse(inputStreamReader);
            for (CSVRecord csvRecord:csvParser){
                System.out.println("Column 1 : "+csvRecord.get(0)+" | Column 2 : "+csvRecord.get(1)+"| Column 3 : "+csvRecord.get(2));
            }

        }
        catch (Exception e){
            System.out.println("Error in Parsing CSV File");
        }
    }
}
