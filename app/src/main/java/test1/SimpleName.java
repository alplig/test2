package test1;

import java.util.List;
import java.util.stream.Collectors;


public class SimpleName {

    public static void main(String[] args) {

        filterUser().forEach(System.out::println);
    }



    private static List<String> filterUser() {
        User user = new User();
        return user.getName().stream()
                .filter(x -> x.toLowerCase().contains(User.getName_eq().toLowerCase()))
                .collect(Collectors.toList());
    }
}