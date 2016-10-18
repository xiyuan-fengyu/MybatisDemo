package com.xiyuan.mybatis

import com.xiyuan.mybatis.dao.TbTestDao
import com.xiyuan.template.log.XYLog
import org.apache.ibatis.session.SqlSessionFactoryBuilder

/**
  * Created by xiyuan_fengyu on 2016/8/11 9:33.
  */
object Test {

  def main(args: Array[String]) {
    val config = "mybatisConfig.xml"
    val is = this.getClass.getClassLoader.getResourceAsStream(config)
    val sessionFactory = new SqlSessionFactoryBuilder().build(is)
    val session = sessionFactory.openSession()
    try {
      val dao = session.getMapper(classOf[TbTestDao])
      XYLog.d("最大ID：", dao.maxId().toString)

      XYLog.d(dao.idBetween(0, 10))
    }
    catch {
      case e: Exception => e.printStackTrace()
    }
    finally {
      session.commit(true)
      session.close()
    }
  }

}