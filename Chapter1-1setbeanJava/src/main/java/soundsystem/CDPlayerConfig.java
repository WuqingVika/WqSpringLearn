package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import testpackage.TestSingers;

/**
 * 配置类
 * Created by wuqingvika on 2017/12/2.
 */
@Configuration
//@ComponentScan //1.这个注解默认会扫描与配置类相同的包
//@ComponentScan("soundsystem") //2.设定扫描的基础包
//@ComponentScan(basePackages = "soundsystem")//3.详细写法 注意basePackages说明可以设置多个。
//@ComponentScan(basePackages = {"soundsystem","testpackage"})//4.这种通过String表示不安全，如果重构代码就麻烦了
@ComponentScan(basePackageClasses ={SgtPeppers.class,TestSingers.class})//5.指定所在的包作为组件扫描的基础包
 public class CDPlayerConfig {

}
