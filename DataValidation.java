/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datavalidation;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class DataValidation {
     public static boolean DDD = false;
     public static boolean DDDD = false;
     public static boolean DDDDD = false;
     public static boolean DDDDDD = false;
     public static boolean DDDDDDD = false;
     public static boolean DDDDDDDD = false;
     
     
    
    public static void step1 (String UI){
        
        if (UI.length()>=6)
        {
            System.out.println("That is The Correct Data Type");
            System.out.println("For The Next Step You Will Need Any String That Contains An a");
            DDD = true;
        }
        else if (UI.length()<6)
        {
            System.out.println("Sorry That Is Not What Is Needed, Please Try Again");
        }
    }
    
    public static void step2 (String UI1)
    {
        if (UI1.contains("a") || UI1.contains("A"))
        {
            System.out.println("That is the Correct data Type");
            System.out.println("For The Next Data Type You Will Need to Enter A string Between 5 and 15 With Anything But z");
        }
        else 
        {
            System.out.println("Sorry That is Not the Correct data Type, Please Try Again");
        }
    }
    
    public static void step3(String UI2)
    {
        if (UI2.contains("z") || UI2.contains("Z"))
        {
            System.out.println("Sorry That is Not the Correct data Type, Please Try Agian");
        }
          else if(UI2.length()>=5 && UI2.length()<=15)
        {
            System.out.println("That is the Correct data Type");
            System.out.println("For The Next Data Set You Will Need To Enter A Number Between 5 and 500");
        }
        
        
    }
    
    public static void step4(int Step4UI)
    {
       if (Step4UI >=5 && Step4UI <= 500) 
       {
           System.out.println("That Is The Correct Data Type");
           System.out.println("For The Next Data Type You will Need to Enter a Negitve Interger");
       }
       else 
       {
         System.out.println("Sorry That Is Not The Correct Data Type, Please try Again");
         System.exit(0);
       }
    }
    
    public static void step5(int Step5UI)
    {
        if (Step5UI < 0)
        {
            System.out.println("That Is The Correct Data Type");
            System.out.println("For The Next data Type You Will Need To Enter A Positive, Odd Integer");
        }
        else if (Step5UI >= 0)
        {
            System.out.println("Sorry That Is Not The Correct Data Type, Please Try Again");
        }
    }
    public static void step6(int Step6UI)
    {
        if (Step6UI  % 2 == 0)
        {
            System.out.println("Sorry That Is Not The Correct Data Type, Please Try Again");
        }
        else if (Step6UI > 0)
        {
            System.out.println("That Is The Correct Data Type");
        }
        else if (Step6UI < 0)
        {
                System.out.println("Sorry That Is Not The Correct Data Type, Please Try Again");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please Enter A String Greater Than 6 Characters");
        
        Scanner UserInput = new Scanner(System.in);
        String UI = UserInput.next();
    
        if(DDD = true){
        step1(UI);
      
        
        String UI1 = UserInput.next();
        if (DDDD = true)
        {
            step2(UI1);
            
        String UI2 = UserInput.next();
        if (DDDDD = true)
        {
            step3(UI2);
        
        
        
        int Step4UI = Integer.parseInt(UserInput.next());
        
        if (DDDDDD = true)
        {
            step4(Step4UI);
            
        int Step5UI = Integer.parseInt(UserInput.next());
        if (DDDDDDD = true)
        {
            step5(Step5UI);
            
        int Step6UI = Integer.parseInt(UserInput.next());
        if (DDDDDDDD = true)
        {
            step6(Step6UI);
        }
        }
        }
        }
        }
        }
  }
    
}
 


    

