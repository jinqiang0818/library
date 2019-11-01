package testListRemove;


import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Objects;

public class ListRemoveTest {

    @Test
    public void testRemove() {
        List<String> list = Lists.newArrayList("111","222","222","333","444");
        for (String s : list) {
            if (Objects.equals("222",s)) {

            }
        }
    }
}
