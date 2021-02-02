package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import app.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MultiplosTest {
    @Test
    @DisplayName("Test1")

    void test1(){
        Multiplos multi = new Multiplos();
        List<Integer> valoresEsperados = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<Integer> resultado = multi.calcNum(new String[]{"uno","dos","tres","cuatro"});
        assertEquals(valoresEsperados, resultado );
    }
    @Test
    @DisplayName("Test2")

    void test2(){
        Multiplos multi = new Multiplos();
        List<Integer> valoresEsperados = new ArrayList<Integer>(Arrays.asList(10,20,30));
        List<Double> resultado = multi.patata(new int[]{1,2,3}, 60);
        assertEquals(valoresEsperados, resultado );
    }
}