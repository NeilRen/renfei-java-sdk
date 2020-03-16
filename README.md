<p align="center">
<a href=" https://www.renfei.net"><img src="https://cdn.renfei.net/images/renfei_sdk_for_java.jpg"></a>
</p>

<h1 align="center">RenFei SDK for Java</h1>

<p align="center">
<a href="https://search.maven.org/search?q=g:%22net.renfei%22%20AND%20a:%22sdk%22"><img src="https://img.shields.io/maven-central/v/net.renfei/sdk.svg?label=Maven%20Central" alt="Latest Stable Version"/></a>
<a href="https://travis-ci.org/NeilRen/renfei-java-sdk"><img src="https://travis-ci.org/NeilRen/renfei-java-sdk.svg?branch=master"/></a>
<a href='https://coveralls.io/github/NeilRen/renfei-java-sdk?branch=master'><img src='https://coveralls.io/repos/github/NeilRen/renfei-java-sdk/badge.svg?branch=master' alt='Coverage Status' /></a>
<a href="https://codebeat.co/projects/github-com-neilren-renfei-java-sdk-master"><img src="https://codebeat.co/badges/8fc75bd7-f1c3-4383-bbec-e752d71138d2" /></a>
<a href="https://ci.appveyor.com/project/NeilRen/renfei-java-sdk"><img src="https://ci.appveyor.com/api/projects/status/ym3ev2dx20715too?svg=true"/></a>
</p>

收集开发中常用的代码工具。虽然程序员们都热衷于重复的"造轮子"，但这样是不对的，如果代码有问题你应该尝试去修复，而不是重新再造一个轮子出来。所以我收集开发中常用的工具代码，以方便在各个项目中重新利用它们。如果您在使用 RenFei SDK for Java 的过程中遇到任何问题，欢迎在当前 GitHub [提交 Issues](https://github.com/NeilRen/renfei-java-sdk/issues/new)。

## 环境要求
1.RenFei SDK for Java 需要1.8以上的JDK。

## 安装依赖
将RenFei SDK for Java包含在您的项目中
#### 通过Maven来管理项目依赖(推荐)
如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。
您只需在`pom.xml`中声明以下两赖：
```xml
<dependency>
    <groupId>net.renfei</groupId>
    <artifactId>sdk</artifactId>
    <version>0.0.9</version>
</dependency>
```
