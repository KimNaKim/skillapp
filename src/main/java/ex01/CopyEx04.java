package ex01;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//게시글
@Data
class Board{    //1
    private int id;
    private String title;
    private String content;
    private List<Reply> replies = new ArrayList<>();
}
//댓글
@Data
class Reply{    //N
    private int id;
    private String comment;
}

@Data
class DetailDTO{
    private int id;
    private String title;
    private String content;
    private List<String> comments = new ArrayList<>();

    public DetailDTO(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        //stream을 이용하는 삽입방법
        this.comments = board.getReplies().stream()
                .map(reply -> reply.getComment()).toList();
        
        //for문을 이용하는 삽입방법
/*        for(Reply reply : board.getReplies()){
            this.comments.add(reply.getComment());
        }*/

    }
}

public class CopyEx04 {
    public static void main(String[] args) {
        //Hibernate
        //1. 댓글객체 생성하기
        Reply r1 = new Reply();
        r1.setId(1);
        r1.setComment("1번째댓글");
        Reply r2 = new Reply();
        r2.setId(2);
        r2.setComment("2번째댓글");
        Reply r3 = new Reply();
        r3.setId(3);
        r3.setComment("3번째댓글");

        //2. 게시글 객체 생성하기
        Board board = new Board();
        board.setId(1);
        board.setTitle("제목1");
        board.setContent("내용1");
        board.setReplies(List.of(r1,r2,r3));

        DetailDTO dto = new DetailDTO(board);
        System.out.println(dto);

    }
}
