package sql

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object CreateDataFrame {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark SQL basic example").setMaster("local")
    val sc = new SparkContext(conf)

    val inputPath = args(0)
    
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val df = sqlContext.read.json(inputPath)
    
    df.show()
  }
}