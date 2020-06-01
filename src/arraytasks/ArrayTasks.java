/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

import java.util.Arrays;

/**
 *
 * @author Peter
 */
public class ArrayTasks {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        //Task 1
        
        String[] grades = new String[]{
            "A","B","D","F"
        };
        
        for ( String each : grades ){
            System.out.println(each);
        };
        
        String[] grades2 = new String[5];
        
        System.arraycopy(grades, 0, grades2, 0, 2);  //using arraycopy method
        grades2[2] = "C";
        System.arraycopy(grades, 2, grades2, 3, 2);  //using arraycopy method
        
        
        /*String[] grades2 = new String[5]{
            grades[0],grades[1],"C",grades[2],grades[3]
        };*/

        
        for ( String each : grades2 ){
            System.out.println(each);
        }
        
        //Task 2
        
        String[] subjects = new String[]{
            "Math","English","Science"
        };
        
        System.out.println(subjects[1]);
        
        /*
        String[] subjects2 = new String[]{
            subjects[0],subjects[1],subjects[2],"History","P.E."
        };
        */
        

        String[] subjects2 = Arrays.copyOf(subjects, 5);  //Using copyOf method
        
        subjects2[3] = "History";
        subjects2[4] = "Fine Arts";
        
        for ( String each : subjects2 ){
            System.out.println(each);
        }
        
    }
    
}
