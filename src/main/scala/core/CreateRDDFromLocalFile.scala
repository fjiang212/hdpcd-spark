package core

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object CreateRDDFromLocalFile {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("CreateRDDFromLocalFile").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("WARN")
    
    val dataFile = sc.textFile("file:///c:/tmp/test.txt")
    val result = dataFile.map(s => s.length).reduce((a,b) => a + b)
    
    println("Total size: " + result)
  }
}