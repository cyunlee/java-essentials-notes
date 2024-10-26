package ref.ex;

public class BookInfoMain2 {
    public static void main(String[] args) {
        BookInfo2[] bookInfos = new BookInfo2[2];
        bookInfos[0] = createBookInfo("채식주의자", "한강", 13500);
        bookInfos[1] = createBookInfo("이기적 유전자", "리처드 도킨스", 18000);

        printBookInfos(bookInfos);
        getTotalPrice(bookInfos);
    }

    static BookInfo2 createBookInfo(String title, String author, int price) {
        BookInfo2 bookInfo2 = new BookInfo2();
        bookInfo2.title = title;
        bookInfo2.author = author;
        bookInfo2.price = price;

        return bookInfo2;
    }

    static void printBookInfos(BookInfo2[] bookInfo) {
        for (BookInfo2 info : bookInfo) {
            System.out.println("제목: " + info.title + " 작가: " + info.author + " 가격: " + info.price);
        }
    }

    static void getTotalPrice(BookInfo2[] bookInfo) {
        int totalPrice = 0;
        for (BookInfo2 info : bookInfo) {
            totalPrice += info.price;
        }
        System.out.println("총 가격 : " + totalPrice);
    }
}
