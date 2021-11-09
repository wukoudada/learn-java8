package io.github.biezhi.java8.stream.lesson2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author wkdd
 * @version 1.0
 * @date 2021/11/9 22:42
 */
public class Example8 {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};
        List<String> collect = Stream.of(strings)
                .map(s -> s.split(""))
                .flatMap(s -> Stream.of(s))
                .distinct()
                .collect(Collectors.toList());


        collect.forEach(c -> {
            System.out.println(c);
        });


        List<String> list = IntStream.range(10, 99)
                .boxed()
                .map(s -> s + "")
                .collect(Collectors.toList());
        list.stream().map(s -> s.split("")).flatMap(s -> Stream.of(s)).forEach(System.out::println);

//————————————————
//        版权声明：本文为CSDN博主「g-Jack」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/hao134838/article/details/110760911
        //test
    }
}
