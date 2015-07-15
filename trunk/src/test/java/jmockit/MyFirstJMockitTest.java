package jmockit;

import com.megatz.bo.A;
import com.megatz.bo.B;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;

/**
 * Created by marcos on 06-07-15.
 */
@RunWith(JMockit.class)
public class MyFirstJMockitTest {
    @Injectable
    B b;
    @Injectable
    Connection connection;

    @Tested
    A a;

    @Mocked
    PreparedStatement preparedStatement;

    @Test
    public void testJmockitStuff() throws SQLException {
        new Expectations(){{
            a.getConnection().prepareStatement(anyString);returns(preparedStatement);
        }};

        assertNotNull(a.getConnection().prepareStatement("ASDFASDF"));

    }


}


