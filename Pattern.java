// Joseph Fitzpatrick
// This project utilizes methods and loops to create shapes drawn from characters. 
public class Pattern {
  public static void stars(int rows)
  {
    int row = 1;
    while (row <= rows){
      int col = 1;
      while (col <= row)
      {
        System.out.print('*');
        col++;
      }
      row++;
      System.out.println("");
    }
  }
  public static void triangle(int rows){
    int row = 1;
    int count = 0;
    while (row <= rows){
      int col = 1;
      count++;
      while (col <= row)
      {
        System.out.print(count);
        col++;
      }
      row++;
      System.out.println("");
    }
  }
  public static void odds(int start){
    int rows = (start / 2) + 1;
    
    for (int row = 1; row <= rows; row++)
    {
      for (int col = 1; col <= start; col++){
        
        System.out.print("*");
      }
    }
    System.out.println();
  }

  
  public static void main(String[] args) {  
        stars(7);
        triangle(9);
        odds(7);
  }
}


//999999999
//7777777
//55555
//333
//1
//count = for 9: 9 / 2 -> 4.5 -> 4 -> 4+1 | for 11: 11 / 2 -> 5.5 -> 5 -> 5+1
// 11, 9, 7, 5, 3, 1