package com.mycompany.project;


public class Array {
private int numofstudents = 0 ;
private int maxsize;    
private Student1[]array;

private int comparisons=0;
private int swaps=0;
 
Array(int maxsize){
if(maxsize<=0){
throw new IllegalArgumentException("Array size must be postive number ");
}
this.maxsize=maxsize;
array =new Student1[maxsize];
}
 boolean isEmpty(){
 return numofstudents==0;
 }   
 boolean isFull(){
 return numofstudents==maxsize;
 }    
 void insert(String name,int id,double grade ){
 if(isFull()){
     System.out.println("Array is full, Couldn't insert more students");
 return;
 }
 Student1 newstudent=new Student1(name,id,grade);
  for(int i=0;i<numofstudents;i++){
     comparisons++; 
  if(newstudent.getid()<array[i].getid()){
   for(int j=numofstudents-1;j>=i;j--){
      comparisons++;
     array[j+1]=array[j];
   swaps++;  
   }
   array[i]=newstudent;
   numofstudents++;
  return;
        }
  }
 array[numofstudents]=newstudent;
 numofstudents++;
 }   
 void insert(Student1 newstudent){
 insert(newstudent.getname(),newstudent.getid(),newstudent.getgrade());
 }
 private int find(int idtarget,int low,int high){
     comparisons++;
 if(isEmpty()) {
            System.out.println("Array is empty");
            return -1;
        }
 comparisons++;
 if(low > high) {
            System.out.println("Could not find ID:" + idtarget);
            return -1;
        }
 int mid =low+(high-low)/2;
 
 comparisons++;
  if(idtarget == array[mid].getid() )
            return mid;
  
  comparisons++;
   if(idtarget > array[mid].getid())
            return find(idtarget, mid + 1, high);
  return find(idtarget, low, mid - 1);
    
 }
   int find(int idtarget){
        return find(idtarget, 0, numofstudents - 1);
    }
Student1 delete(int idtarget){
int indextodelete=find(idtarget);
if(indextodelete != -1){
Student1 deletedstudent=array[indextodelete];
for(int i=indextodelete;i<numofstudents-1;i++){
    comparisons++;
 array[i]=array[i+1];
 swaps++;
          }   
      numofstudents--;
      return deletedstudent;
}
return null;
}
void display(){
for(int i=0 ;i<numofstudents;i++){
    System.out.println(array[i].toString());
    }
}
int getnumofstudents(){
return numofstudents;
} 
 int getSwaps() {
        return swaps;
    }

    int getcomparisons() {
        return  comparisons;
    }





       }
