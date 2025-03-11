import java.util.ArrayList;
import java.util.List;

public class Book {
    private String bookTitle;
    private List<Chapter> chapters;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.chapters = new ArrayList<>();
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
        System.out.println("Đã thêm chương " + chapter.getChapterName() + " vào sách " + bookTitle);
    }

    public void removeChapter(int chapterNumber) {
        for (int i = 0; i < chapters.size(); i++) {
            if (chapters.get(i).getChapterNumber() == chapterNumber) {
                Chapter removedChapter = chapters.remove(i);
                System.out.println("Đã xóa chương " + removedChapter.getChapterName() + " khỏi sách " + bookTitle);
                return;
            }
        }
        System.out.println("Không tìm thấy chương số " + chapterNumber + " trong sách " + bookTitle);
    }

    public int getChapterCount() {
        return chapters.size();
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        return "Book [bookTitle=" + bookTitle + ", chapters=" + chapters + "]";
    }
}