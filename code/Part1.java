package Assignment_2;

import java.io.File;
import  java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Part1 {
    PrintWriter cartoonWriter;
    PrintWriter hobbiesWriter;
    PrintWriter moviesWriter;
    PrintWriter musicWriter;
    PrintWriter nostalgiaWriter;
    PrintWriter oldTimesWriter;
    PrintWriter sportsWriter;
    PrintWriter trainsWriter;


    PrintWriter syntaxErrorWriter=new PrintWriter(new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\syntaxErrors.txt",true));
    Scanner scanner;
    String line;
    String missing;
    String bookTitle;
    String errorType;
    String[] bookInfo;
    int i;
    int count;
    public Part1() throws FileNotFoundException {

    }
    public void dopart1(File [] file) throws  FileNotFoundException {

        for(int i=0;i< file.length;i++){
        scanner = new Scanner(file[i]);

        while (scanner.hasNextLine())
        {      count=0;
            line = scanner.nextLine();

            try {

                if (line.contains("\"")) {

                     String [] sepratedLine=line.split("\"");
	                     bookTitle=sepratedLine[1];
	                        bookInfo=sepratedLine[2].split(",");
                        for(int p=0;p<sepratedLine[2].length();p++){
                        if(sepratedLine[2].charAt(p)==',') {
                            count++;}
                    }if(count>5){
                        errorType="TooManyFieldsException in :"+file[i].getName();
                        throw new TooManyFieldsException(errorType,line);
                    } else if (count<5) {
                        errorType="TooFewFieldsException in :"+file[i].getName();
                        throw  new TooFewFieldsException(errorType,line);

                    }


                    if(bookInfo.length>6||bookInfo.length<6){
                        missing="year";
                        throw new MissingFieldException(file[i].getName(),missing,line);

                    }

                    if(bookInfo[1].isEmpty()){
                        missing="authors";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }else if(bookInfo[2].isEmpty()){
                        missing="price";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }else if(bookInfo[3].isEmpty()){
                        missing="isbn";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }else if(bookInfo[4].isEmpty()){
                        missing="genre";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }
if(!bookInfo[4].equals("CCB")){
    
}



        }
                 else{
                     bookInfo=line.split(",");
                     for(int p=0;p<line.length();p++){

                        if(line.charAt(p)==',') {
                            count++;
                        }}if(count>5){
                        errorType="TooManyFieldsException in :"+file[i].getName();
                        throw new TooManyFieldsException(errorType,line);
                    } else if (count<5) {
                        errorType="TooFewFieldsException in :"+file[i].getName();
                        throw  new TooFewFieldsException(errorType,line);

                    }
                     if(bookInfo.length>6||bookInfo.length<6){
                         missing="year";
                         throw new MissingFieldException(file[i].getName(),missing,line);

                     }
                    if(bookInfo[0].isEmpty()){
                        missing="title";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }
                    else if(bookInfo[1].isEmpty()){
                        missing="authors";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }else if(bookInfo[2].isEmpty()){
                        missing="price";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }else if(bookInfo[3].isEmpty()){
                        missing="isbn";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }else if(bookInfo[4].isEmpty()){
                        missing="genre";
                        throw new MissingFieldException(file[i].getName(),missing,line);
                    }

                }

            }catch (TooManyFieldsException e){
                line="";
            }
            catch (TooFewFieldsException e){
                line="";

            }
            catch (MissingFieldException e) {
                line="";

            }
            System.out.println();
        }
        syntaxErrorWriter.flush();
        syntaxErrorWriter.close();
    }
    }

    public void dopart11(File [] file) throws  FileNotFoundException {

        cartoonWriter=new PrintWriter(new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\Cartoons_Comics_Books.csv.txt",true));
        hobbiesWriter=new PrintWriter(new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\Hobbies_Collectibles_Books.csv.txt",true));
        moviesWriter=new PrintWriter(new FileOutputStream("C:\\Users\\Moham\\Desktop\\Movies_TV.csv.txt",true));
        musicWriter=new PrintWriter(new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\Music_Radio_Books.csv.txt",true));
        nostalgiaWriter=new PrintWriter(new FileOutputStream("C:\\Users\\Moham\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\Nostalgia_Eclectic_Books.csv.txt",true));
        oldTimesWriter =new PrintWriter(new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\Old_Time_Radio.csv.txt",true));
        sportsWriter=new PrintWriter(new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\Sports_Sports_Memorabilia.csv.txt",true));
        trainsWriter=new PrintWriter(new FileOutputStream("C:\\Users\\samer\\eclipse-workspace\\COMP249_A2\\src\\Assignment_2\\Trains_Planes_Automobiles.csv.txt",true));


        for(int i=0;i< file.length;i++){
            scanner = new Scanner(file[i]);

            while (scanner.hasNextLine())
            {
                line = scanner.nextLine();
if(line.contains("CCB")){
    cartoonWriter.println(line);
    System.out.println(line);

}  if (line.contains("HCB")) {
    hobbiesWriter.println(line);
    System.out.println(line);
                
} if (line.contains("MTV")) {
    moviesWriter.println(line);

} if (line.contains("MRB")) {
    musicWriter.println(line);

} if (line.contains("NEB")) {
    nostalgiaWriter.println(line);

} if (line.contains("OTR")) {
    oldTimesWriter.println(line);

} if (line.contains("SSM")) {
    sportsWriter.println(line);

} if (line.contains("TPA")) {
    trainsWriter.println(line);
}
            }
            }
        cartoonWriter.flush();
        cartoonWriter.close();
        hobbiesWriter.flush();
        hobbiesWriter.close();
        moviesWriter.flush();
        moviesWriter.close();
        musicWriter.flush();
        musicWriter.close();
        nostalgiaWriter.flush();
        nostalgiaWriter.close();
        oldTimesWriter.flush();
        oldTimesWriter.close();
        sportsWriter.flush();
        sportsWriter.close();
        trainsWriter.flush();
        sportsWriter.close();
    }
}