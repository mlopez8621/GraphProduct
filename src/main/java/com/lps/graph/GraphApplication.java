package com.lps.graph;

import com.lps.graph.factory.GraphFactory;
import com.lps.graph.model.Graph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class GraphApplication {

	private static GraphFactory graphFactory;

	public static void main(String[] args) {
		SpringApplication.run(GraphApplication.class, args);
		System.out.println();
		init();
		System.out.println();
	}

	private static void init() {
		Graph grap = graphFactory.getGraph();

		System.out.println(grap.getName());

		grap.addNode("A");
		grap.addNode("B");
		grap.addNode("C");

		grap.addArc("A", "B");
		grap.addArc("B", "C");
		grap.addArc("A", "D");

		System.out.println("The path A --> C is: " + grap.searchPath("A", "C"));
		System.out.println("The path A --> C exist?: " + grap.existPath("C", "A"));
	}

	@Autowired
	public void setgraphFactory(GraphFactory graphFactory) {
		GraphApplication.graphFactory = graphFactory;
	}
}
