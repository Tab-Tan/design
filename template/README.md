---
模板方法模式实例
---
0
### 简介
> 本实例为建造大楼项目外包，只关心造大楼，至于其中的步骤如花钱，花时间由实现模板方法的类提供。
### 释义
> 建造一个大楼，在最后的完成方法中调用抽象的基本方法。
> 抽象方法的实现细节并不关心，由实现类决定。

### 抽象类Block
>在模板方法中调用时间和资金方法，完成相应逻辑，至于时间和金钱具体是什么模板方法并不关心。

|方法|描述|
|:----:|:----:|
|abstract int time()|基本方法，所需时间|
|abstract int money()|基本方法，所需资金|
|void completed()|模板方法，完成建造|

### 实现类HenDa
> HenDa类继承了Block，重写其中的抽象方法也就是基本方法。
> 明确了恒大建造这栋大楼的时间和资金。可以调用completed()方法，完成最终目的。 
