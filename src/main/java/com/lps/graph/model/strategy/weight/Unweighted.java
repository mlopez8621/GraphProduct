package com.lps.graph.model.strategy.weight;

import com.lps.graph.model.Arc;
import com.lps.graph.model.Node;
import java.util.List;

public class Unweighted implements WeightStrategy {

    @Override
    public void addArc(List<Arc> arcs, String source, String destiny) {
        Arc newArc = Arc.builder()
            .source(Node.builder().name(source).build())
            .destiny(Node.builder().name(destiny).build())
            .build();

        arcs.add(newArc);
    }

    @Override
    public void addArc(List<Arc> arcs, String source, String destiny, int weight) {
        throw new UnsupportedOperationException("Not supported addArc with weight");
    }
}
