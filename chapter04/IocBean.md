chapter4 : springIoc特有
  
  bean-init-method: 
>```
>Singer : ＜bean＞标记的 init-method
>SingerConfigDemo  : bean注解声明初始化方法    
    beans  针对所有bean得初始化default-init-method
>```

  initializing-bean: 实现 InitializingBean
  
        SingerWithInterface: afterPropertiesSet
        
  post-construct: jsr250生命周期注解!
        
      
    
  initializing-bean-destroy : bean被销毁时执行的方法!
    
         XML: destroy-method="destroy"
            
  disposable-bean : 实现DisposableBean方法
    
         重写destroy()方法!
  post-construct-pre-destroy : jsr250注解实现 @PreDestroy
  
        DestructiveBeanConfigDemo : bean定义销毁方法
        DestructiveBeanWithJSR250 : jsr250注解实现
  
  bean-name-aware :  感知bean名称! 可以在日志使用
        
        BeanNameAware :  setBeanNaming(String）
            在完成 bean 配置之后且在调用任何生命周期回调（初始 回调或销毁回调）之前，
  
  application-context-aware : 上下文感知! 
        
        ApplicationContextAware : setApplicationContext()
                注册关闭的钩子方法:
                if (ctx instanceof GenericApplicationContext) {
                    ((GenericApplicationContext) ctx).registerShutdownHook();
                }
  
  factory-bean:   MessageDigestFactoryBean 
        
        创建MessageDigest实例
        MessageDigest md5 = MessageDigest . getinstance (” MOS ” ) ;
  
        MessageDigesterConfigDemo :
        AccessingFactoryBeans : 
  
  factory-bean-and-factory-method-attributes : 
        
        <bean id="shaDigest"
                  factory-bean="shaDigestFactory"
                  factory-method="createInstance">
        </bean>
        
  

        
  
  
>了解解析页序
所有初始化机制都可以在同一个 bean 实例上使用在这种情况下， Spring先调用使用了@PostConstrnct注解
的方法，然后调用 afterPropertiesSet()后调用配置文件中指定的初始化方法,该顺序是由一个技术原因决定的，
图1中的路 ，可以注意到在 bean 创建过程中主要完成以下步骤:
(1) 首先调用构造函数来创建 bean;
(2) 注入依赖项（调用 setter)
(3) 现在bean己经存在且提供依赖项，预初始化的 beanPostProcessor基础结构bean将被查询，以查看它
是否想从创建的 bean 中调用任何东西. 这些都是特定于 Spring 基础架构 bean ，它们在创建后执行 ean 修改操
PostConstruct 注解由 CommonAnnotationBeanPostProcessor 注册 所以该 bean 将调用使用了@PostConstrnct
悍的方法 该方法在 bean 被构建之后，在类被投入使用之前 bean 实际初始 之前（即 afterPropertiesSet()
init-method 之前）执行
(4) InitializingBean afterPropertiesSet()方法在注入依赖项后立即执行 如果 BeanFactory 设置了提供的所有 Bean
属性并且满足 Bean.FactoryAware ApplicationContextAware ，将会调用 afterPropertiesSetO方法
(5 后执行 init-method 属性，这是因为它是 bean 的实际初始方法
如果你有 个在特定方法中执行某些初始化操作 bean ，同时在使用 Spring 需要添加更多的初始化代码，那
么理解不同类型 bean 初始化顺序是非常有用的!


对于原型作用域的bean来说， Spring 并不会触发 pre-destruction 事件。 \
spring的设计思想是，不管 bean 的作用域如何，初始化生命周期回调方法将在对象上被调用，
而对于具有原型作用域的 bean，销毁生命周期回调方法则不会被调用。