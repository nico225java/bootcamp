public class Teacher {
  private String name;
  private Student[] students;

public Teacher(String name){
  this.name = name;
  this.students = new Student[0];

  }

  public String getName(){
    return this.name;
  }
  public void add(Student student){
    Student[] newStudents = new Student[this.students.length +1];
    for (int i=0; i<this.students.length; i++){
      newStudents[i] = this.students[i];
    }
    newStudents[newStudents.length -1] = student;
    this.students = newStudents;
    
  }


public static void main(String[] args){
  Student s1 = new Student("Lucas");
  System.out.println(s1.getName());
  Student s2 = new Student("Roy");
  Student s3 = new Student("Ricky");
  Student s4 = new Student("Nicole");
  
  Teacher t1 = new Teacher("MrLee");
  System.out.println(t1.getName());
  t1.add(s1);
  t1.add(s2);
  t1.add(s3);
  t1.add(s4);

  for(int i= 0; i < t1.students.length; i++){
    System.out.println(t1.students[i].getName());
  }
  
}
}
 