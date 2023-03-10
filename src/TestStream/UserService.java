package TestStream;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static final List<User> users = new ArrayList<>();


    static List<User> getUsers(){
        users.add(new User(1,"Alik",34));
        users.add(new User(2,"Lera",30));
        users.add(new User(3,"Una",3));
        users.add(new User(4,"Roza",62));
        users.add(new User(5,"Vika",50));
        users.add(new User(6,"Andria",11));
        users.add(new User(7,"Sandra",9));
        users.add(new User(8,"Alexx",34));
  return users;
    }
}
