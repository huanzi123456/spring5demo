##ioc与di
 控制反转:核心是di!  为了提供一种简单的机制来设置依赖项,并在整个生命周期中管理这些依赖项!
 ioc的类型:
    依赖查找 :
        dependency pull,依赖拉取 DL
        上下文依赖查找 contextualized dependency lookup, CDL
    依赖注入 : 
        构造函数注入,setter注入!

dependency-pull 

    DependencyPull : 依赖查找,依赖拉取

cdl :

    CDLDemo : 上下文查找

bean-instantiation-mode

    NonSingletonDemo: 实例化模式

method-replacement : 方法替换
>1  
 

    

bean-aliases : 命名

    AnnotatedBeanNaming : 
    AliasConfigDemo : 
    BeanCrazyNaming :
    BeanNameAliasing : 
    
bean-autowiring : 自动装配

    使用时机: Spring 的主要思想是 可按自己的喜好创建自己的类，并且让 prin 为你工作，
    AnnotatedDependsOnDemo : 解析依赖项
    TargetDemo : 注解自动状态
    TrickyTarget :  注解,xml混合注释
    DependsOnDemo : 解析依赖项
    Target  : 自动装配
    CTarget  : 自动装配 primary
    
bean-inheritance : bean继承  parent
    
    InheritanceDemo : bean继承
    

GenericXmlApplicationContext:它允许使用 XML 对spring进行外部配置
    
    