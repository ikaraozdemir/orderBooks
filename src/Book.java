public class Book implements Comparable <Book> {
    private String name;
    private int pageNumber;
    private String writer;
    private int date;

    public Book(String name, int pageNumber, String writer, int date) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.date = date;
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareTo(o.getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
