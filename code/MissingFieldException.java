package Assignment_2;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class MissingFieldException extends Exception{
	public MissingFieldException() {
    }

    public MissingFieldException(String Filename, String missing, String line) {
        super(Filename);
        try{
            FileOutputStream out= new FileOutputStream("C:\\Users\\Moham\\Desktop\\syntax_error_file.txt",true);
            PrintWriter write= new PrintWriter(out);

            write.println("syntax error in file: "+Filename);
            write.println("===================");
            write.println("Error: Missing "+missing);
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
    }

}