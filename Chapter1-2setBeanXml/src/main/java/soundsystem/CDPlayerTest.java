package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wuqingvika on 2017/12/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ImportResource("classpath:wqspring.xml")
@ContextConfiguration(locations = {"classpath:wqspring.xml"})
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNullByXml(){
        /*assertNotNull(cd);*/
        cd.play();
    }
}
