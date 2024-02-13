package org.apache.flink.configuration;

import edu.illinois.CTestClass;
import edu.illinois.CTestJUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Author: Shuai Wang
 * Date:  12/4/23
 */
@RunWith(CTestJUnitRunner.class)
@CTestClass
public class ExampleCTest {
    @Test
    public void testCopyConstructor() {
        try {
            final String key = "ctest";
            Configuration cfg1 = new Configuration();
            System.out.println("With inject, ctest = " + cfg1.getString(key, ""));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
}
