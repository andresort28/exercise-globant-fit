package com.globant.fit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AppTest 
{
    @Tag("DEV")
    @Test
    public void testInorderOption1 () {
		BinaryTree tree = App.buildBinaryTree(1);
		Assertions.assertEquals("5 13 20 10 15 7 20 1 8 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption1 () {
		BinaryTree tree = App.buildBinaryTree(1);
		Assertions.assertEquals(15, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption2 () {
		BinaryTree tree = App.buildBinaryTree(2);
		Assertions.assertEquals("2 1 3 8 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption2 () {
		BinaryTree tree = App.buildBinaryTree(2);
		Assertions.assertEquals(-1, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption3 () {
		BinaryTree tree = App.buildBinaryTree(3);
		Assertions.assertEquals("4 2 5 1 6 3 7 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption3 () {
		BinaryTree tree = App.buildBinaryTree(3);
		Assertions.assertEquals(-1, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption4 () {
		BinaryTree tree = App.buildBinaryTree(4);
		Assertions.assertEquals("1 5 8 6 10 9 4 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption4 () {
		BinaryTree tree = App.buildBinaryTree(4);
		Assertions.assertEquals(9, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption5 () {
		BinaryTree tree = App.buildBinaryTree(5);
		Assertions.assertEquals("-20 -6 10 -12 -1 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption5 () {
		BinaryTree tree = App.buildBinaryTree(5);
		Assertions.assertEquals(30, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption6 () {
		BinaryTree tree = App.buildBinaryTree(6);
		Assertions.assertEquals("-4 -2 -5 -1 -6 -3 -7 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption6 () {
		BinaryTree tree = App.buildBinaryTree(6);
		Assertions.assertEquals(6, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption7 () {
		BinaryTree tree = App.buildBinaryTree(7);
		Assertions.assertEquals("-10 0 -20 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption7 () {
		BinaryTree tree = App.buildBinaryTree(7);
		Assertions.assertEquals(20, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption8 () {
		BinaryTree tree = App.buildBinaryTree(8);
		Assertions.assertEquals("1 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption8 () {
		BinaryTree tree = App.buildBinaryTree(8);
		Assertions.assertEquals(Integer.MIN_VALUE, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption9 () {
		BinaryTree tree = App.buildBinaryTree(9);
		Assertions.assertEquals("-1 ", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption9 () {
		BinaryTree tree = App.buildBinaryTree(9);
		Assertions.assertEquals(Integer.MIN_VALUE, tree.getMaxDifference(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testInorderOption10 () {
		BinaryTree tree = App.buildBinaryTree(10);
		Assertions.assertEquals("", App.printInorder(tree.getRoot()));
    }
    
    @Tag("DEV")
    @Test
    public void testMaxDifferenceOption10 () {
		BinaryTree tree = App.buildBinaryTree(10);
		Assertions.assertEquals(Integer.MIN_VALUE, tree.getMaxDifference(tree.getRoot()));
    }
}
