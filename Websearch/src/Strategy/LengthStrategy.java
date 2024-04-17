package Strategy;
public class LengthStrategy implements Strategy {

    @Override
    public boolean isInteresting(String query) {
        return query.length() > 60;
    }
    
}
