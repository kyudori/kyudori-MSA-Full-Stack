package thymeleaf.exam;

import lombok.Data;
import lombok.NonNull;

@Data
public  class User {
    @NonNull
    private String userName;
    @NonNull
    private int age;
}
