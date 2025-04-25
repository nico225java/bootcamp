//!One to one: one person has one height and one weight

import java.util.Arrays;

public class Classroom { // !!1 to many
  private String[] names;//Store String array address
  private String tutor;

//setter
  public void setNames(String[] names){
    this.names = names;
  }
public void setTutor(String tutor){
  this.tutor = tutor;
}

//getter
public String[] getNames() {
  return names;
}
public static void main(String[]args){
  Classroom c1= new Classroom();
  //John Mary
  //create String array
  String[] students = new String[2];
  students[0] = "John";
  students[1] = "Mary";

  //ci.setNames(student[0]);//error, students is String array object, students[0] -> String object
  c1.setNames(students);
  System.out.println(c1.getNames()[0]);


  //Update the second student name ->Steven
  c1.getNames()[1]="Steven";


  //for loop, print all student names in the classroom

  //Find Mary, and replace by Steven.
  for(int i=0;i<c1.getNames().length; i++){
    if(c1.getNames()[i].equals("Mary")){
      c1.getNames()[i] = "Steven";
      break;
    }
  }
    System.out.println(Arrays.toString(c1.getNames()));

    }
  }

