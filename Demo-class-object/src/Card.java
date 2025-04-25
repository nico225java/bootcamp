public class Card {//先諗物件 (先描述物件) 思想>行為>結果
  //!static ->common values for all objects(Not belongs to objects)
  //!final ->唔能夠既改key words /cannot modify the vaule after initialization
  // non-Static and non-final ->可被任何人改
  //Static and Non-Final
  //Non-Static and Final
  //Static and Final -> 字典/常數通常都被人改變

  public static final char DIAMOND = 'D';//constant常數
  public static final char CLUB = 'C';//constant常數
  public static final char HEART = 'H';//constant常數
  public static final char SPADE = 'S';//constant常數

  public static final char ACE ='A';//constant
  public static final char ONE = '1';//constant
  public static final char TWO = '2';//constant
  public static final char THREE = '3';//constant
  public static final char FOUR = '4';//constant
  public static final char FIVE = '5';//constant
  public static final char SIX = '6';//constant
  public static final char SEVEN = '7';//constant
  public static final char EIGHT = '8';//constant
  public static final char NINE = '9';//constant
  public static final char TEN = 'T';//constant
  public static final char JACK = 'J';//constant
  public static final char QUEEN = 'Q';//constant
  public static final char KING = 'K';//constant




  //1.Readability
  //2.Data Type Range()越窄越好
  //要考慮好一個可行既primative
  private char rank;//A,1,2,3,4,5,6,7,8,9,T,J,Q,K 
  private char suit;//D,C,H,S

  //Constructor
  public Card(char rank,char suit){
    this.suit = suit;
    this.rank = rank;
  }
  //Setter 
  public void setSuit(char suit){
    this.suit = suit;
  }
  public void setRank(char rank){
    this.rank = rank;
  }
  //Getter
  public char getRank(){
    return this.rank;
  }
  public char getSuit(){
    return this.suit;
  }

  public String toString(){
    return "Card("+"rank =" +this.rank + ",suit="+ this.suit + ")";
  }
  

  //考慮primative/integer 既type 要用最raw 既type 
  //rank
  //suite (Diamond, club, heat, spade)
  private String color;



  //material

  //JQK
  //color (color will not become an attribuate)

  public boolean isRed(){ //not using color to define/ 啤牌 唔係紅就黑
    if (suit == DIAMOND || suit == HEART)//constant ==背後係int or char
    return true;

    return false;
  }
    public boolean equals(Card card){//右手邊card input, 左手邊係自己
      return this.rank == card.getRank() && this.suit == card.getSuit();
  
  }
//10.compareTo(3)->1
//3.compare(10)->-1

//0,-1,1
  public int compareTo(Card card){//
    if(this.rank == card.getRank()){
    if(this.suit > card.getSuit()){
      return 1;
    }else if(this.suit < card.getSuit()){
    
    return -1;
    }
    return 0;
  }
    //different ranks
    return this.rank >card.getRank()? 1:-1;

  }
    
//^上面係只諗1張牌


//下面就係牌既
  public static void main(String[] args) {//行動action

    Card c1 = new Card(TWO,CLUB);
    Card c2 = new Card(TWO,CLUB);
    System.out.println(c1.equals(c2));//true
    Card c3 = new Card(THREE, CLUB);
    System.out.println(c1.equals(c3));//false
    Card c4 = new Card(ACE, SPADE);
    System.out.println(c1.equals(c4));
    Card c5 = new Card(ACE,SPADE);
    System.out.println(c1.equals(c5));//false

    System.out.println(c1.compareTo(c2));//0
    System.out.println(c1.compareTo(c3));//-1
    System.out.println(c5.compareTo(c1));//1

    Card c6 = new Card(ACE,DIAMOND);
    System.out.println(c5.compareTo(c6));//1

    Card c7 = new Card(ACE,DIAMOND);
    System.out.println(c5.compareTo(c6));

    System.out.println(c6);//Card(rank = Z, suit = 1)
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
  }
}

