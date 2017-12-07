package soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by wuqingvika on 2017/12/2.
 */
@Primary
@Component//Component("nbSgtPeppers")起别名
public class SgtPeppers implements CompactDisc {
   private String title="<小幸运2>";
   private String artist="田喜碧";
    public void play() {
        System.out.print("女神"+artist+"唱:"+title);
    }
}
