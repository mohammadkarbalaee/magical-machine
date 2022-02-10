package sbu.cs;

public class Driver {
  public static void main(String[] args) {
    App magicalMachine = new App();
    int[][] array1 = {
        {1, 2, 3, 4, 5, 1},
        {1, 2, 3, 4, 5, 2},
        {1, 2, 3, 4, 5, 3},
        {1, 2, 3, 4, 5, 4},
        {1, 2, 3, 4, 5, 5},
        {1, 2, 3, 4, 5, 1},
        {1, 2, 3, 4, 5, 2}
    };
    System.out.println(magicalMachine.main(6, array1, "cvsduvhsudvsydifvbsdubvcs"));
  }
}
