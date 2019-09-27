/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countlines;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ITTFFW
 */
public class SourceCount  {
    
    public static void main(String[] args) throws IOException {
File myFile = new File("C:\\Users\\ITTFFW\\Documents\\NetBeansProjects\\CountLines\\src\\countlines\\Hello.java"); //change to your file location
Scanner sc = new Scanner(myFile); //read the file
String data; // variable for read data
int scomment=0; //declare and initialise single line comment
int mcomment=0; //declare and initialise block comment
int lines=0; //declare and initialise lines

while(sc.hasNextLine()){//loop through the file 
data=sc.nextLine();
if(data.contains("/*") || data.contains("*/")){
mcomment ++; //increase block comment count lines
} //end if
if(data.contains("//")){
scomment ++; //increase single line comment count lines
}//end if
  if(!(data.contains("//")) && !(data.contains("*/")) && !(data.contains("/*"))&& !data.contains("*")){
   lines ++; // increase lines count if line does not contain these 
   }
   
} //end wloop
    System.out.println("<<<<<<Counting Code Lines>>>>>>>>"); //&& 
    System.out.println("Code Lines-> "+ lines); //&& 
   }
}
