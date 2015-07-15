package jmockit;

import com.megatz.bo.A;
import com.megatz.bo.B;
import com.megatz.bo.BasicPerson;
import com.megatz.controller.MovieController;
import lombok.extern.slf4j.Slf4j;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by marcos on 06-07-15.
 */
@RunWith(JMockit.class)
@Slf4j
public class MyFirstJMockitTest {
    @Injectable
    B b;
    @Injectable
    Connection connection;

    @Tested
    A a;

    @Injectable
    BasicPerson basicPerson;

    @Mocked
    MovieController movieController;


    @Mocked
    PreparedStatement preparedStatement;

    @Mocked
    List<BasicPerson> listPersonas;

//    @Test
//    public void testJmockitStuff() throws SQLException {
//        new Expectations(){{
//            a.getConnection().prepareStatement(anyString);returns(preparedStatement);
//        }};
//
////        assertNotNull(a.getConnection().prepareStatement(Matchers.anyanyString));
//
//    }
//
    @Test
    public void testMovieControllerShouldReturnListBasicPersons() {
//        new Expectations(){{
//            movieController.getGreeting(anyString); returns(asList(new BasicPerson(),new BasicPerson()));
//        }};


//        assertNotNull(movieController.getGreeting("asdf"));
        log.info("asdfasdfsd");


    }


}


