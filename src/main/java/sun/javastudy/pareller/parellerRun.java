package sun.javastudy.pareller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by interpark on 2017-04-03.
 */
public class parellerRun {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

//        Stream<String> stream = list.stream();
//        stream.forEach(parellerRun::print);

        System.out.println("");

        Stream<String> pStream = list.parallelStream();
        pStream.forEach(parellerRun::print);
    }

    private static void print(String str) {
        System.out.println(str + ": " + Thread.currentThread().getName());
    }
}
