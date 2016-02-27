package leandro.rodrigues.graph;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.core.IsEqual.equalTo;


public class NodeTest {

	private Node seven;
	
	@Before
	public void init() {
		this.seven = new Node("7");
	}
	
	@Test
	public void shouldAddEdge() {
		Node eleven = new Node("11");
		Edge expected = new Edge(this.seven, eleven);
		
		this.seven.addEdge(eleven);
		assertThat("outEdget wasn't added", this.seven.outEdges.iterator().next(), equalTo(expected));
		assertThat("inEdget wasn't added", eleven.inEdges.iterator().next(), equalTo(expected));
	}
}
