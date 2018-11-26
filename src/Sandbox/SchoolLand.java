/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sandbox;

import java.util.ArrayList;

/**
 *
 * @author noah
 */
public class SchoolLand {
    
    public static void main(String[] args) {
        ArrayList<Student> studList= new ArrayList<>();
        
        //add one of each
        studList.add(new HSStudent());
        studList.add(new CollegeStudent());
        studList.add(new GradStudent());
        
        for(Student s: studList){
            System.out.println("Can Graduate: " + s.canGraduate());
        }
    }
    
}

//other classes

    abstract class Student{
        String name;
        int id, credits;
        boolean graduationStatus;
    
        public Student(){
        
        }
    
        public Student(String n, int i){
            this.name = n;
            this.id = i;
        }
    
        //abtracts
        abstract boolean canGraduate();
    }
    
    class HSStudent extends Student{
        int numPeriodsPerDay;
        String principalName;
        
        boolean canGraduate(){
            return true;
        }
    }
    
    class CollegeStudent extends Student{
        String major;
        
        boolean canGraduate(){
            return true;
        }
    }
    
    class GradStudent extends CollegeStudent{
        String advisorName, thesisTopic;
    }
