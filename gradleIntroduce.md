### gradle说明:
#### 一: 安装,环境变量配置!
略:
#### 二: Gradel基础概念: projects(项目) 和 tasks(任务)
	project意义: 取决于用gradle做什么
	一个project是由一个或多个tasks构成得!

	
#### 二:关于两个配置文件build.gradle和setting.gradle!
> setting.gradle --> 管理多项目!
  包含了: -->请参考: org.gradle.api.inittialization.Setting
	rootProject.name = ''
		children
  	include

> build.gradle --> 类似于pom.xml  gradle命令是在有该文件得目录下执行得! 
	plugins{id:"插件名"}
	repositories  

	 
