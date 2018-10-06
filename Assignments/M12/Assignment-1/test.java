import java.util.Date;

public class test {
   public static void main(String args[]) {
// Instantiate a objects
Date date1 = new Date(24-8-1996);
Date date2 = new Date(25-8-1997);
        
  if(date1.compareTo(date2)<0){
System.out.println("Date1 is after Date2");
}else if(date1.compareTo(date2)>0){
System.out.println("Date1 is before Date2");
}else{
System.out.println("Date1 is equal to Date2");
}
       
   }
}