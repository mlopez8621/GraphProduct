package com.lps.graph.model.strategy.weight;

import com.lps.graph.model.Arc;
import com.lps.graph.model.Node;
import java.util.List;

public class Weighted implements WeightStrategy {

    @Override
    public void addArc(List<Arc> arcs, String source, String destiny) {
        this.addArc(arcs, source, destiny, 0);
    }

    @Override
    public void addArc(List<Arc> arcs, String source, String destiny, int weight) {
        Arc newArc = Arc.builder()
            .source(Node.builder().name(source).build())
            .destiny(Node.builder().name(destiny).build())
            .weight(weight)
            .build();

        arcs.add(newArc);
    }
}
