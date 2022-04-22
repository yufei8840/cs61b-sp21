package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void Tsdad() {

        AListNoResizing<Integer> anr = new AListNoResizing<>();
        BuggyAList<Integer> ba = new BuggyAList<>();

        anr.addLast(4);
        anr.addLast(5);
        anr.addLast(6);

        ba.addLast(4);
        ba.addLast(5);
        ba.addLast(6);


        int x1 = anr.removeLast();
        int x2 = ba.removeLast();
        int y1 = anr.removeLast();
        int y2 = ba.removeLast();
        int z1 = anr.removeLast();
        int z2 = ba.removeLast();


        assertEquals(anr.size(),ba.size());

        assertEquals(x1,x2);
        assertEquals(y1,y2);
        assertEquals(z1,z2);

    }


    @Test
    public void randomizedTest() {
        AListNoResizing<Integer> AL = new AListNoResizing<>();
        BuggyAList<Integer> BL = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                AL.addLast(randVal);
//                System.out.println("addLast(" + randVal + ")");
                BL.addLast(randVal);
                assertEquals(AL.getLast(),BL.getLast());
            } else if (operationNumber == 1) {
                // size
                int size = AL.size();
//                System.out.println("size: " + size);
                int blsize = BL.size();
                assertEquals(size,blsize);
            }else if (operationNumber == 2) {
                if (AL.size() > 0) {
//                    System.out.println("last:" + AL.getLast());
                }
            }else {
                if (AL.size() > 0) {
                    int alast = AL.removeLast();
                    int blast = BL.removeLast();
                    assertEquals(alast,blast);
                }
            }
        }
    }
}
