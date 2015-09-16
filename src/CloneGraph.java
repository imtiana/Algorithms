import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneGraph {

	public static void main(String[] args) {
		UndirectedGraphNode one = new UndirectedGraphNode(1);
		UndirectedGraphNode two = new UndirectedGraphNode(2);
		UndirectedGraphNode zero = new UndirectedGraphNode(0);
		
		one.neighbors.add(two);
		one.neighbors.add(zero);

		zero.neighbors.add(two);
		zero.neighbors.add(one);

		two.neighbors.add(two);
		two.neighbors.add(zero);
		two.neighbors.add(one);

		cloneGraph(one);

	
		UndirectedGraphNode z1 = new UndirectedGraphNode(1);
		zero.neighbors.add(z1);
		zero.neighbors.add(z1);

		cloneGraph(z1);

	}

	public static class UndirectedGraphNode {
		 int label;
		 List<UndirectedGraphNode> neighbors;
		 UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};
		 
    public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
        HashMap<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
        
        q.add(node);
        map.put(node.label, newNode);
        
        while (!q.isEmpty()) {
            UndirectedGraphNode curr = q.remove();
            
            if (!map.containsKey(curr.label)) {
                map.put(curr.label, new UndirectedGraphNode(curr.label));
            }

            UndirectedGraphNode clone = map.get(curr.label);
            
            for (UndirectedGraphNode n : curr.neighbors) {
                if (!map.containsKey(n.label)) {
                    q.add(n);
                    map.put(n.label, new UndirectedGraphNode(n.label));
                }
                
                clone.neighbors.add(map.get(n));
            }
        }
        return newNode;
    }

}
