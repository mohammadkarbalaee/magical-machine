package sbu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        int n = 8;
        int[][] arr = {
                {5, 5, 1, 2, 4, 5, 5, 2},
                {4, 5, 1, 4, 4, 2, 1, 2},
                {4, 1, 5, 1, 1, 1, 4, 4},
                {1, 5, 4, 1, 4, 4, 1, 4},
                {5, 4, 4, 1, 5, 1, 1, 1},
                {5, 5, 1, 5, 4, 5, 4, 4},
                {4, 1, 1, 1, 4, 4, 4, 1},
                {4, 4, 1, 5, 5, 4, 5, 4}
        };
        String input = "qmiqwnhwnrckeirepjgv";
        assertEquals(new App().main(n, arr, input), "vemehewewjijejzjznenancncryrgrlrljjjpjljldedvdtdtmomimumu" +
                "sdsssosodldcdzdzmdmhmvmzizikizizxzxhxzxzpzptpzpzvzvdvzvzrzrirzrzizimizizvzvkvzvzkzktkzkzqzqwqzqztzto" +
                "tzt");
    }
}