// Joseph Fitzpatrick
// This project utilizes methods and loops to create shapes drawn from characters. 
public class Pattern {
  public static void stars(int rows)
  {
    String star = "*";
    int count = 0;
    while (count < rows)
    {
      count++;
      System.out.println(star);
    }
  }
  public static void main(String[] args) {  
        stars(7);
  }
}