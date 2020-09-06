import java.awt.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Hello {

public static void main (String[] args) {
 for (int i=1;i<=10;i++){ 
  System.out.println("Hello World This is Ravi.. "+i);
  System.out.println("This is my World With 2kids..");
System.out.println("I Stay in Bangalore..");
DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
Date dateobj = new Date();
System.out.println(df.format(dateobj));
     }
   }
}
