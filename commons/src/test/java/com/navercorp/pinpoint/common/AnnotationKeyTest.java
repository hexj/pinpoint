package com.nhn.pinpoint.common;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author emeroad
 */
public class AnnotationKeyTest {

    @Test
    public void getCode() {

        AnnotationKey annotationKey = AnnotationKey.findAnnotationKey(AnnotationKey.API.getCode());
        Assert.assertEquals(annotationKey, AnnotationKey.API);
    }

//    @Test
    public void intSize() {
//        2147483647
        System.out.println(Integer.MAX_VALUE);
//        -2147483648
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    public void isArgsKey() {
        Assert.assertTrue(AnnotationKey.isArgsKey(AnnotationKey.ARGS0.getCode()));
        Assert.assertTrue(AnnotationKey.isArgsKey(AnnotationKey.ARGSN.getCode()));
        Assert.assertTrue(AnnotationKey.isArgsKey(AnnotationKey.ARGS5.getCode()));

        Assert.assertFalse(AnnotationKey.isArgsKey(AnnotationKey.ARGS0.getCode() +1));
        Assert.assertFalse(AnnotationKey.isArgsKey(AnnotationKey.ARGSN.getCode() -1));
        Assert.assertFalse(AnnotationKey.isArgsKey(Integer.MAX_VALUE));
        Assert.assertFalse(AnnotationKey.isArgsKey(Integer.MIN_VALUE));

    }

    @Test
    public void isCachedArgsToArgs() {
        int i = AnnotationKey.cachedArgsToArgs(AnnotationKey.CACHE_ARGS0.getCode());
        Assert.assertEquals(i, AnnotationKey.ARGS0.getCode());


    }
}