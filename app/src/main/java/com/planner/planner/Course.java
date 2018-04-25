package com.planner.planner;


import java.util.ArrayList;

public class Course {

    private Course[] prerequisites = new Course[10];
    private int preInt = 0;
    private String name;

    public Course(String n){
        for(int i = 0; i<prerequisites.length;i++){
            prerequisites[i]=null;
        }
        name = n;

    }

    public void setPrerequisites(Course pre){
        prerequisites[preInt] = pre;
        preInt++;
    }

    public String getName(){
        return name;
    }

    public boolean metPrerequisites(ArrayList<Course> coursesTaken){
        boolean good = true;
        for (int i=0;i<prerequisites.length;i++){
            if(prerequisites[i]!= null) {
                if (coursesTaken.contains(prerequisites[i])) {
                    good = true;
                } else good = false;
            }
        }
        return good;
    }
}
