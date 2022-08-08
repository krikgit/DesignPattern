package behavioral.memento.example;

public class Memento {
    private String fileName;
    private StringBuilder content;

    public Memento(String fileName, StringBuilder content) {
        this.fileName = fileName;
        this.content = new StringBuilder(content);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }
}
