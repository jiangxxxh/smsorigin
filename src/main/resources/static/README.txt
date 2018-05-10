
牛耳学员管理系统

技术栈:
h-ui + jquery + spring boot + mybatis + mysql

1.导入工程

2.执行 db/newersms.sql
  检查 application.yml 中的数据库用户名和密码

3.启动 com.newer.sms.Application

4.Chrome: http://127.0.0.1:8086/index.html



开发步骤:
1.实体类: com.newer.sms.domain
2.映射器接口: com.newer.sms.mapper
  映射器文件: resources/mybatis/mapper/*.xml
3.业务逻辑类: com.newer.sms.service
4.控制器类: com.newer.sms.controller

5.配置类: com.newer.sms.config
  工具类: com.newer.sms.util

6.html + css + js + images: resources/static