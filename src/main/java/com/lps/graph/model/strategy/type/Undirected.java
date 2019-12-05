package com.lps.graph.model.strategy.type;

import com.lps.graph.model.Arc;
import com.lps.graph.model.Node;
import com.lps.graph.model.strategy.weight.WeightStrategy;
import java.util.List;

public class Undirected implements TypeStrategy {

    private WeightStrategy weightStrategy;

    public Undirected(WeightStrategy weightStrategy) {
        this.weightStrategy = weightStrategy;
    }

    @Override
    public void addArc(List<Arc> arcs, String source, String destiny) {
        this.weightStrategy.addArc(arcs, source, destiny);
        this.weightStrategy.addArc(arcs, destiny, source);
    }

    @Override
    public void addArc(List<Arc> arcs, String source, String destiny, int weight) {
        this.weightStrategy.addArc(arcs, source, destiny, weight);
        this.weightStrategy.addArc(arcs, destiny, source, weight);
    }

    @Override
    public void addNode(List<Node> nodes, String name) {
        Node newNode = Node.builder()
            .name(name)
            .build();

        nodes.add(newNode);
    }
}
