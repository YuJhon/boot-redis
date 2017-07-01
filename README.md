# Spring Boot 整合Redis 简单的示例

## 技术实现: Spring Boot + Mybatis + MySql + Redis

## 使用的缓存更新策略（套路）：Cache Aside

## 缓存更新策略扩展理解：
缓存更新的模式有四种：Cache aside, Read through, Write through, Write behind caching。
失效：应用程序先从cache取数据，没有得到，则从数据库中取数据，成功后，放到缓存中。
命中：应用程序从cache中取数据，取到后返回。
更新：先把数据存到数据库中，成功后，再让缓存失效。

## 调用逻辑图
![Cache-Aside](http://jiangblog.oss-cn-shanghai.aliyuncs.com/vendors/Cache-Strategy.png)
