package com.lps.graph.model.strategy.search;

public class NoSearch implements SearchAlgoritmStrategy {

    @Override
    public String searchPath(String source, String destiny) {
        throw new UnsupportedOperationException("Not supported because no search was activated");
    }

    @Override
    public boolean existPath(String source, String destiny) {
        throw new UnsupportedOperationException("Not supported because no search was activated");
    }
}
