package ex05;

import java.util.Optional;

public class OptEx01 {
    //2.
    static Optional<String> hello(){
        return Optional.of("ssar");
    }

    //4.
    static String download(int i){
        if(i % 2 == 0){
            return null;
        }else{
            return i+"";
        }
    }

    public static void main(String[] args) {
        //1. optional of 메서드
        String name = "ssarmango";
        Optional<String> opt = Optional.of(name);       //선물박스 안에 값 삽입 (null 삽입 불가)
        System.out.println(opt.get());  //위험한 코드
        System.out.println(opt.get().length());

        //2.
        String name2 = hello().get();   //그냥 hello()로 값을 받을 수는 없음

        //3.Optional nullable(null이 허용되는 값)
        String name3 = null;
        Optional<String> opt3 = Optional.ofNullable(name3); //null 허용됨
        //값이 없을 때는 if문으로 처리
        if(opt3.isEmpty()){
            System.out.println("null");
        }
        if(opt3.isPresent()){
            System.out.println(opt3.get());
        }

        //4. orElse
        String name4 = download(111);  // null일수도 아닐수도 있음
        Optional<String> opt4 = Optional.ofNullable(name4); //null 허용됨

        //4-1. orElseThrow
        String value1 = opt4.orElseThrow(()-> new RuntimeException("opt에 값이 존재하지 않음"));
        System.out.println("value1 : " + value1);

        //4-2. orElse
        String value2 = opt4.orElse("0");    //opt4의 값이 null일 경우 괄호 안의 값을 리턴
        System.out.println("value2 : " + value2);


    }
}
