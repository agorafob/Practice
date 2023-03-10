package TestStream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Stream
        List<Integer> list = List.of(1,2,3,4,5,1,10,2,6,9,8);
        System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0));
        System.out.println(list.stream().findAny().get());
        list.stream().filter(i->i<8).forEach(i-> System.out.print(i+" "));
        System.out.println();
        list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(i-> System.out.print(i+" "));
        System.out.println();

        //Optional
        User u = new User(15,"Alex", 19);
        Optional<User> op = Optional.of(u);
        op.ifPresent(op.get()::printUser);
        User user = op.orElseThrow();
        System.out.println(user);

        //Predicate
        Predicate<User> isAdult = i->i.getAge()>18;
        System.out.println(isAdult.test(u));

        //Comparator
        List<User> userList = UserService.getUsers();
        Comparator<User> ageComparator = Comparator.comparing(User::getAge);
        Comparator<User> nameComparator = Comparator.comparing(User::getName);
        userList.sort(ageComparator.thenComparing(nameComparator));
        userList.forEach(System.out::println);


    }
}
