package com.scully.algorithm.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUtilsTest {

    private SimpleUtils utils = null;

    @Before
    public void init() {
        utils = new SimpleUtils();
    }

    @Test
    public void stringToBooleanTrueTest() {
        Assert.assertTrue(utils.stringToBoolean("y"));
        Assert.assertTrue(utils.stringToBoolean("Y"));
        Assert.assertTrue(utils.stringToBoolean("Yes"));
        Assert.assertTrue(utils.stringToBoolean("YeS"));
        Assert.assertTrue(utils.stringToBoolean("true"));
        Assert.assertTrue(utils.stringToBoolean("TRUE"));
    }

    @Test
    public void stringToBooleanFalseTest() {
        Assert.assertFalse(utils.stringToBoolean("n"));
        Assert.assertFalse(utils.stringToBoolean("N"));
        Assert.assertFalse(utils.stringToBoolean("No"));
        Assert.assertFalse(utils.stringToBoolean("nO"));
        Assert.assertFalse(utils.stringToBoolean("false"));
        Assert.assertFalse(utils.stringToBoolean("fALse"));
        Assert.assertFalse(utils.stringToBoolean("zebra"));
        Assert.assertFalse(utils.stringToBoolean(null));
    }

    @Test
    public void getFileTypeByCode() {
        Assert.assertEquals(SimpleUtils.FileType.PDF, utils.getFileTypeByCode(3));
        Assert.assertEquals(SimpleUtils.FileType.JPEG, utils.getFileTypeByCode(1));
        Assert.assertNull(utils.getFileTypeByCode(999));
    }

    @Test
    public void getFileTypeByName() {
        Assert.assertEquals(SimpleUtils.FileType.TEXT, utils.getFileTypeByName("txt"));
        Assert.assertNull(utils.getFileTypeByName("zebra"));
        Assert.assertNull(utils.getFileTypeByName(null));
    }
}
