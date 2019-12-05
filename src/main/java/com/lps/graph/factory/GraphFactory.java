package com.lps.graph.factory;

import com.lps.graph.model.Graph;
import com.lps.graph.model.strategy.search.BFS;
import com.lps.graph.model.strategy.search.DFS;
import com.lps.graph.model.strategy.search.NoSearch;
import com.lps.graph.model.strategy.search.SearchAlgoritmStrategy;
import com.lps.graph.model.strategy.type.Directed;
import com.lps.graph.model.strategy.type.TypeStrategy;
import com.lps.graph.model.strategy.type.Undirected;
import com.lps.graph.model.strategy.weight.Unweighted;
import com.lps.graph.model.strategy.weight.WeightStrategy;
import com.lps.graph.model.strategy.weight.Weighted;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GraphFactory {

    @Value("${name}")
    private String name;

    @Value("${directed}")
    private boolean isDirected;

    @Value("${weighted}")
    private boolean isWeighted;

    @Value("${search.active}")
    private boolean isSearchActive;

    @Value("${search.dfs}")
    private Boolean isDfs;

    private SearchAlgoritmStrategy searchAlgoritmStrategy;

    private TypeStrategy typeStrategy;

    private WeightStrategy weightStrategy;

    public Graph getGraph() {
        if (isSearchActive) {
            searchAlgoritmStrategy = isDfs ? new DFS() : new BFS();
        } else {
            searchAlgoritmStrategy = new NoSearch();
        }

        weightStrategy = isWeighted ? new Weighted() : new Unweighted();

        typeStrategy = isDirected ? new Directed(weightStrategy) : new Undirected(weightStrategy);

        return new Graph(name, searchAlgoritmStrategy, typeStrategy);
    }
}
