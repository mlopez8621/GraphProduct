package com.lps.graph.model.strategy.search;

public interface SearchAlgoritmStrategy {

    String searchPath(String source, String destiny);

    boolean existPath(String source, String destiny);
}
