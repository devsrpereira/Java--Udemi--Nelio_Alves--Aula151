package application;

import entities.Comment;
import entities.Post;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44",dtf1),
                "Travelelin to New Zealand",
                "I'm going to visit this wondefull country!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good Night!");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:15:19",dtf1),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);


    }
}
