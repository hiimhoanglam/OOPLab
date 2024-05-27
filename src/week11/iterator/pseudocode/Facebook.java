package week11.iterator.pseudocode;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork{
    List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        }
        else {
            this.profiles = new ArrayList<>();
        }

    }
    private Profile findProfile(String email) {
        for (Profile profile: profiles) {
            if (profile.getEmail().equals(email)) {
                return profile;
            }
        }
        return null;
    }
    @Override
    public ProfileIterator createFriendsIterator(String email) {
        return new FaceBookIterator(this,"friends", email);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String email) {
        return new FaceBookIterator(this,"coworkers", email);
    }
}
