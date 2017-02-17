package core

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object CreateRDD {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("CreateRDD").setMaster("local")
    val sc = new SparkContext(conf)
    val data = Array(1, 2, 3, 4, 5)
    val dataRDD = sc.parallelize(data)
    dataRDD.collect().foreach(println)
  }
}