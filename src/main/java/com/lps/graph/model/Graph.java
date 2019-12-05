package com.lps.graph.model;

import com.lps.graph.model.strategy.search.SearchAlgoritmStrategy;
import com.lps.graph.model.strategy.type.TypeStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Graph {

    private String name;
    private List<Node> nodes;
    private List<Arc> arcs;
    private SearchAlgoritmStrategy searchAlgoritmStrategy;
    private TypeStrategy typeStrategy;

    public Graph(String name, SearchAlgoritmStrategy searchAlgoritmStrategy, TypeStrategy typeStrategy) {
        this.name = name;
        this.nodes = new ArrayList<>();
        this.arcs = new ArrayList<>();
        this.searchAlgoritmStrategy = searchAlgoritmStrategy;
        this.typeStrategy = typeStrategy;
    }

    public Optional<Node> getNode(String name) {
        return nodes.stream()
            .filter(node -> node.getName().equals(name))
            .findFirst();
    }

    public String searchPath(String source, String destiny) {
        return this.searchAlgoritmStrategy.searchPath(source, destiny);
    }

    public boolean existPath(String source, String destiny) {
        return this.searchAlgoritmStrategy.existPath(source, destiny);
    }

    public void addArc(String source, String destiny) {
        this.typeStrategy.addArc(this.arcs, source, destiny);
    }

    public void addArc(String source, String destiny, int weight) {
        this.typeStrategy.addArc(this.arcs, source, destiny, weight);
    }

    public void addNode(String name) {
        this.typeStrategy.addNode(this.nodes, name);
    }
}
