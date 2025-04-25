public class Queue {
  private Person[] persons;

  public Person[] getPersons() {
    return this.persons;
  }

  public Person getPerson(int index) {
    return this.persons[index];
  }

  public void setPerson(Person[] persons) {
    this.persons = persons;
  }

  public Person getHead() {
    return this.persons[0];
  }

  public static void main(String[] args) {
    
    Queue q1 = new Queue();
    // p1 1.76 74
    // p2 1.64 70
    // p3 1.8 77

    Person p1 = new Person();
    p1.setHeight(1.76);
    p1.setWeight(74);
    Person p2 = new Person();
    p2.setHeight(1.64);
    p2.setWeight(70);
    Person p3 = new Person();
    p3.setHeight(1.8);
    p3.setWeight(77);

    Person[] persons = new Person[3];
    persons[0] = p1;
    persons[1] = p2;
    persons[2] = p3;

    q1.setPerson(persons);

    System.out.println(q1.getHead().getBMI());
    
    for (int i = 0; i < q1.getPersons().length; i++) {
      System.out.println(q1.getPerson(i).getWeightStatus());
    }

  }
}