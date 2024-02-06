package Day11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Story implements Serializable {
    private List<StorySegment> segments;

    public Story() {
        this.segments = new ArrayList<>();
    }

    public void addSegment(StorySegment segment) {
        this.segments.add(segment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (StorySegment segment : segments) {
            sb.append(segment.getAuthor()).append(": ").append(segment.getSentence()).append("\n");
        }
        return sb.toString();
    }
}

