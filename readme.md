# :sparkles: :heart: 举杯敬《Spring IN ACTION》 :heart: :sparkles:
## :bowtie: 一步两步我摩擦
### 1.邂逅Spring：
- 1.1 自动化装配Bean
  - 基于Java配置 
  - 基于Xml配置
     - 注解获取配置文件
     ```@RunWith(SpringJUnit4ClassRunner.class)
        @ContextConfiguration(locations = {"classpath:wqspring.xml"})```
     - java代码获取配置文件
     ```ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:wqspring.xml")```
  - 为组件扫描的bean命名
     - Component("别名") 与获取配置文件getBean("别名")一一对应
     - Component也可以用Named(别名)代替，但还是建议用Component较好

### 2.踩过关于Spring的坑：
- 2.1org.springframework.core.annotation.AnnotatedElementUtils.findMergedAnnotationAttributes
  - 注意Spring版本问题
  - spring-test 4.2.4.RELEASE更换为 4.0.0版本即可。
- 2.2对ContextConfiguration与@ImportResource使用错误：
  - @ContextConfiguration表示载入一个配置文件
  - @ImportResource相当于在配置文件中导入另一个配置文件
- 2.3使用代码获取配置文件失败
  - 通过注解()@RunWith(SpringJUnit4ClassRunner.class)与代码获取都写了
  - 使用代码获取配置文件时，不需要注解@RunWith,因为@RunWith与@ContextConfiguration是结合使用。
  