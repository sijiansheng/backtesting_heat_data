package com.kunyandata

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by sijiansheng on 2016/11/4.
  */
object Scheduler {

  def main(args: Array[String]) {

    val sc = new SparkContext(new SparkConf().setAppName("BACKTESTING_DHACH").setMaster("local"))

  }
}
