---
建造者模式实例
---
### 简介
> 本实例为不同品牌手机的建造。
### 释义
> 不同品牌的手机都有相同的硬件但配置不同，比如cpu和内存。
> - 定义抽象类 CellPhone 用于抽象出手机的硬件。
> - 定义接口CellPhoneBuilder 用于建造具体的手机硬件。
> - 定义CellPhoneDirector类 用于作为手机导演者类 建造Mate7和Max4
### 抽象类CellPhone
> 定义了成员变量cpu和ram
### 接口CellPhoneBuilder
|方法|描述|
|:----:|:----:|
|void buildCpu()|建造具体的cpu|
|void buildRam()|建造具体的ram|
|Cellphone getPhone()|用于返回建造好的手机|
### 其他类
> Mate7和Max4继承了CellPhone具体化品牌手机
> Mate7Builder和Max4Builder 实现了CellPhone接口 给手机建造具体的硬件(cpu、ram)
> CellPhoneDirector 提供buildMate7()和buildMax4()方法来获取具体品牌的手机成品。