package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by wuqingvika on 2017/12/2.
 */
@Component
public class SgtPeppers implements CompactDisc {
   private String title="<小幸运>";
   private String artist="田喜碧";
    public void play() {
        System.out.print("女神"+artist+"唱:"+title);
    }
}
