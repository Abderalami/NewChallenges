package Day11;

import java.io.*;

public class StoryFile {
    public static final String FILE_NAME = "story.txt";

    public static void saveStory(Story story) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(story);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Story loadStory() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Story) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
