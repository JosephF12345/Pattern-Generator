// Joseph Fitzpatrick
//Date: 10/28/26
// This class utilizes methods and loops to create shapes drawn from characters in certain sequences or patterns. 
public class Pattern {
//  Pre-condition: rows must be an integer greater than or equal to 2 
//  Post-condition: prints an an upward right triangle out of '*' containing the specified number of rows


  public static void stars(int rows)
  {
    int row = 1;
    
    while (row <= rows){
      int col = 1;
      while (col <= ((row* 2)-1))
      {
        System.out.print('*');
        col++;
      }
      row++;
      System.out.println();
    }
  }
  //  Pre-condition: rows must be an integer greater than or equal to 2 
//  Post-condition: prints an upward right triangle out of the current row number printed repeatedly across a row; it contains the specified number of rows

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
  //  Pre-condition: start must be a positive odd integer greater than or equal to 3
//  Post-condition: prints a downward right triangle out of start printed repeatedly accross each row. Start decreases by 2 each row with the number of rows being (start/2) +1 
 public static void odds(int start){
    int rows = (start / 2) + 1;
    
    
    //start = 9 -> rows = 5
    
    for ( int row = 1; row <= rows; row++)
    {
      for (int col = start; col >= 1; col--)
      {
        System.out.print(start);
      }
      start -= 2;
      System.out.println();
        
      
    }
    
    
  }
  //  Pre-condition: maxE must be a positive integer greater than or equal to 2
//  Post-condition: prints a sideays isosceles triangle with 'E' or 'O' being repeatedly printed in a row based on whether maxE is even or odd and the current row number. At the median row, 'E' is printed maxE times. 
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
//  Pre-condition: rows must be a positive integer greater than or equal to 2
//  Post-condition: prints a centered upside down pyramid with the row number repeatedly printed in each row. As you go down rows, a space is added each time and the amount of row numbers printed in a row decreases by 2 until the amount of row numbers printed in a row is 1
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
        eo(6);
        eo(5);
        pyramid(5);
  }
}


