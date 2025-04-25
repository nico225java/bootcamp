public class Ball { //set 規限/games rules
  //attributes
   private double size;
   public Ball(){

   }
   //constructor
   //!by default, implicitly empty consructor exists
   //!but once you define a new constructor, the empty constructor will disappear

   //public Ball(){
    //this.size=3;
   
    //can be more than one constructor
    //All aurgerment is 
    public Ball(double size){
      this.size = size;
    }
   //methods
   //setter
   public void setSize(double size){
    this.size = size; 
   }
   //getter
   public double getSize(){
    return this.size;
   }
   public String getSizeDesc(){
    if(this.size >5){
      return "BIG";
    }else{
      return "SMALL";
    }
   }
   public static void main(String[] args){  //角色
    //new constuster
    Ball b1 = new Ball();
    b1.setSize(4);
    System.out.println(b1.getSizeDesc());

    Ball b2 = new Ball(10);//call the another constructor
    System.out.println(b2.getSize());//10.0

   }
}