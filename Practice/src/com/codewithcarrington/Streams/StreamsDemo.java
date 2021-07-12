package com.codewithcarrington.Streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );


        //Imperative Programming. How many movies have over 10 likes.
        int count = 0;
        for (var movie : movies)
            if (movie.getLikes() > 10)
                count++;

        //Declarative (Functional) Programming. How many movies have over 10 likes.
        var count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
    }

    public static void show2() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        movies.stream().map(movie-> movie.getTitle()).forEach(name -> System.out.println(name));
    }

    //With this flatmap method we can flatten a stream list of objects to a stream of objects. Stream<List<x>> to Stream<x>
    public static void show3() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );
        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream.flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));
    }

}
