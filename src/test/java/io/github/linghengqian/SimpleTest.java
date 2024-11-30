package io.github.linghengqian;

import org.apache.groovy.util.Maps;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void test() {
        Map<String, String> first = Maps.of("first", "1");
        assertEquals("1", first.get("first"));
    }
}
