public class Page {
    private String title; 
    private int pageNumber; 

    public Page(String title, int pageNumber) {
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Page [title=" + title + ", pageNumber=" + pageNumber + "]";
    }
}