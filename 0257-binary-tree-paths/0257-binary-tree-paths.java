import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        buildPaths(root, new StringBuilder(), result);
        return result;
    }

    private void buildPaths(
            TreeNode node, StringBuilder path, List<String> result) {
        if (node == null) {
            return;
        }

        int originalLength = path.length();
        if (originalLength > 0) {
            path.append("->");
        }
        path.append(node.val);

        if (node.left == null && node.right == null) {
            result.add(path.toString());
        } else {
            buildPaths(node.left, path, result);
            buildPaths(node.right, path, result);
        }

        path.setLength(originalLength); // Backtrack
    }
}