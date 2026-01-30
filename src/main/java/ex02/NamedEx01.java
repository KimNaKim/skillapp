package ex02;

import lombok.Data;

//데이터를 쪼개지 않는 방법
@Data
class User{
    private int id;
    private String username;
    private String password;
    private String type;

    //학생
    private String classRoom;   //교실
    private String classYear;   //학년

    //선생
    private String subject;     //담당과목
    private String teacherName; //이름

    //외부에서 함부로 new를 할 수 없게 잠그는 코드
    private User() {
    }

    //named 생성자
    public static User createTeacher(int id, String username, String password, String subject, String teacherName){
        User user = new User();
        user.id = id;
        user.username = username;
        user.password = password;
        user.type = "선생";
        user.subject = subject;
        user.teacherName = teacherName;
        return user;
    }

    public static User createStudent(int id, String username, String password, String classRoom, String classYear){
        User user = new User();
        user.id = id;
        user.username = username;
        user.password = password;
        user.type = "학생";
        user.classRoom = classRoom;
        user.classYear = classYear;
        return user;
    }
}


public class NamedEx01 {
    public static void main(String[] args) {
        User student1 = User.createStudent(1, "ssar", "1234", "101", "3");
        User teacher1 = User.createTeacher(2, "cos", "1234", "수학", "코스");
    }
}
