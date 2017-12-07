# :sparkles: :heart: 举杯敬《Spring IN ACTION》 :heart: :sparkles:
## :bowtie: 一步两步我摩擦
### 1.邂逅Spring：
- 1.1 自动化装配Bean
  - [基于Java配置](https://github.com/WuqingVika/WqSpringLearn/tree/master/Chapter1-1setbeanJava) 
  - [基于Xml配置](https://github.com/WuqingVika/WqSpringLearn/tree/master/Chapter1-2setBeanXml)
     - 注解获取配置文件
     >@RunWith(SpringJUnit4ClassRunner.class)
     @ContextConfiguration(locations = {"classpath:wqspring.xml"})
     - java代码获取配置文件
     > ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:wqspring.xml")
  - 为组件扫描的bean命名
     - Component("别名") 与获取配置文件getBean("别名")一一对应
     - Component也可以用Named(别名)代替，但还是建议用Component较好
  - 设置组件扫描的基础包
    - >@ComponentScan //1.这个注解默认会扫描与配置类相同的包
    - >@ComponentScan("soundsystem") //2.设定扫描的基础包
    - >@ComponentScan(basePackages = "soundsystem")//3.详细写法 注意basePackages说明可以设置多个。
    - >@ComponentScan(basePackages = {"soundsystem","testpackage"})//4.这种通过String表示不安全，如果重构代码就麻烦了
    - >@ComponentScan(basePackageClasses ={SgtPeppers.class,TestSingers.class})//5.指定所在的包作为组件扫描的基础包
  - 验证自动装配
    - 媒体播放器中注入CDPlayer(或是Mp3)
    - Cdplayer中注入一首歌
### 2.踩过关于Spring的坑：
- 2.1org.springframework.core.annotation.AnnotatedElementUtils.findMergedAnnotationAttributes
  - 注意Spring版本问题
  - spring-test 4.2.4.RELEASE更换为 4.0.0版本即可。
- 2.2对ContextConfiguration与@ImportResource使用错误：
  - @ContextConfiguration表示载入一个配置文件
  - @ImportResource相当于在配置文件中导入另一个配置文件
- 2.3使用代码获取配置文件失败
  - 通过注解@RunWith(SpringJUnit4ClassRunner.class)与代码获取都写了
  - 使用代码获取配置文件时，不需要注解@RunWith,因为@RunWith与@ContextConfiguration是结合使用。
- 2.4NoUniqueBeanDefinitionException
  - 由于我对CompactDisc写了两个实现类，导致Spring不知道加载哪个bean
  - 解决方法1：将其中一个实现类上方加入注解@Primary([详见1-1TestSingers.java](https://github.com/WuqingVika/WqSpringLearn/blob/master/Chapter1-1setbeanJava/src/main/java/testpackage/TestSingers.java))
  - 解决方法2：通过Java代码获取配置文件，获取别名Bean([详见1-2中CDPlayerTest.java](https://github.com/WuqingVika/WqSpringLearn/blob/master/Chapter1-2setBeanXml/src/main/java/soundsystem/CDPlayerTest.java))
- 2.5断言控制台输出结果错误
  - 需要将断言放在输出结果下面