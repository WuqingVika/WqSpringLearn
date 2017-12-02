package testpackage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import soundsystem.CompactDisc;

/**
 * Created by wuqingvika on 2017/12/2.
 */
@Component("test")
@Primary//由于spring不知道加载哪一个，需要你手动指定一个默认的加载用@Primary在标识在Class上面
public class TestSingers implements CompactDisc {
   private String title="小幸运";
   private String artist="田hebe";
    public void play() {
        System.out.print("女神"+artist+"唱:"+title);
    }
}
