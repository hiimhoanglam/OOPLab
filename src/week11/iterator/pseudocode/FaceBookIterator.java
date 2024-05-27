package week11.iterator.pseudocode;

import java.util.ArrayList;
import java.util.List;

public class FaceBookIterator implements ProfileIterator{
    private Facebook Facebook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FaceBookIterator(Facebook facebook, String type, String email) {
        Facebook = facebook;
        this.type = type;
        this.email = email;
    }

    @Override
    public Profile getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return profiles.get(currentPosition) != null && currentPosition < emails.size();
    }
    @Override
    public void reset() {
        currentPosition = 0;
    }
}
