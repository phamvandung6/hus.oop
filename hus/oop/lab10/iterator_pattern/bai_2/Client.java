package hus.oop.lab10.iterator_pattern.bai_2;

public class Client {
    public static void main(String[] args) {
        // Create a Facebook instance
        Facebook facebook = new Facebook();

        // Create a SocialSpammer instance with the Facebook network
        SocialSpammer spammer = new SocialSpammer(facebook);

        // Send spam messages to friends
        spammer.sendSpamToFriends("profileEmail", "Hello friends!");

        // Send spam messages to coworkers
        spammer.sendSpamToCoworkers("profileEmail", "Hello coworkers!");
    }
}