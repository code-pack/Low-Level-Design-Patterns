package prototype;

import java.util.ArrayList;
import java.util.List;

public class Profile implements Prototype {
    private List<String> photos;
    private String profileId;

    public Profile() {
        this.photos = new ArrayList<>();
    }

    public Profile(String profileId) {
        this.profileId = profileId;

        // runs some database queries to fill up the rest of the profile

        photos = new ArrayList<>();
        photos.add("A");
        photos.add("B");
        photos.add("C");
        photos.add("D");
    }

    private Profile(Profile sourceProfile) {
        Profile profileCopy = new Profile();
        for(String photo: sourceProfile.photos) {
            profileCopy.photos.add(photo);
        }
        profileCopy.profileId = sourceProfile.profileId;

    }


    @Override
    public Object createCloneOf() {
        return new Profile(this);
    }
}
