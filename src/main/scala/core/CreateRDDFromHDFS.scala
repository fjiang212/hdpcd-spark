package core

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

//run in the hdp with the following command 
//[root@sandbox bin]# ./spark-submit --class core.CreateRDDFromHDFS /root/work/hdpcd-spark_2.10-1.0.jar


object CreateRDDFromHDFS {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("CreateRDDFromHDFS").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("WARN")
    
    val dataFile = sc.textFile("hdfs://10.0.2.15:8020/demo/data/Customer/acct.txt")
    dataFile.collect().foreach(println)
  }
}