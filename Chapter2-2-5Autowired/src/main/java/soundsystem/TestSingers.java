package soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by wuqingvika on 2017/12/2.
 */
@Component("test")
public class TestSingers implements CompactDisc {
   private String title="小幸运";
   private String artist="田hebe";
    public void play() {
        System.out.print("女神"+artist+"唱:"+title);
    }
}
