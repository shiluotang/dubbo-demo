package org.sqg;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public String greetings(final String name) {
        return "Hello, " + name + "!";
    }

}
