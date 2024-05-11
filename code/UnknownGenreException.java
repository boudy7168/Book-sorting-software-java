package Assignment_2;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;	

public class UnknownGenreException extends Exception{

public UnknownGenreException(String file, String genre, String line) {
        super(file);
        try{
        FileOutputStream out= new FileOutputStream("C:\\Users\\Moham\\Desktop\\syntax_error_file.txt",true);
        PrintWriter write= new PrintWriter(out);

        write.println("syntax error in file: "+file);
        write.println("===================");
        write.println("Error: Unknown Genre "+genre);
        write.println("Record: "+line);
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
