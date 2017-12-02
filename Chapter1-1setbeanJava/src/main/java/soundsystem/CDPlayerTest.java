package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by wuqingvika on 2017/12/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)//此注解告诉它需要在CDPlayerConfig加载配置
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNullByJava(){
        /*assertNotNull(cd);*/
        cd.play();
    }
}
