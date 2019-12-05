package com.lps.graph.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Arc {

    private Node source;
    private Node destiny;
    private Integer weight;
}
