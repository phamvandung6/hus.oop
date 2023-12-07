package hus.oop.lab10.iterator_pattern.bai_2;

import java.util.List;

public class FacebookIterator implements ProfileIterator {
  private Facebook facebook;
  private String profileId;
  private String type;
  private int currentPosition;
  private List<Profile> profiles;

  public FacebookIterator(Facebook facebook, String profileId, String type) {
    this.facebook = facebook;
    this.profileId = profileId;
    this.type = type;
    this.currentPosition = 0;
  }

  @Override
  public Profile getNext() {
    if (hasMore()) {
      Profile profile = profiles.get(currentPosition);
      currentPosition++;
      return profile;
    }
    return null;
  }

  @Override
  public boolean hasMore() {
    return currentPosition < profiles.size();
  }

}