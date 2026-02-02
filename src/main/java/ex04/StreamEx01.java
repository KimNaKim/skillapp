package ex04;

import java.util.List;

//stream = 임시 수도관
public class StreamEx01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);

        //1. 가공
        List<Integer> newList = list.stream()
                .map(num -> num*2)  //2. 가공 or 연산 - 여러 번 가공이 가능
                .toList();  //3. 수집
        newList.stream().forEach(num -> {   //stream으로 forEach 돌리기
            System.out.print(num + " ");
        });
        System.out.println();

        //2. filter()
        List<Integer> newList2 = list.stream()
                .map(num -> num+1)      //연산
                .peek(num -> {          //중간연산 출력
                    System.out.print(num + " ");
                })
                .filter(num -> num < 4).toList();   //filter

        System.out.println();
        newList2.stream().forEach(num ->{
            System.out.print(num + " ");
        });

        System.out.println();
        // 3. max
        int maxNum = list.stream()
                .mapToInt(i->i)
                .max()
                .getAsInt();
        System.out.println(maxNum);

        //4. limit
        List<Integer> newList4 = list.stream()
                .limit(2)
                .toList();
        newList4.stream().forEach(num ->{
            System.out.print(num +" ");
        });
        System.out.println();
    }
}
