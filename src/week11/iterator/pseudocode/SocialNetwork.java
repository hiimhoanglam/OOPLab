package week11.iterator.pseudocode;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String email);
    ProfileIterator createCoworkersIterator(String email);
}
