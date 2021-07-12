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

    // This method returns a b c.
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


    //This method returns unique or distince values
    public static void show4(){
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(like-> System.out.println(like));
    }

    //Peeking elements
    public static void show5() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(m -> m.getTitle())
                .peek(t -> System.out.println("map" + t))
                .forEach(t -> System.out.println(t));
    }




}
