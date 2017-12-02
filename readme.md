# :sparkles: :heart: 举杯敬《Spring IN ACTION》 :heart: :sparkles:
## :bowtie: 一步两步我摩擦
### 1.邂逅Spring：
- 1.1 自动化装配Bean
  - 基于Java配置
  - 基于Xml配置

### 2.踩过关于Spring的坑：
- 2.1org.springframework.core.annotation.AnnotatedElementUtils.findMergedAnnotationAttributes
  - 注意Spring版本问题
  - spring-test 4.2.4.RELEASE更换为 4.0.0版本即可。
- 2.2@ContextConfiguration与@ImportResource区别：
  - @ContextConfiguration载入一个配置文件
  - @ImportResource相当于在配置文件中导入另一个配置文件