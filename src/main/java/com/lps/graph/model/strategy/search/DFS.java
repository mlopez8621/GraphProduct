package com.lps.graph.model.strategy.search;

public class DFS implements SearchAlgoritmStrategy {

    @Override
    public String searchPath(String source, String destiny) {
        return "Implemented DFS algoritm";
    }

    @Override
    public boolean existPath(String source, String destiny) {
        return false;
    }
}
