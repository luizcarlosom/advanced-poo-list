package Observer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


import Strategy.Strategy;
import Strategy.StrategyContext;

/**
 * Perform "web search" (from a  file), notify the interested observers of each query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<Strategy> strategies = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while ( true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, Strategy strategy) {
        observers.add(queryObserver);
        strategies.add(strategy);
    }

    private void notifyAllObservers(String line) {
        for (int i = 0; i < observers.size(); i++) {
            QueryObserver obs = observers.get(i);
            Strategy strategy = strategies.get(i);

            if (strategy.isInteresting(line)) {
                obs.onQuery(line);
            }
        }
    }
}
