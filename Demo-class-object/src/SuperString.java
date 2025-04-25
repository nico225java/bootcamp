public class SuperString {
  private char[] chs;

  public String getString(){
    return String.valueOf(this.chs);//from char[] to String
  }

  //You define your own way to store the String value
  public void setString(String str){
    this.chs= new char[str.length()];
    for (int i=0; i<str.length(); i++){
    this.chs[i] = str.charAt(i);
  }
  }

  //this vs ss
  public boolean equals(SuperString ss){
    if(this.chs.length !=ss.getString().length()){
      return false;
    }
    for (int i=0; i< this.chs.length;i++){
      if(this.chs[i] != ss.getString().charAt(i)){
        return false;
      }
    }
    return true;
  }

  //replace (char x, char y) excrise
  public char charAt(int index){
    return this.chs[index];
  }
  public static void main(String[] args) {
    SuperString ss1= new SuperString();
    ss1.setString("abc");
    System.out.println(ss1.charAt(0));//h

    SuperString ss2= new SuperString();
    ss2.setString("abcd");

    System.out.println(ss2.charAt(0));//b
    ss1.equals(ss2);

  }
}
