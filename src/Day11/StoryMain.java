package Day11;

import java.util.Scanner;

public class StoryMain {
    public static void main(String[] args) {
        Story story = StoryFile.loadStory();
        if (story == null) {
            story = new Story();
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();

            story.addSegment(new StorySegment(sentence, name));
            StoryFile.saveStory(story);

            System.out.println("Current Story: ");
            System.out.println(story);
        }
    }
}
