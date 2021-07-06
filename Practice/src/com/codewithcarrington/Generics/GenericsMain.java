package com.codewithcarrington.Generics;

public class GenericsMain {
    public static void main(String[] args) {
//        var list = new GenericList<Integer>();
//        list.add(1);
//        int number = list.get(0);

        var user1 = new User(10);
        var user2 = new User(20);

        if (user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 == user2");
        else
            System.out.println("user1 > user2");


        //Generic Classes-uses Utils Class
        //    var max = Utils.max(1, 3);
        //        System.out.println(max);

        //Comparing user objects using generic Utils class. To print out needs to over toString method in User class.
        //var max = Utils.max(new User(10), new User(20));
        //System.out.println(max);

//        Utils.print(1, 10);

        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));



    }
}
