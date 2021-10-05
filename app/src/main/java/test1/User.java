package test1;


import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;



public class User {

    @Getter
    @Setter
    private List<String> name = Arrays.asList("Имя1","simple Имя2","Имя3 simple","simpleИмя4", "Имя5simple", "ИмЯ6SiMpLe", "Фильтр1","Фильтр2");

    @Getter
    @Setter
    private static String nameEq = "simple";

}
