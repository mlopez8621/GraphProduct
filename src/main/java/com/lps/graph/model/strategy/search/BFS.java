package com.lps.graph.model.strategy.search;

public class BFS implements SearchAlgoritmStrategy {

    @Override
    public String searchPath(String source, String destiny) {
        return "Implemented BFS algoritm";
    }

    @Override
    public boolean existPath(String source, String destiny) {
        return true;
    }
}
