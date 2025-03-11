import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String chapterName; 
    private int chapterNumber; 
    private List<Page> pages; 

    public Chapter(String chapterName, int chapterNumber) {
        this.chapterName = chapterName;
        this.chapterNumber = chapterNumber;
        this.pages = new ArrayList<>(); 
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public void addPage(Page page) {
        pages.add(page);
        System.out.println("Đã thêm trang " + page.getTitle() + " vào chương " + chapterName);
    }

    public void removePage(int pageNumber) {
        for (int i = 0; i < pages.size(); i++) {
            if (pages.get(i).getPageNumber() == pageNumber) {
                Page removedPage = pages.remove(i);
                System.out.println("Đã xóa trang " + removedPage.getTitle() + " khỏi chương " + chapterName);
                return;
            }
        }
        System.out.println("Không tìm thấy trang số " + pageNumber + " trong chương " + chapterName);
    }

    public int getPageCount() {
        return pages.size();
    }

    public List<Page> getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Chapter [chapterName=" + chapterName + ", chapterNumber=" + chapterNumber + ", pages=" + pages + "]";
    }
}