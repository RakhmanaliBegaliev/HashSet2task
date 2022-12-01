import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(5);
        integers.add(3);
        integers.add(25);
        integers.add(32);
        integers.add(47);
        System.out.println(integers);

        Set<Student> students = new TreeSet<>();
        students.add(new Student("Steve",2));
        students.add(new Student("Messi",2));
        students.add(new Student("Ronaldo",7));
        students.add(new Student("Neymar",4));
        students.add(new Student("Mbappe",6));
        System.out.println(students);
    }
}