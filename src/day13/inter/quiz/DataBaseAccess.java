package day13.inter.quiz;

public interface DataBaseAccess {

    // db에 데이터 삽입 기능
    void insert();

    // db에 데이터 수정 기능
    void update();

    // db에 데이서 삭제 기능
    void delete();

    // db에 데이터 조회 기능
    void select();
}
