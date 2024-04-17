package Observer;

import Strategy.FriendStrategy;
import Strategy.LengthStrategy;
import Strategy.Strategy;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        Strategy friendStrategy = new FriendStrategy();
        Strategy lengthStrategy = new LengthStrategy();

        model.addQueryObserver( new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }
        }, friendStrategy);

        model.addQueryObserver( new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long... " + query);
            }
        }, lengthStrategy);
    }
}
