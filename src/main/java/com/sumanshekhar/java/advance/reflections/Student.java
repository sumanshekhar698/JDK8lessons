package com.sumanshekhar.java.advance.reflections;
class Student
{
    public String name;
    public int age; 
    
    private void display() {
    	System.out.println("Inside Display Method --> name: "+this.name+"\t AGE: "+this.age);
    }
}