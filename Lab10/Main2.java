

public class Main2 {
    public static void main(String[] args) {
        // Create a BST and insert nodes
        BST_651446 bst = new BST_651446();
        bst.insert(18);
        bst.insert(20);
        bst.insert(25);
        bst.insert(12);

        // Perform searches and print results
        System.out.println("-search recursive---");
        System.out.println(bst.search(20)); // 18<-20->25
        System.out.println(bst.search(25)); // null<-25->30
        System.out.println(bst.search(12)); // null<-12->null
        System.out.println(bst.search(1));  // null

        // Assuming you have implemented searchRecurse and searchIter methods
        System.out.println(bst.searchRecurse(10, bst.getRoot())); // Use your implementation
        System.out.println("-search iterative---");
        System.out.println(bst.searchIter(20)); // Use your implementation
        System.out.println(bst.searchIter(25)); // Use your implementation
        System.out.println(bst.searchIter(12)); // Use your implementation
        System.out.println(bst.searchIter(1));  // Use your implementation
    }

    
    
}
