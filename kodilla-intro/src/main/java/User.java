public class User {
    String name;
    int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

     public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int sumOfAges = 0;
        for (User user : users) {
            sumOfAges += user.age;
        }

        double averageAge = (double) sumOfAges / users.length;

        System.out.println("Sum of ages: " + sumOfAges);
        System.out.println("Average age: " + averageAge);
    }
}