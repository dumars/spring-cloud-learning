# README #

---

## Zookeeper + Kafka ##

安裝並啟動 zookeeper, kafka，請先啟動 zookeeper 再啟動 kafka，[教學網站](https://blog.yowko.com/2017/03/windows-os-apache-kafka.html)

## Eureka ##

打開 eureka 畫面 [http://localhost:8761/](http://localhost:8761/)

## Config ##

bus refresh(限定 post)，需帳號密碼，請看設定 -> [http://localhost:8888/bus/refresh](http://localhost:8888/bus/refresh)

## Hystrix dashboard ##

打開 hystrix 畫面 [hystrix-dashboard](http://localhost:7777/hystrix)
* 如果有使用 turbine，則輸入 http://localhost:8989/turbine.stream

## Turbine ##

收集 hystrix 資料

## Zipkin ##

打開 zipkin 畫面 [http://localhost:9411](http://localhost:9411)

## Swagger ##

官網說明：[springfox docs](https://springfox.github.io/springfox/docs/current/)
* message-sender swagger: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
* message-receiver swagger: [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)

## 啟動順序 ##

1. zookeeper
2. kafka
3. eureka
4. config
5. turbine
6. hystrix-dashboard
7. zipkin
8. message-sender
9. message-receiver