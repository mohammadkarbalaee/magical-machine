package sbu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  void magicalMachine1() {
    int n = 8;
    int[][] arr = {
        {2, 5, 5, 4, 2, 1, 5, 5},
        {2, 1, 2, 4, 4, 1, 5, 4},
        {4, 4, 1, 1, 1, 5, 1, 4},
        {4, 1, 4, 4, 1, 4, 5, 1},
        {1, 1, 1, 5, 1, 4, 4, 5},
        {4, 4, 5, 4, 5, 1, 5, 5},
        {1, 4, 4, 4, 1, 1, 1, 4},
        {4, 5, 4, 5, 5, 1, 4, 4}
    };
    String input = "qmiqwnhwnrckeirepjgv";
    assertEquals(new App().main(n, arr, input), "vemehewewjijejzjznenancncryrgrlrljjjpjljldedvdtdtmomimumu" +
        "sdsssosodldcdzdzmdmhmvmzizikizizxzxhxzxzpzptpzpzvzvd" +
        "vzvzrzrirzrzizimizizvzvkvzvzkzktkzkzqzqwqzqztzto" +
        "tzt");
  }

  @Test
  void magicalMachine2() {
    int n = 7;
    int[][] arr = {
        {1, 2, 4, 4, 1, 5, 1},
        {4, 1, 1, 3, 4, 1, 2},
        {2, 4, 4, 1, 4, 3, 3},
        {1, 4, 4, 3, 4, 4, 4},
        {3, 1, 4, 5, 1, 5, 4},
        {5, 2, 4, 1, 1, 5, 3},
        {1, 4, 5, 5, 1, 4, 1}
    };
    String input = "computerscienceatsbu";
    assertEquals(new App().main(n, arr, input), "vcuooocceoccmoouyooukmmbcmmbampsympsbputnputsptakpt" +
        "ajueenueeyurccurcptsnhtsnitceatcekeiiweiiceecweecsrnsurnsdrcrdrcrsseeoseeqsa" +
        "tosatkctuuctuncsptcspsibmoibmxiuouiuokekcwewcoeoumemuynybqnqbunusynysqcqtici" +
        "tucuaocoaqeqeqeqememckekcuaunaaanwawexaxeftfiytyihthcgtgczszsvsvsxsxrms" +
        "mrvbverbrexbxthbhtiuiuvuvugugpfufpkckmncnmlcloxcxofofoyoymhmhmgmgpzpzpvpv" +
        "uxuxumumtvtvtrtrexexehehririrvrvsgsgsfsfckckcncnililiieeeennnncccceeeea" +
        "aaattttssssbbbbuuuuccc");
  }


  @Test
  void magicalMachine3() {
    int n = 6;
    int[][] arr = {
        {1, 2, 3, 4, 5, 1},
        {1, 2, 3, 4, 5, 2},
        {1, 2, 3, 4, 5, 3},
        {1, 2, 3, 4, 5, 4},
        {1, 2, 3, 4, 5, 5},
        {1, 2, 3, 4, 5, 1},
        {1, 2, 3, 4, 5, 2}
    };
    String input = "cvsduvhsudvsydifvbsdubvcs";
    assertEquals(new App().main(n, arr, input), "pececezbzbwlwlauauakakxaxabzbz" +
        "bfbfwjwjvqvqmvmvbdbdjcjckdkdcvcvoqoqajajkfkfmzmzwawamkmkrurublblh" +
        "bhbpepececezbzbwlwlauauakakxaxabzbzbfbfwjwjvqvqmvmvbdbd" +
        "jcjckdkdcvcvoqoqajajkfkfmzmzwawamkmk" +
        "rurublblhbhbpe");
  }
}