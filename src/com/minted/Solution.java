package com.minted;

/*

Suppose you are creating an internal networking site for your company. You have two data sets to work with. The first data set is the employees at your company, and the second is all the pairs of employees who are virtually friends so far. It does not matter which employee's ID is in which column, the friendships are bidirectional.

You want to know who’s friends with whom. You need to implement a function that, given the employees and friendships as parameters, returns this data in the form of an adjacency list representation. This is a mapping of each employee ID to a list of his/her friends on the site.
 
 
Sample output:

1: 2, 3
2: 1, 4
3: 1
4: 2
6: None
 
*/

import java.util.*;

class Solution {
  public static void main(String[] args) {
    String[] employeesInput = {
      "1,Richard,Engineering",
      "2,Erlich,HR",
      "3,Monica,Business",
      "4,Dinesh,Engineering",
      "6,Carla,Engineering"
    };

    String[] friendshipsInput = {
      "1,2",
      "1,3",
      "2,4"
    };
    
    List<List<Integer>> friends=getFriends(employeesInput,friendshipsInput);
    for(List l:friends){
      System.out.println(l);
    }
    
  }
    
    public static List<List<Integer>> getFriends(String [] employeesInput, String [] friendshipsInput){
        List<Integer> friends;
        List<List<Integer>> friendList=new ArrayList<List<Integer>>();
        
        String [] employeeRecord= new String[employeesInput.length];
        String [] parsedEmployeeRecord= new String[3];
        Employee [] employeeArray=new Employee[employeesInput.length];
        Employee emp;
      
        int i=0;
        for(i=0;i<employeesInput.length;i++){
          parsedEmployeeRecord=employeesInput[i].split(",");
          emp= new Employee();
          emp.employeeId=Integer.parseInt(parsedEmployeeRecord[0]);
          emp.employeeName=parsedEmployeeRecord[1];
          emp.employeeDept=parsedEmployeeRecord[2];
          employeeArray[i]=emp;  
        }
        
        int empId=0; 
        String [] friendArray=new String[2];
        
        for(Employee e: employeeArray){
          empId=e.getEmployeeId();
          friends=new ArrayList<Integer>();
          for(int k=0;k<friendshipsInput.length;k++){
            
            friendArray=friendshipsInput[k].split(",");
            if(empId==Integer.parseInt(friendArray[0])){
              friends.add(Integer.parseInt(friendArray[1]));
            }
            if(empId==Integer.parseInt(friendArray[1])){
              friends.add(Integer.parseInt(friendArray[0]));
            }
            
          }
          if(friends.isEmpty()){
            friends.add(0);
          }    
          friendList.add(friends); 
        }
        return friendList;
      }
    
    static class Employee{
      int employeeId;
      String employeeName;
      String employeeDept;
      
      public Employee(){
      }
       public Employee(int id, String name, String dept){
         employeeId=id;
         employeeName=name;
         employeeDept=dept;
         
      }
      
      public void setEmployeeId(int id){
        employeeId=id;
      }
      
      public void setEmployeeName(String name){
        employeeName=name;
      }
      
      public void setEmployeeDept(String dept){
        employeeDept=dept;
      }
      
      public int getEmployeeId(){
        return employeeId;
      }
      
      public String getEmloyeeName(){
        return employeeName;
      }
      
      public String getEmployeeDept(){
        return employeeDept;
      }
      
      public String toString(){
        return "EmployeeID: '"+this.employeeId+"'";
      }
      
    }
    
    
  }

