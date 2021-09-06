package com.tek;

import java.awt.Desktop;
import java.awt.Frame;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OpenBrowser {
	public static String GetHumanReadableDate(long epochSec, String dateFormatStr) {
	    Date date = new Date(epochSec * 1000);
	    SimpleDateFormat format = new SimpleDateFormat(dateFormatStr,
	            Locale.getDefault());
	    return format.format(date);
	}
    public static void main(String[] args) throws Exception {
    	   long epoch = 1602783432;
    	
    	System.out.println(GetHumanReadableDate(epoch, "hh:mm:ss aa"));
    	System.out.println("=============================================");
    	
    	
    	
        String url = "https://v3test3.tekstac.com/";
        final String ANSI_RED = "\u001B[31m";
      final String ANSI_GREEN = "\u001B[32m";
   
      TimeZone zone = TimeZone.getTimeZone("GMT+5:30"); 
      System.out.println("zone=="+zone);
      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
      System.out.println(sdf.getTimeZone());
      sdf.setTimeZone(zone);
      String date = sdf.format(new java.util.Date (epoch)); 
 // 	String resultX = LocalTime.parse(date).format(DateTimeFormatter.ofPattern("h:mma"));
     // String date = new java.text.SimpleDateFormat("HH:mm:ss").setTimeZone(Locale.ENGLISH);
    		  //format(new java.util.Date (epoch)); 
      System.out.println(date);
      
      String format = "yyyy-MM-dd HH:mm:ss";
       sdf = new SimpleDateFormat(format);
    	   sdf.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
      sdf.setTimeZone(TimeZone.getDefault());
     System.out.println( sdf.format(new Date(epoch)));
      
      
      /*  if (Desktop.isDesktopSupported()) {
             Desktop.getDesktop().browse(new URI(url));
        } else {
            System.out.println("Your system not support browser open facility");
        }*/
     /* JOptionPane.showMessageDialog(null,
    		  "\u274c" + "<html><h2><font color='red'>Hello</font>, world </h2></html>"+"\n"+"<html><h2><font color='red'>Hello</font>, world </h2></html>");
        System.out.println("\u2718" + "This text is red!") ;*/
     /* JDialog d = new JDialog(new Frame(), "Assesment Warning", true); 
      d.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
      d.setUndecorated(true);
      d.add( new JLabel ("Your Assessment is paused."));  
  //    d.add(b);   
      d.setSize(300,300);    
      d.setVisible(true); 
      
      d.dispose();*/
       }
}