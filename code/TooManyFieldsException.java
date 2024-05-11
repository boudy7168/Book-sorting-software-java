package Assignment_2;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TooManyFieldsException extends Exception{

    public TooManyFieldsException() {
    }

    public TooManyFieldsException(String file, String line) {
        super(file);
        try{

            FileOutputStream out= new FileOutputStream("C:\\Users\\Moham\\Desktop\\syntax_error_file.txt",true);
            PrintWriter write= new PrintWriter(out);
            write.println();
            write.println("syntax error in file: "+file);
            write.println("===================");
            write.println("Error: Too Many Fields");
            write.println("Record: "+line);

            write.println();


            write.flush();
            out.close();
            write.close();

        }
        catch(Exception e)
        {
            System.out.println("Cannot create syntax error file");
        }
//
    }


}