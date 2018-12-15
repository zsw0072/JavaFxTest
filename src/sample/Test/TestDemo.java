package sample.Test;

import org.junit.Test;

import java.util.Properties;

public class TestDemo {

    @Test
    public void demo1() {
        final String property = System.getProperty("os.name");
        System.out.println(property);
    }

    }
