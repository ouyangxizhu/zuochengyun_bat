package _1_binary_tree;

import util.TreeNode;


/**
 * 297
 * https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/
 * 这个是剑指offer的版本，没那么麻烦，可以自由实现
 * https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84?tpId=13&tqId=11214&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _2_Deserialize_Serialize {
    // Encodes a tree to a single string.
    public int index = -1;
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        if (root.left != null) sb.append(serialize(root.left));
        if (root.right != null) sb.append(serialize(root.right));
        return sb.toString();

    }
    // Decodes your encoded data to tree.
    //
    public TreeNode deserialize(String str) {
        index++;
        int len = str.length();
        if (index >= len) return null;
        String[] strr = str.split(",");
        TreeNode node = null;
        if (!"#".equals(strr[index])) {
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = deserialize(str);
            node.right = deserialize(str);
        }
        return node;
    }

}
