/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

/**
 *
 * @author Peter
 */
public class ArrayTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] grades = new String[]{
            "A","B","D","F"
        };
        
        for ( String each : grades ){
            System.out.println(each);
        };
        
        String[] grades2 = new String[]{
            grades[0],grades[1],"C",grades[2],grades[3]
        };
        
        for ( String each : grades2 ){
            System.out.println(each);
        }
        
    }
    
}
