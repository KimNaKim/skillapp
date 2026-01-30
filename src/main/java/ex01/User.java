package ex01;

import lombok.Data;

@Data   //getter, setter, toString() 자동생성
public class User {
    private int id;
    private String username;
    private String email;
}
