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
public class StudentGrades {
    private int javaGrade;
    private int mathGrade;
    private int englishGrade;

    /**
     * @return the javaGrade
     */
    public int getJavaGrade() {
        return javaGrade;
    }

    /**
     * @param javaGrade the javaGrade to set
     */
    public void setJavaGrade(int javaGrade) {
        this.javaGrade = javaGrade;
    }

    /**
     * @return the mathGrade
     */
    public int getMathGrade() {
        return mathGrade;
    }

    /**
     * @param mathGrade the mathGrade to set
     */
    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    /**
     * @return the englishGrade
     */
    public int getEnglishGrade() {
        return englishGrade;
    }

    /**
     * @param englishGrade the englishGrade to set
     */
    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }
   public void scanInput(Scanner scanner){
       System.out.println("\n<<--------Input Student Grades------>>");
   
       System.out.print("Enter Your Grade in Java: ");
       javaGrade = scanner.nextInt();
       setJavaGrade(javaGrade);
       
       System.out.print("Enter Your Grade in Math: ");
       mathGrade = scanner.nextInt();
       setMathGrade(mathGrade);
       
       System.out.print("Enter Your Grade in English: ");
       englishGrade = scanner.nextInt();
       setJavaGrade(englishGrade);
   }
   
    public void print(){
        System.out.println("\n<<---------------------------------->>");
        System.out.println("<<---------Student Grades----------->>");
        System.out.println("<<---------------------------------->>");
        System.out.println("Grade in Java: " + getJavaGrade());
        System.out.println("Grade in Math: " + getJavaGrade());
        System.out.println("Grade in English: " + getMathGrade());
        float average = ((javaGrade + mathGrade + englishGrade)/3);
       
      
        System.out.println("Your average grade is " + average);
        
        if(average >= 75){
            System.out.println("You passed");
        }else{
            System.out.println("You failed");
        }
    
   }
}
