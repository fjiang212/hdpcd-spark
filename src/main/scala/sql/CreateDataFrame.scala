package sql.object1

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object CreateDataFrame {
    val conf = new SparkConf().setAppName("Spark SQL basic example").setMaster("spark:\\l27.0.0.1:7077")
    val sc = new SparkContext(conf)
    
    //val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    //val df = sqlContext.read.json("examples/src/main/resources/people.json")

    
}