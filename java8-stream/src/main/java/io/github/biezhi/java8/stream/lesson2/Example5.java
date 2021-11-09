package io.github.biezhi.java8.stream.lesson2;

import io.github.biezhi.java8.stream.Project;

import java.util.List;
import java.util.stream.Stream;

/**
 * 匹配元素
 * <p>
 * allMatch 使用
 * anyMatch 使用
 * noneMatch 使用
 * findFirst 使用
 * findAny 使用
 *
 * @author biezhi
 * @date 2018/2/12
 */
public class Example5 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        boolean hasBiezhi = projects.stream()
                .anyMatch(p -> p.getAuthor().equals("biezhi"));

        System.out.println(hasBiezhi);

        System.out.println(projects.stream()
                .allMatch(p -> p.getAuthor().equals("biezhi")));

        System.out.println(projects.stream()
                .noneMatch(p -> p.getAuthor().equals("biezhi")));

        // parallelStream，元素过万时再用。但是要小心用，容易有线程安全问题
        System.out.println(projects.parallelStream().findAny().get());
        System.out.println(projects.stream().findFirst().get());

        Stream.of("1", "2")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
