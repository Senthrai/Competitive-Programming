package com.mycompany.foutoir;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame2Test {
    @Test
    public void testJump() {
        // Test case 1: Example case
        int[] nums1 = {2, 3, 1, 1, 4};
        assertEquals(2, JumpGame2.jump(nums1));

        // Test case 2: Edge case with a single element
        int[] nums2 = {0};
        assertEquals(0, JumpGame2.jump(nums2));

        // Test case 3: Edge case with an empty array
        int[] nums3 = {};
        assertEquals(0, JumpGame2.jump(nums3));

        // Test case 4: All elements are 1s
        int[] nums4 = {1, 1, 1, 1, 1};
        assertEquals(4, JumpGame2.jump(nums4));

        // Test case 5: Large input
        int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(4, JumpGame2.jump(nums5));

        // Test case 6: No need to jump
        int[] nums6 = {1,2};
        assertEquals(1, JumpGame2.jump(nums6));
    }


}