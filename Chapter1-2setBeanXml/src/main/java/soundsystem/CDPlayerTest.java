package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wuqingvika on 2017/12/2.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:wqspring.xml"})*/
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNullByXml(){
        /*assertNotNull(cd);*/
        //当不采用Runwith和ContextConfiguration注解可以使用如下获取配置文件
        //ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:wqspring.xml");//等同于下面那种。
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:wqspring.xml");
        cd= (CompactDisc) ac.getBean("sgtPeppers");//如果起别名的时候 name需要与之对应哦。
        cd.play();
    }
}
