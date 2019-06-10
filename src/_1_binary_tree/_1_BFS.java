package _1_binary_tree;


import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树按层遍历
 * 102
 *
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 *
 * 每一层输出一行的话，只需要在res.add(list);处打印换行就行了
 * 不需要记录节点
 */
public class _1_BFS {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int count = q.size();
            List<Integer> list = new ArrayList<>();
            while (count-- > 0){
                TreeNode tmp = q.poll();
                list.add(tmp.val);
                if (tmp.left != null) q.offer(tmp.left);
                if (tmp.right != null) q.offer(tmp.right);
            }
            res.add(list);

        }
        return res;
    }
}
