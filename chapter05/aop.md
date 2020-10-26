aop:
    
  
  security : 前置通知 保护方法访问
  
        SecurityDemo :   SecurityAdvice implements MethodBeforeAdvice
         
  simple-after-returning-advice:  后置通知
         
        SimpleAfterReturningAdvice: AfterReturningAdvice
    
  after-returning-advice-keygen: 后置通知
    
        AfterAdviceDemo: AfterReturningAdvice
  
  simple-around-advice : 环绕通知
  
        ProfilingDemo:  MethodInterceptor
        
  simple-throws-advice : 异常通知
        
        SimpleThrowsAdvice: ThrowsAdvice
        
  static-pointcut :  静态切点
        
        SimpleStaticPointcut  implements  StaticMethodMatcherPointcut
                matches()
                getClassFilter()
  
  dynamic-pointcut: 动态切点 ????
  
         SimpleDynamicPointcut  implements : DyanmicMethodMatcherPointcut
               
  
  proxyfactorybean : 使用简单名称匹配
        
        GrammyGuitarist: 
  
  regex-pointcuts : 正则表达式创建切点
    
        RegexpPointcutDemo :  JdkRegexpMethodPointcut
                matches();
   
  aspectj-regex-pointcuts :  使用 AspectJ切入点表达式创建切入点
        
        AspectjexpPointcutDemo  :   AspectJExpressionPointcut
                matches(Class<?> targetClass)
  
  annotation-pointcut : 创建注解匹配切入点
  
        AnnotationPointcutDemo : AnnotationMatchingPointcut 
  
  simple-name-matching :   
    
        NamePointcutDemo : NameMatchMethodPointcutAdvisor 
    
  
  cglib-performance:  jdk动态代理 与 cglib代理 性能比较
        
  
  cflow-pointcuts: 流控切点
        
        Pointcut pc = new ControlFlowPointcut(ControlFlowDemo.class, "test");
        只有test方法能使用! 
    
  composable-pointcut : 组合切点
        
        ComposablePointcutDemo : ComposablePointcut
            pc.union(new TalkMethodMatcher());
            pc.intersection(new RestMethodMatcher());
  
  modification-introduction: 引入
        
        IntroductionDemo :  IntroductionAdvisor
  
  proxyfactorybean :  使用
        
        ProxyFactoryBeanDemo : ???
  
  aop-namespace :  使用 aop 名称空间
        
        <aop:config>

  