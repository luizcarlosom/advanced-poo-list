package Strategy;
public class FriendStrategy implements Strategy {

    @Override
    public boolean isInteresting(String query) {
        return query.toLowerCase().contains("friend");
    }
    
}
