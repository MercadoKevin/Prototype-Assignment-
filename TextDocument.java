public class TextDocument implements Document{
    private String filePath;
    private String encoding;
    private int wordCount;

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    @Override
    public TextDocument clone(){
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Not Supported!");
            return null;
        }
    }

    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
    }
}