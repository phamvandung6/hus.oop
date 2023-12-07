package hus.oop.lab10.iterator_pattern.bai_2;

public class Facebook implements SocialNetwork {

  @Override
  public ProfileIterator createFriendsIterator(String profileId) {
    return new FacebookIterator(this, profileId, "friends");
  }

  @Override
  public ProfileIterator createCoworkersIterator(String profileId) {
    return new FacebookIterator(this, profileId, "coworkers");
  }
   
}