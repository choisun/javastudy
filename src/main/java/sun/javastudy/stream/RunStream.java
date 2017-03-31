package sun.javastudy.stream;


import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * Created by 최선 on 2017-03-30.
 */
public class RunStream {
    public static void main(String[] args) {
        String[] wordArray = {"a", "bb", "ccc", "dddd", "eeeee"};

        Stream<String> stream = Arrays.stream(wordArray, 0, 5);

        Stream<String> test = stream.filter(w -> w.length() > 2);

        Stream<String> stringStream = null;

        test.forEach(x -> System.out.println(x));

//        Stream<String> stream2= Arrays.stream(wordArray, 0, 5);
//
        long cnt = stream.filter(w -> w.length() > 2).count();


        System.out.println(cnt);
    }
}