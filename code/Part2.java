package Assignment_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part2 {

	Scanner scanner;
	int count;
	String line;
	String[] bookInfo;
	String bookTitle;
	double price;
	String ISBN;
	int year;
	String errorType;
	int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13;

	public Part2() throws FileNotFoundException {
	}

	public void dopart2(File [] file) throws  FileNotFoundException {

    for(int i=0;i< file.length;i++){
    scanner = new Scanner(file[i]);

    while (scanner.hasNextLine())
    {     
    	line = scanner.nextLine();
        
        
        try {
        	if (line.contains("\"")) {
        		
        		String [] sepratedLine=line.split("\"");
        		bookTitle=sepratedLine[1];
        		bookInfo=sepratedLine[2].split(",");
        		
                if(bookInfo[3].length()==10) {
                	x1=Integer.parseInt(bookInfo[3].substring(0, 1));
                	x2=Integer.parseInt(bookInfo[3].substring(1, 2));
                	x3=Integer.parseInt(bookInfo[3].substring(2, 3));
                	x4=Integer.parseInt(bookInfo[3].substring(3, 4));
                	x5=Integer.parseInt(bookInfo[3].substring(4, 5));
                	x6=Integer.parseInt(bookInfo[3].substring(5, 6));
                	x7=Integer.parseInt(bookInfo[3].substring(6, 7));
                	x8=Integer.parseInt(bookInfo[3].substring(7, 8));
                	x9=Integer.parseInt(bookInfo[3].substring(8, 9));
                	x10=Integer.parseInt(bookInfo[3].substring(9));
                }
                else if(bookInfo[3].length()==13) {
                	x1=Integer.parseInt(bookInfo[3].substring(0, 1));
                	x2=Integer.parseInt(bookInfo[3].substring(1, 2));
                	x3=Integer.parseInt(bookInfo[3].substring(2, 3));
                	x4=Integer.parseInt(bookInfo[3].substring(3, 4));
                	x5=Integer.parseInt(bookInfo[3].substring(4, 5));
                	x6=Integer.parseInt(bookInfo[3].substring(5, 6));
                	x7=Integer.parseInt(bookInfo[3].substring(6, 7));
                	x8=Integer.parseInt(bookInfo[3].substring(7, 8));
                	x9=Integer.parseInt(bookInfo[3].substring(8, 9));
                	x10=Integer.parseInt(bookInfo[3].substring(9, 10));
                	x11=Integer.parseInt(bookInfo[3].substring(10, 11));
                	x12=Integer.parseInt(bookInfo[3].substring(11, 12));
                	x13=Integer.parseInt(bookInfo[3].substring(12));
                }	
                year=Integer.parseInt(bookInfo[5]);       
                price=Double.parseDouble(bookInfo[2]);
                
                if(!(year==1995||year==1996||year==1997||year==1998||year==1999||year==2000||
                		year==2001||year==2002||year==2003||year==2004||year==2005||
                		year==2006||year==2007||year==2008||year==2009||year==2010)) {
        		errorType="InvalidYearException in :"+file[i].getName();
                throw new BadYearException(errorType,line);
        	}
                
        	else if(price>0) {
        		errorType="InvalidPriceException in :"+file[i].getName();
                throw new BadPriceException(errorType,line);
        	}
        	else if(((10*x1 + 9*x2 + 8*x3 + 7*x4 + 6*x5 + 5*x6 + 4*x7 + 3*x8 + 2*x9 + 1*x10)%11)!=0) {
        		errorType="InvalidISBNException in :"+file[i].getName();
                throw new BadIsbn10Exception(errorType,line);
        	}
        	else if(((x1 +3*x2 +x3 +3*x4 +x5 +3*x6 +x7 +3*x8 +x9 +3*x10 +x11 +3*x12 +x13)%10)!=0) {
        		errorType="InvalidISBNException in :"+file[i].getName();
                throw new BadIsbn13Exception(errorType,line);
        	}
        }
        	
        	 else{
                 bookInfo=line.split(",");
                 
                 if(bookInfo[3].length()==10) {
                 	x1=Integer.parseInt(bookInfo[3].substring(0, 1));
                 	x2=Integer.parseInt(bookInfo[3].substring(1, 2));
                 	x3=Integer.parseInt(bookInfo[3].substring(2, 3));
                 	x4=Integer.parseInt(bookInfo[3].substring(3, 4));
                 	x5=Integer.parseInt(bookInfo[3].substring(4, 5));
                 	x6=Integer.parseInt(bookInfo[3].substring(5, 6));
                 	x7=Integer.parseInt(bookInfo[3].substring(6, 7));
                 	x8=Integer.parseInt(bookInfo[3].substring(7, 8));
                 	x9=Integer.parseInt(bookInfo[3].substring(8, 9));
                 	x10=Integer.parseInt(bookInfo[3].substring(9));
                 }
                 else if(bookInfo[3].length()==13) {
                 	x1=Integer.parseInt(bookInfo[3].substring(0, 1));
                 	x2=Integer.parseInt(bookInfo[3].substring(1, 2));
                 	x3=Integer.parseInt(bookInfo[3].substring(2, 3));
                 	x4=Integer.parseInt(bookInfo[3].substring(3, 4));
                 	x5=Integer.parseInt(bookInfo[3].substring(4, 5));
                 	x6=Integer.parseInt(bookInfo[3].substring(5, 6));
                 	x7=Integer.parseInt(bookInfo[3].substring(6, 7));
                 	x8=Integer.parseInt(bookInfo[3].substring(7, 8));
                 	x9=Integer.parseInt(bookInfo[3].substring(8, 9));
                 	x10=Integer.parseInt(bookInfo[3].substring(9, 10));
                 	x11=Integer.parseInt(bookInfo[3].substring(10, 11));
                 	x12=Integer.parseInt(bookInfo[3].substring(11, 12));
                 	x13=Integer.parseInt(bookInfo[3].substring(12));
                 }	
                 year=Integer.parseInt(bookInfo[5]);       
                 price=Double.parseDouble(bookInfo[2]);       
                        
                 if(!(year==1995||year==1996||year==1997||year==1998||year==1999||year==2000||
                 		year==2001||year==2002||year==2003||year==2004||year==2005||
                 		year==2006||year==2007||year==2008||year==2009||year==2010)) {
         		errorType="InvalidYearException in :"+file[i].getName();
                 throw new BadYearException(errorType,line);
         	}
                 
         	else if(price>0) {
         		errorType="InvalidPriceException in :"+file[i].getName();
                 throw new BadPriceException(errorType,line);
         	}
         	else if(((10*x1 + 9*x2 + 8*x3 + 7*x4 + 6*x5 + 5*x6 + 4*x7 + 3*x8 + 2*x9 + 1*x10)%11)!=0) {
         		errorType="InvalidISBNException in :"+file[i].getName();
                 throw new BadIsbn10Exception(errorType,line);
         	}
         	else if(((x1 +3*x2 +x3 +3*x4 +x5 +3*x6 +x7 +3*x8 +x9 +3*x10 +x11 +3*x12 +x13)%10)!=0) {
         		errorType="InvalidISBNException in :"+file[i].getName();
                 throw new BadIsbn13Exception(errorType,line);
         	}
         
                 
        	 }
        	
        	
        }
        catch (BadYearException e){
            line="";
        }
        catch (BadPriceException e){
            line="";
        }
        catch (BadIsbn10Exception e) {
        	line="";
        }
        catch (BadIsbn13Exception e) {
        	line="";
        }
        
}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}}
