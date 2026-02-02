package ex04;

import java.util.List;

public class StreamEx02 {
    public static void main(String[] args) {
        
        //이차원 배열 벗겨내기 (flatMap)
        List<List<Integer>> matrix = List.of(
                List.of(1,2,3),
                List.of(4,5),
                List.of(6,7,8,9)
        );
        List<Integer> newList = matrix.stream()
                .flatMap(list -> list.stream())
                .filter(num -> num>5)
                .toList();
        newList.stream().forEach(num ->{
            System.out.print(num + " ");
        });
        System.out.println();

    }
}
