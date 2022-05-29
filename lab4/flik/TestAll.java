package flik;

import org.junit.Test;

public class TestAll {

    @Test
    public void test() throws Exception{
        int i = 0;
        for (int j = 0;i < 500;++i,++j) {
            if (!Flik.isSameNumber(i,j)) {
                System.out.println("i don't same with j.");
            }
        }
        System.out.println("i is " + i);
    }
}
