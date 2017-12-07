package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Cd里放入某人的专辑方能播放
 * Created by wuqingvika on 2017/12/7.
 */
@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc sgtPeppers;
    @Autowired
    public void setSgtPeppers(CompactDisc sgtPeppers) {
        this.sgtPeppers = sgtPeppers;
    }
    public void play() {
        System.out.print("vcd 里面有歌手sgt");
        sgtPeppers.play();
    }
}
