package com.lps.graph.model.strategy.type;

import com.lps.graph.model.Arc;
import com.lps.graph.model.Node;
import java.util.List;

public interface TypeStrategy {

    void addArc(List<Arc> arcs, String source, String destiny);

    void addArc(List<Arc> arcs, String source, String destiny, int weight);

    void addNode(List<Node> nodes, String name);
}
