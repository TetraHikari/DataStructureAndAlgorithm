package code;

public class TreeNode {
    public int data;
    public TreeNode left, right, parent;

    public TreeNode(int d) {
        data = d;
    }

    @Override
    public String toString() {
        // 4 cases: no child, left-child-only, right-child-only, and both children
        if (left != null && right != null) {
            return left.data + "<-" + data + "->" + right.data;
        } else if (left != null) {
            return left.data + "<-" + data + "->null";
        } else if (right != null) {
            return "null<-" + data + "->" + right.data;
        } else {
            return "null<-" + data + "->null";
        }
    }
}
