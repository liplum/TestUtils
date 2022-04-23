package net.liplum.metatest;

import net.liplum.test.extension.Memory;
import net.liplum.test.extension.Timing;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({Timing.class, Memory.class})
public class TestExtension {
    @Test
    @Tag("fast")
    public void test() {
        System.out.println("Test Ended.");
        System.out.flush();
    }
}
