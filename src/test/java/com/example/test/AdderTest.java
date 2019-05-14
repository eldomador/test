package com.example.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void add() {
        Adder adder = new Adder();
        Assert.assertEquals(3,adder.add(1,2));
    }
}