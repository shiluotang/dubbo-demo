package org.sqg;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Unit test for simple App.

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testDubboServiceOverMulticastRegistry() {
        try (GenericApplicationContext providerContext = new
                GenericXmlApplicationContext(
                    "dubbo-provider-over-multicast.xml")) {
            Assert.assertTrue(true);
            try (GenericApplicationContext consumerContext = new
                    GenericXmlApplicationContext("dubbo-consumer-over-multicast.xml")) {
                HelloWorld helloworld = consumerContext.getBean(HelloWorld.class);
                for (int i = 0; i < 10; ++i)
                    System.out.println(helloworld.greetings("Bruce Wayne"));
            }
        }
    }
    
    @Test
    public void testDubboServiceOverZooKeeperRegistry() {
        try (GenericApplicationContext providerContext = new
                GenericXmlApplicationContext(
                    "dubbo-provider-over-zookeeper.xml")) {
            Assert.assertTrue(true);
            try (GenericApplicationContext consumerContext = new
                    GenericXmlApplicationContext("dubbo-consumer-over-zookeeper.xml")) {
                HelloWorld helloworld = consumerContext.getBean(HelloWorld.class);
                for (int i = 0; i < 10; ++i)
                    System.out.println(helloworld.greetings("Bruce Wayne"));
            }
        }
    }
}
