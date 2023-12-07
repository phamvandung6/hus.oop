package hus.oop.lab10.iterator_pattern.bai_2;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);

}
