package class1.ex;

public class BookInfoMain {
    public static void main(String[] args) {
        BookInfo book1Info = new BookInfo();
        book1Info.title = "채식주의자";
        book1Info.author = "한강";
        book1Info.price = 13500;

        BookInfo book2Info = new BookInfo();
        book2Info.title = "이기적 유전자";
        book2Info.author = "리처드 도킨스";
        book2Info.price = 18000;

        BookInfo[] bookInfos = new BookInfo[]{book1Info, book2Info};

        for (BookInfo i : bookInfos) {
            System.out.println("제목: " + i.title + " 작가: " + i.author + " 가격: " + i.price);
        }
    }
}
