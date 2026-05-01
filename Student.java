
public class Student {
   private String name;
   private int id;
   private double grade;
   Student( String name,int id,double grade){
   if(grade<0||grade>100){
   throw new IllegalArgumentException("Grade must be between 0and 100");
   }
   if(id<0){
   throw new IllegalArgumentException("id  must be postive number");
   }
   this.name=name;
   this.id=id;
   this.grade=grade;
   }
  public String getname(){
  return name;
  } 
  public int getid(){
  return id;
  } 
  public double getgrade(){
  return grade;
  }
   @Override
    public String toString() {
        return "{" +
                "Name: " + name +
                ", ID: " + id +
                ", Grade: " + grade +
                '}';
    }
}
