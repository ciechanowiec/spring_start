package eu.ciechanowiec.springstart.chapter6.ch6ex4.model;

/**
 * @author Herman Ciechanowiec
 */
public class Comment {

    private String text;
    private String author;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Comment{text='%s', author='%s'}", text, author);
    }
}
