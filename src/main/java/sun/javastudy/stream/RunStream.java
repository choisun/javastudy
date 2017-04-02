package sun.javastudy.stream;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by 최선 on 2017-03-30.
 */
public class RunStream {
    public static void main(String[] args) {
        //http://iloveulhj.github.io/posts/java/java-stream-api.html

        // 1. 생성
        // 2. 초기 스트림을 다른 스트림으로 변환하는 중간 연산들을 하나 이상의 단계로 지정
        // 3. 최종연산. 앞선 지연 연산들의 실행을 강제. 해당 스트림은 더 이상 사용 불가
        String[] wordArray = {"a", "bb", "ccc", "dddd", "eeeee"};

        Stream<String> stream1 = Arrays.stream(wordArray, 0, 5) // 배열을 스트림으로
                .filter(w -> w.length() > 3);

        Stream<String> stream2 = Stream.of("A", "BB", "CCC", "DDDD", "EEEEE")
                .sorted(Comparator.comparing(String::length).reversed());

        Stream<String> stream3 = Stream.empty(); // 요소가 없는 스트림 생성
        Stream<String> stream4 = Stream.generate(() -> "Stream") // 무한 스트림을 만드는 generate 정적 메서드
                .limit(3)
                .distinct();
        //Stream<Double> stream5 = Stream.generate(Math::random); // 무한
        //Stream<BigInteger> stream6 = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)); //무한

//        Stream<String> concatStream = Stream.concat(stream1, stream2);


//        stream1.forEach(n -> System.out.println(n));
//        stream2.forEach(n -> System.out.println(n));
//        stream3.forEach(n -> System.out.println(n));
//        stream4.forEach(n -> System.out.println(n));
//        concatStream.forEach(n -> System.out.println(n));

        long count = stream3.count();
        Optional<String> max = stream2.max(String::compareToIgnoreCase);
        Optional<String> min = stream1.min(String::compareToIgnoreCase);



    }
}