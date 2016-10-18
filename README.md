lib文件夹下有一个mybatis-generator-core-1.3.2.jar<br>
这是经过一些修改之后的包，有两个改动：<br>
1.生成的实体类的字段带有数据库表的注释<br>
2.在generatorConfiguration配置文件中可以通过table的schema属性来定义一个mapper.xml中mapper的namespace，方便使用自定义mapper子类
使用的时候，用这个jar包替换maven本地仓库中的默认mybatis-generator-core-1.3.2.jar即可生效