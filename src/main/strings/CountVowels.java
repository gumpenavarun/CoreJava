package main.strings;

import java.util.Scanner;
import java.lang.Integer;

public class CountVowels
{
   public static void main(String[] args)
   {
      String str;
      char ch;
      int len, i, vowel=0, consonant=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = s.nextLine();
      String regex = "^[a-zA-Z_ ]+$";
      str= str.replaceAll("\\s", "");
      if(str.matches(regex)){
           len = str.length();
      for(i=0; i<len; i++)
      {
         ch = str.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vowel++;
         else
            consonant++;
        
      }
      System.out.println("\nTotal Vowels = " +vowel);
      System.out.println("Total Consonants = " +consonant);
      }else{
           System.out.println("Please enter only String");
          
      }
      
      
      
     
   }
}