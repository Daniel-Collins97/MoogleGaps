import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//New class to hold a CostedPath object i.e. a list of GraphNode objects and a total cost attribute
public class CostedPath {

    public static List<CostedPath> allPaths = new ArrayList<>(); //Collection for all candidate costed paths from this node
    public int pathCost = 0;
    public int pathTime = 0;
    public List<GraphNode> pathList = new ArrayList<>();


/*    //Retrieve cheapest path by expanding all paths recursively depth-first
    public static <T> CostedPath searchGraphDepthFirstCheapestPath(GraphNode startNode, List<GraphNode> encountered, int totalCost, T lookingfor) {
        if (startNode.getName().equals(lookingfor)) { //Found it - end of path
            CostedPath cp = new CostedPath(); //Create a new CostedPath object
            cp.pathList.add(startNode); //Add the current node to it - only (end of path) element
            cp.pathCost = totalCost; //Use the current total cost
            return cp; //Return the CostedPath object
        }
        if (encountered == null) encountered = new ArrayList<>(); //First node so create new (empty) encountered list
        encountered.add(startNode);
        for (GraphLink adjLink : startNode.graphLinkList) //For every adjacent node
            if (!encountered.contains(adjLink.getDestNode())) //That has not yet been encountered
            {
                //Create a new CostedPath from this node to the searched for item (if a valid path exists)
                CostedPath temp = searchGraphDepthFirstCheapestPath(adjLink.getDestNode(), encountered, totalCost + adjLink.getDistance(), lookingfor);
                if (temp == null) continue; //No path was found, so continue to the next iteration
                temp.pathList.add(0, startNode); //Add the current node to the front of the path list
                allPaths.add(temp); //Add the new candidate path to the list of all costed paths
            }
//If no paths were found then return null. Otherwise, return the cheapest path (i.e. the one with min pathCost)
        return allPaths.isEmpty() ? null : Collections.min(allPaths, (p1, p2) -> p1.pathCost - p2.pathCost);
    }*/
}