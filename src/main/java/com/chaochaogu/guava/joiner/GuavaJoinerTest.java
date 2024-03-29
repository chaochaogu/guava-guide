package com.chaochaogu.guava.joiner;

import com.google.common.base.Joiner;

import java.util.Arrays;

/**
 * Joiner 提供了各种方法来处理字符串加入操作，对象等
 *
 * @author chaochao Gu
 * @date 2019/8/14
 */
public class GuavaJoinerTest {

    public static void main(String[] args) {
        GuavaJoinerTest tester = new GuavaJoinerTest();
        tester.testJoiner();
    }

    private void testJoiner() {
        System.out.println(Joiner.on(",")
                .skipNulls()
                .join(Arrays.asList(1, 2, 3, 4, 5, null, 6)));
    }
}
