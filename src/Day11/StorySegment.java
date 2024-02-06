package Day11;

import java.io.Serializable;

public class StorySegment implements Serializable {
    private String sentence;
    private String author;

    public StorySegment(String sentence, String author) {
        this.sentence = sentence;
        this.author = author;
    }

    public String getSentence() {
        return sentence;
    }

    public String getAuthor() {
        return author;
    }
}

