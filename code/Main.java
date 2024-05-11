package Assignment_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		File[] bookfiles= new File[16];
		
		bookfiles[0]= new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books1995.csv.txt");
		bookfiles[1] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books1996.csv.txt");
	    bookfiles[2] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books1997.csv.txt");
	    bookfiles[3] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books1998.csv.txt");
	    bookfiles[4] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books1999.csv.txt");
	    bookfiles[5] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2000.csv.txt");
	    bookfiles[6] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2001.csv.txt");
	    bookfiles[7] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2002.csv.txt");
	    bookfiles[8] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2003.csv.txt");
	    bookfiles[9] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2004.csv.txt");
	    bookfiles[10] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2005.csv.txt");
	    bookfiles[11] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2006.csv.txt");
	    bookfiles[12] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2007.csv.txt");
	    bookfiles[13] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2008.csv.txt");
	    bookfiles[14] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2009.csv.txt");
	    bookfiles[15] = new File("C:\\Users\\samer\\OneDrive\\Desktop\\Files\\books2010.csv.txt");

		

        try {
        	Part2 part2 = new Part2();
            Part1 part1 = new Part1();
            part1.dopart1(bookfiles);
            //part2.dopart2(bookfiles);
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//        String line= ",Authors,,Price,ISBN,Genre,Released";
//        String []ar=line.split(",");
//        int count=0;
//        for(int i=0;i<ar[2].length();i++){
//            if(ar[2].charAt(i)==',') {
//                count++;}}



    }
}
