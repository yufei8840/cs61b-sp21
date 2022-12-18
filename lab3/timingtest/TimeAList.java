package timingtest;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import org.checkerframework.checker.units.qual.A;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.println("Timing table for addLast:");
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        AList<Double> times = new AList<Double>();
        AList<Integer> N = new AList<Integer>();
        for (int i = 1000; i <= 128000; i *= 2) {
            AList<Integer> n = new AList<Integer>();
            Stopwatch sw = new Stopwatch();
            for (int j = 0; j < i; j++) {
                n.addLast(j);
            }
            times.addLast(sw.elapsedTime());
            N.addLast(i);
        }
        printTimingTable(N,times,N);
    }

//    public static void timeAListConstruction() {
//        // TODO: YOUR CODE HERE
//        AList<Integer> Ns = new AList<>();
//        AList<Double> times = new AList<>();
//        AList<Integer> opCounts = new AList<>();
//        Stopwatch sw = new Stopwatch();
//        for (int i = 1000; i <= 128000; i *= 2) {
//            AList<Integer> te = new AList<>();
//            for (int j = 0;j < i;j++) {
//                te.addLast(j);
//            }
//            double timeInSeconds = sw.elapsedTime();
//            times.addLast(timeInSeconds);
//            Ns.addLast(i);
//            opCounts.addLast(i);
//        }
//        printTimingTable(Ns,times,opCounts);
//    }
}

























