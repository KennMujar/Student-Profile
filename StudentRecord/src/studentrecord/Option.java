/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecord;

import java.util.Scanner;

/**
 *
 * @author Kenn Mujar
 */
public class Option {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        StudentInformation studentInfo = new StudentInformation();
        Scanner scanner = new Scanner(System.in);
        int choice;
      
        do{
            System.out.println("\n<-------Option------>");
            System.out.println("[1]Enter Student Information");
            System.out.println("[2]Enter Grades");
            System.out.println("[3]Display Information");
            System.out.println("[4]Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            
        switch(choice){
            case 1:
                studentInfo.scanInput(scanner);
                break;
            case 2:
                studentGrades.scanInput(scanner);
                break;
            case 3:
                studentInfo.print();
                studentGrades.print();
                break;
            case 4:
                System.exit(0);
        }
        }while(choice != 4);
    }
    
}
