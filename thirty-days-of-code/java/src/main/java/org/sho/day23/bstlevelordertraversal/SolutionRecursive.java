// https://www.hackerrank.com/challenges/30-binary-trees/problem
package org.sho.day23.bstlevelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;


class SolutionRecursive {

    private static Queue<Node> queue = new LinkedList<>();

    // recursive solution, not very elegant
    static void levelOrder(Node root) {
        List<Integer> order = new ArrayList<>();
        getLevelOrder(root, order);
        String levelOrder = order.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(levelOrder);
    }

    static void getLevelOrder(Node root, List<Integer> order) {

        order.add(root.data);

        if (root.left != null) {
            queue.add(root.left);
        }
        if (root.right != null) {
            queue.add(root.right);
        }

        if (!queue.isEmpty()) {
            getLevelOrder(queue.remove(), order);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
