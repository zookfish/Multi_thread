### 多线程
#### 使用多线程
* 继承thred类
* 实现Runnable接口

* currentThread 执行当前代码的线程
* isAlive     判断线程是否处于活动状态(运行、准备运行)
* sleep       正在执行的线程休眠 
* getId       获取线程的唯一标识

* interupt()    停止线程(本质上是做一个中断的标记)
* interupted()  当前线程是否停止 (具有清除状态的功能,两次调用得到相反的值)
* isInterupted()  判断线程是否停止

#### 三种方式停止线程
* 异常法 
    + 根据interrupted判断,为true直接抛异常 停止执行run方法
* sleep中停止线程
    + sleep停止线程会抛出异常
* stop 暴力停止
    + 存在问题: 锁释放了，有可能出现线程安全问题
* return 停止线程

#### 线程的暂停
* yield   释放掉当前的cpu资源,和其它的线程在同时竞争
* sleep   休眠正在执行的线程。不会在和其它的线程去竞争

#### 线程的优先级

#### 守护线程
* setDaemon(true)

