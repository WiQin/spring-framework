spring源码构建步骤  
工具：jdk  1.8.0_131  
           gradle   5.6   
    idea  2020   
项目;   spring  5.2.x   
隆spring源码  
源码目录下执行gradlew :spring-oxm:compileTestJava  
idea导入项目  
修改gradle配置，本地仓库位置，gradle安装路径等  
修改gradle\wrapper\gradle-wrapper.properties下distributionUrl为本地安装包位置  
distributionUrl=file\:///C:/client/安装包/gradle-5.6-bin.zip
(按这个格式来，应该没问题，现在就是这么做的)  
build.gradle修改远程仓库信息：
repositories {
   			mavenCentral()
   			maven { url "https://repo.spring.io/libs-spring-framework-build" }
  			 maven { url "https://maven.aliyun.com/nexus/content/groups/public/" }
  			 maven { url "https://maven.aliyun.com/nexus/content/repositories/jcenter/" }
   			maven { url "https://repo.spring.io/plugins-release" }
}  
ps：网上说编译aspectj模块会出问题，但是构建时没报错，可能是高版本处理了,要是出了问题就按网上给的方案排除下该模块

遇到问题：
1.测试类报错：No tests found for given includes: [**/*Tests.class, **/*Test.class](include rules)    
  功能栏点击gradle设置,修改gradle设置Run tests using 为IDEA
  参考链接：https://blog.csdn.net/weixin_45736498/article/details/105373217  
2.测试类报错：java.lang.NoClassDefFoundError: org/hamcrest/SelfDescribing  
修改junit依赖版本为4.10（之前为4.12）  
参考链接：https://blog.csdn.net/fanbaodan/article/details/100541582