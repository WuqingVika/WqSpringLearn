package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by wuqingvika on 2017/12/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log=new StandardOutputStreamLog();
    @Autowired
    private MediaPlayer cdPlayer;

    @Test
    public void testAutowired(){
        assertNotNull(cdPlayer);
        cdPlayer.play();
        //媒体播放器》CD播放器或（MP3)》专辑
        assertEquals("vcd 里面有歌手sgt女神田喜碧唱:<小幸运2>",log.getLog());

    }
}
