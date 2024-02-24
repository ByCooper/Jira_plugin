package ut.ru.bycooper.jira.tz;

import org.junit.Test;
import ru.bycooper.jira.tz.api.MyPluginComponent;
import ru.bycooper.jira.tz.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}