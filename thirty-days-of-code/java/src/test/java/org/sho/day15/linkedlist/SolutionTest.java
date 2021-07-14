package org.sho.day15.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    @Test
    void test() {
        Node head = null;

        head = Solution.insert(head, 1);
        head = Solution.insert(head, 2);

        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertNull(head.next.next);
    }
}
