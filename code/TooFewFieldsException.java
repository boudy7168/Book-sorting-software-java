package Assignment_2;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TooFewFieldsException extends Exception{

    public TooFewFieldsException() {
    }

    public TooFewFieldsException(String string1, String string2) {
        super(string1);
        try{
            FileOutputStream out= new FileOutputStream("C:\\Users\\Moham\\Desktop\\syntax_error_file.txt",true);
            PrintWriter write= new PrintWriter(out);
            write.println();

            write.println("syntax error in file: "+string1);
            write.println("===================");
            write.println("Error: Too Few Fields");
            write.println("Record: "+string2);
            write.println();

            write.flush();
            out.close();
            write.close();

        }
        catch(Exception e)
        {
            System.out.println("Cannot create syntax error file");
        }
    }
}
