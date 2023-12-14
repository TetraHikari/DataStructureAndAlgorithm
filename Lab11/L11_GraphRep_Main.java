import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class L11_GraphRep_Main {
    final static int inf = Integer.MAX_VALUE;
    // A B C D E F
    static int[][] distanceBetween = {
        {0, 4, 5, inf, inf, inf},
        {4, 0, 11, 9, 7, inf},
        {5, 11, 0, inf, 3, inf},
        {inf, 9, inf, 0, 13, 2},
        {inf, 7, 3, 13, 0, 6},
        {inf, inf, inf, 2, 6, 0}
    };

    public static void main(String[] args) {
        q3();
    }

    // final static int inf = Integer.MAX_VALUE;

static void q2() {
    // A B C D E
    int[][] thisGraph = {
        {0 , 3, 0, 0, 2},
        {3, 0, 1, 0, 0},
        {0, 1, 0, 4, 0},
        {0, 0, 4, 0, 5},
        {2, 0, 0, 5, 0}
    };
    
    System.out.println("Computing DFS");
    q2_dfs(thisGraph);
}

private static void q2_dfs(int[][] thisGraph) {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> visited = new ArrayList<>();
    stack.add(0); // root is at A, we'll suffix next city
    
    while (notEmpty(stack)) {
        int parent = stack.remove(stack.size() - 1);
        visited.add(parent);
        
        for (int x = 0; x < thisGraph.length; x++) {
            if (0 < thisGraph[parent][x] && thisGraph[parent][x] < inf && !visited.contains(x)) {
                stack.add(parent);
                stack.add(x);
                /* your code 1b */
                System.out.println("Edge " + parent + ", " + x);
            }
        } // for
    }
}

private static boolean notEmpty(ArrayList<Integer> stack) {
    return !stack.isEmpty();
}


    static void q3() {
        int A, B, C, D, E, F;
        A = 0;
        B = 1;
        C = 2;
        D = 3;
        E = 4;
        F = 5;
        System.out.println("Dijkstra from A");
        dijkstra(distanceBetween, A);
    }

    static void dijkstra(int[][] graph, int source) {
        int[] distance = initialize_distance_from_source(graph.length, source);
        boolean[] visited = new boolean[graph.length];
        while (moreCityToExplore(visited)) {
            int exploring = nextExplore(visited, distance);
            boolean neighbor_of_exploring = false;
            for (int x = 0; x < distance.length; x++){
                neighbor_of_exploring = 0 < graph[exploring][x] && graph[exploring][x] < inf;
                if (neighbor_of_exploring && !visited[x]) {
                    int new_distance = distance[exploring] + graph[exploring][x];
                    if (new_distance < distance[x]){
                        distance[x] = new_distance;
                    }
                }
            }
            
            // Dijkstra details
            visited[exploring] = true;
            System.out.println("Exploring " + exploring + " " + Arrays.toString(distance));
        }
    }

    private static int[] initialize_distance_from_source(int numCities, int source) {
        int[] distance = new int[numCities];
        for (int i = 0; i < numCities; i++)
            distance[i] = Integer.MAX_VALUE;
        // Your code 2: Start from the source
        distance[source] = 0;
        return distance;
    }

    private static boolean moreCityToExplore(boolean[] visited) {
        for (boolean visit : visited)
            if (!visit)
                return true;
        return false;
    }

    private static int nextExplore(boolean[] visited, int[] dist) {
        int city_index = -1;
        int random_index = -1;
        while (city_index < 0) {
            random_index = (int) (Math.random() * 100) % visited.length;
            if (!visited[random_index])
                city_index = random_index;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && dist[i] < dist[city_index])
                city_index = i;
        }
        return city_index;
    }
}
