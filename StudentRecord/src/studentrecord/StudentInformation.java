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
public class StudentInformation {
    private String fullName;
    private String address;
    private String birthday;
    private long LRN;
    private int age;

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the LRN
     */
    public long getLRN() {
        return LRN;
    }

    /**
     * @param LRN the LRN to set
     */
    public void setLRN(long LRN) {
        this.LRN = LRN;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    public void scanInput(Scanner scanner){
        System.out.println("\n<<--------Input Student Information------>>");
        
        
        System.out.print("Enter Full Name: ");
        scanner.nextLine();
        fullName = scanner.nextLine();
        setFullName(fullName);
        
        System.out.print("Enter LRN: ");
        LRN = scanner.nextLong();
        setLRN(LRN);
        
        
        System.out.print("Enter Birthday: ");
        scanner.nextLine();
        birthday = scanner.nextLine();
        setBirthday(birthday);
        
        
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        setAge(age);
        
        
        System.out.print("Enter Address: ");
        scanner.nextLine();
        address = scanner.nextLine();
        setAddress(address);
        
        
        
        
    }
    public void print(){
        System.out.println("\n<<--------------------------------->>");
        System.out.println("<<--------Student Information------>>");
        System.out.println("<<--------------------------------->>");
        System.out.println("Full Name: " + getFullName());
        System.out.println("LRN: " + getLRN());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
    }
}



