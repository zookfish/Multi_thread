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

### 对象以及变量的并发访问
#### 线程安全同步
* 只有共享资源的读写才需要做同步化处理(synchronized)

#### 锁重入
* 在synchronized方法/块里面是可以调用其它synchronized方法的
* 可重入锁支持在父子类继承环境中,但是同步不具有继承性
* 运行的线程出现异常,会自动释放锁

* synchronized 方法 与 synchronized 语句块
    + 方法有弊端会占用整个同步过程

* synchronized同步块还支持非this对象,(这样可以避免一个类的所有同步方法都竞争同一个锁,提高效率)

* 静态的同步方法/静态同步代码块  持有的是java文件字节码锁
    + synchronized(Clazz.class) = synchronized static void function
    
#### 死锁
* jps查看运行的线程   jstack -l 线程id 查看死锁
    + 小科普
        - public(类,本包,子类,外部包)>protected(类,本包,子类)>default(类,本包)>private(类)
        - 内部类的好处  https://my.oschina.net/u/1169535/blog/403589

#### volatitle关键字
* 保证了实例变量在多个线程之间的可见性
    + 保证线程每次取值都强制从主内存中获取,而不是在线程的私有堆栈里面取值
* 不具有原子性
    + i++
        - 从内存中取出i的值
        - 计算i+1的值
        - 将计算的值赋给i
#### 原子类实现i++  
 
 
#### 线程间的通信
* wait/notify   用在同步代码中
    + notify执行并不会马上释放锁,而是执行完同步代码的内容才释放,唤醒wait的线程
    + wait 执行就释放,需要等待notify调用完成之后在继续执行 
    + 通知过早也会导致wait无法被通知(所以一般先wait然后notify) 
    + notifyAll 唤醒所有在wait的线程,他们得到了cpu就能够运行
    
#### 管道进行通信 ---- 字节流
* PipedInputStream  PipedReader
* PipedOutputStream   PipedWriter
* 连接通道   pipedInputStream.connect(pipedOutputStream)

#### join
* join 的内部是使用wait实现的
    + 所以join与sleep的区别就明显了
    + join在同步上是释放锁的,sleep是不会释放锁的
    
#### ThreadLocal 
* 保证各个线程变量之间的隔离性
* ThreadLocal初始值为null 可以重写initialValue获取初始值

#### Lock的使用
##### ReentrantLock
* lock.lock() 加锁
* lock.unlock() 释放锁
##### Condition
* condition.await()   相当于Object.wait()  
* condition.signal()/signalAll()  相当于notify/notifyAll


##### ReentrantReadWriteLock



    
  


