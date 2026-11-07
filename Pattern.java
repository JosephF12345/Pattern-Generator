// Joseph Fitzpatrick
//Date: 10/28/26
// This class utilizes methods and loops to create shapes drawn from characters in certain sequences. 
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
    int cols = (start / 2) + 1;
    //start = 9 -> cols = 5
    //
    for (int row = start; row >= 1; row--)
    {
      
      for (int col = cols; col <=row; col++){
        
        System.out.print(start);
        
      }
      System.out.println();
      start-=2;
    }
    
  }
public static void eo(int maxE){
  for (int row = 1; row<=maxE-1; row++){
    for (int col = 1; col<= row; col++)
    {
      if (maxE % 2 == 0 && row == 1)
      {
        System.out.print('O');
      }
      else if (maxE % 2 == 1 && row == 1)
      {
        System.out.print('E');
      }
      if (maxE % 2 == 0 && row % 2 == 0 && row >= 2)
      {
        System.out.print('E');
      }
      else if (maxE % 2 == 0 && row % 2 == 1 && row>= 2)
      {
        System.out.print('O');
      }
      if (maxE % 2 == 1 && row % 2 == 0 && row>= 2)
      {
        System.out.print('O');
      }
      else if (maxE % 2 == 1 && row % 2 == 1 && row>= 2)
      {
        System.out.print('E');
      }
      
    }
    System.out.println();
  }
  // E loop in middle, two triangles above and below
  for (int es = 1; es <= maxE; es++)
  {
    System.out.print('E');
  }
  System.out.println();
  for (int row = maxE-1; row>=1; row--){
    for (int col = 1; col<= row; col++)
    {
      if (maxE % 2 == 0 && row == 1)
      {
        System.out.print('O');
      }
      else if (maxE % 2 == 1 && row == 1)
      {
        System.out.print('E');
      }
      if (maxE % 2 == 0 && row % 2 == 0 && row >= 2)
      {
        System.out.print('E');
      }
      else if (maxE % 2 == 0 && row % 2 == 1 && row>= 2)
      {
        System.out.print('O');
      }
      if (maxE % 2 == 1 && row % 2 == 0 && row>= 2)
      {
        System.out.print('O');
      }
      else if (maxE % 2 == 1 && row % 2 == 1 && row>= 2)
      {
        System.out.print('E');
      }
      
    }
    System.out.println();
  }
  
}
public static void pyramid(int rows){
  int startCol = (rows*2)-1;
  int count = 1;
  for (int row = 1; row <= rows; row++)
  { 
      for (int indent = 1; indent < row; indent++)
      {
        System.out.print(" ");
      }
      for (int col = 1; col<= startCol; col++)
      {
        System.out.print(count);
      }
      count++;
      startCol-=2;
      System.out.println();
  }
  
}

  
  public static void main(String[] args) {  
        stars(7);
        triangle(9);
        odds(9);
        eo(5);
        eo(6);
        pyramid(9);
  }
}


//999999999
//7777777
//55555
//333
//1
//count = for 9: 9 / 2 -> 4.5 -> 4 -> 4+1 | for 11: 11 / 2 -> 5.5 -> 5 -> 5+1
// 11, 9, 7, 5, 3, 1

