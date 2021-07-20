package org.sho.day23.bstlevelordertraversal;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}


class Solution {


    static void levelOrder(Node root) {
        // Write your code here
        String levelOrder = getLevelOrder(root).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(levelOrder);
    }

    static List<Integer> getLevelOrder(Node root) {


        return Collections.emptyList();
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
