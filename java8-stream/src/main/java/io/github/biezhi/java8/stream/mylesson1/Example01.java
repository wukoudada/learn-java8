package io.github.biezhi.java8.stream.mylesson1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 找出list 中重复的元素,并计算个数
 */
public class Example01 {

    public static void main (String[] args) {

        List<String> list = Arrays.asList ("1", "2", "3", "1", "4", "5", "3", "3");

        System.out.println (findDuplicateElement ( list ));

    }

    private static <T> Map<T, Long> findDuplicateElement(List<T> list){

        Map<T, Long> map = list.stream ()
                .collect( Collectors.groupingBy ( Function.identity () ,  Collectors.counting () ))
                .entrySet ()
                .stream ()
                .filter ( e -> e.getValue () > 1 )
                .peek ( System.out::println )
                .collect ( Collectors.toMap ( Map.Entry::getKey, Map.Entry::getValue) );
        return map;
    }


}
