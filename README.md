# Domeats
苍穹外卖

## 1.30
Controller => Service => Mapper

JWT

springboot relaxed binding 不同风格命名自动解析

接收参数DTO 返回参数VO

## 1.31
负载均衡

密码加密

api管理 设计阶段

api测试 开发阶段 Swagger/Knife4J

bean的使用

## 2.1
ORM

ThreadLocal

mybatis pagehelper

WebMvcConfiguration

## 2.2
@PathVariable

公共字段拦截填充 减少代码冗余 AOP

## 2.4
OSS config

useGeneratedKey获取主键

## 2.5
### Redis
* 基于内存的key-value结构数据库
* 性能高 适合存储热点数据
* Springboot集成封装了redis客户端

#### 数据类型
key是字符串类型 value有五种常用类型
* String
* Hash
* List
* Set
* Sorted set / zset

#### 常用命令
* 字符串操作命令
  * SET key value / GET key / SETEX key seconds value / SETNX key value
* 哈希操作命令
  * HSET key field value / HGET key field / HDEL key field / HKEYS key / HVALS key
* 列表操作命令
  * LPUSH key value1 value2 ... / LRANGE key start stop / RPOP key / LLEN key
* 集合操作命令
  * SADD key member1 member2 ... / SMEMBERS key / SCARD key / SINTER key1 key2 ... /
  * SUNION key1 key2 ... / SREM key memeber1 member2 ...
* 有序集合操作命令
  * ZADD key score1 member1 score2 member2 ... / ZRANGE key start stop (WITHSCORE) /
  * ZINCRBY key increment member / ZREM key member1 member2 ...
* 通用命令
  * KEYS pattern / EXISTS key / TYPE key / DEL key1 key2 ...

## 2.12
HttpClient 创建HttpClient对象->创建Http请求对象->调用HttpClient的execute方法发送请求


## 2.18
Spring Cache
Spring EL


## 2.24
Spring Task
* cron表达式
