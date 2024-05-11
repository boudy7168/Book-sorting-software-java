package Assignment_2;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class BadYearException extends Exception{

    public BadYearException() {
    }

    public BadYearException(String string1, String string2) {
        super(string1);
        try{
            FileOutputStream out= new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\semanticErrors.txt",true);
            PrintWriter write= new PrintWriter(out);
            write.println();

            write.println("semantic error in file: "+string1);
            write.println("===================");
            write.println("Error: Invalid year");
            write.println("Record: "+string2);
            write.println();

            write.flush();
            out.close();
            write.close();

        }
        catch(Exception e)
        {
            System.out.println("Cannot create semantic error file");
        }
    }
}
