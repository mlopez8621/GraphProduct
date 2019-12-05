package com.lps.graph.model.strategy.weight;

import com.lps.graph.model.Arc;
import java.util.List;

public interface WeightStrategy {

    void addArc(List<Arc> arcs, String source, String destiny);

    void addArc(List<Arc> arcs, String source, String destiny, int weight);
}
