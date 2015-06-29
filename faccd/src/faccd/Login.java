package faccd;

import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;
import java.text.*;
public class Login 
{
 public static void main(String[] args)
 {
	 System.out.println('1');
	 String aa = "hahaha";
	 System.out.println("132456" +'\t' +aa);
	 System.out.println('\u2605');
	 @SuppressWarnings("unused")
	 boolean ad = 20<40?true:false;
	 System.out.println(ad);
      String kfg = "123456789";
      for(char a:kfg.toCharArray())
      {
    	  System.out.println(a);
      }
      int indexq = kfg.indexOf("3");
      System.out.println(indexq);
      char qqq = kfg.charAt(5);
      System.out.println(qqq);
     
      String b1 = "aaaa1";
      String b2 = "aaaA1";
     
      boolean ka=  b1.equals(b2);
      boolean kb = b1.equalsIgnoreCase(b2);
      System.out.println(ka+"|"+kb);
      
      
      System.out.println("----------------------");
      String c1 = "b";
      String c2  = "a";
      String c3 = "A";
     int d1 =  c1.compareTo(c2);
     int d2= c1.compareTo(c3);
     int d3 = c1.compareToIgnoreCase(c3);   
     System.out.println(d1+"||"+d2+"||"+d3);
     System.out.println("----------------------");
     String e1 = "asdasd,asdasdasd,asdasdasdasd,ddd";
     String[] e2 = e1.split(","); 
       for (String e3 :e2)
    	   System.out.println(e3 + "           ");

      // Fromrun a = new  Fromrun();
      // a.show();
       
       System.out.println("----------------------");
       Date date = new  Date();
       String s = String.format("%tF",date);
       System.out.println(s);
       System.out.println("----------------------");
       Boolean fa = Pattern.matches("\\w+@\\w+(\\.\\w+)*\\.\\w+", "569878931@qq.com");
       System.out.println("email regex "+fa);
       System.out.println("----------------------");
       
       
       
       String str ="";
       Long stime = System.currentTimeMillis();
       for(int i= 0 ;i<10000;i++)
       {
    	   str = str +i;
       }
       Long etime = System.currentTimeMillis();
       Long time = etime - stime;
       System.out.println(time);
       
       StringBuilder sb = new StringBuilder();
       stime = System.currentTimeMillis();
       for(int j =0;j<10000;j++)
       {
    	   sb.append(j);
       }
       etime = System.currentTimeMillis();
       time = etime - stime;
       System.out.println(time);
       
       System.out.println("----------------------");
       int arr[] = new int[]{45,12,33,100};
       Arrays.fill(arr, 1,2,8);
       Arrays.sort(arr);
       for(int a : arr)
       {
    	   System.out.println(a);
       }
       
       
       System.out.println("----------------------");
       int[] arrs = new  int[]{8,20,60,	18};
       int ind1 = Arrays.binarySearch(arrs,0,1, 8);
       System.out.println(ind1);
       System.out.println("----------------------");
       DecimalFormat format1 = new DecimalFormat("###,###.####");
       String otu = format1.format(123456.11);
       System.out.println(otu);
       
 }
}
