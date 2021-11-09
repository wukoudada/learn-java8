package io.github.biezhi.java8.stream.lesson3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author wkdd
 * @version 1.0
 * @date 2021/11/9 23:26
 */
public class Example7 {

    //    Stream<String> stream = Stream.of("hello", "felord.cn");
//    stream.peek(System.out::println);  // compile error


    public static void main(String[] args) {

        Stream<String> stream = Stream.of("hello", "felord.cn");
        // 无输出
        stream.peek(System.out::println);

        Stream<String> stream1 = Stream.of("hello", "felord.cn");
        // 有输出
        stream1.peek(System.out::println).collect(Collectors.toList());

        Stream<String> stream2 = Stream.of("hello", "felord.cn");
//        stream2.forEach(System.out::println).collect(Collectors.toList()); compile error

//        还需要研究一下
//        https://www.cnblogs.com/felordcn/p/12142488.html
    }


}
