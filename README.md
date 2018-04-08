HDPCDSpark
=========================

Setup Eclipse project with sbt
---------------------
<http://www.itversity.com/topic/setup-scala-and-sbt/>

<http://www.itversity.com/topic/setup-scala-ide-for-eclipse/>

- Create project folder HDPCDSpark
- Edit ~/.sbt/0.13/plugins/plugins.sbt to add eclipse

    addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
- Create hdpcd-spark/build.sbt 
- Run **sbt package**
- Run **sbt eclipse**
            
Start spark cluster in HDP 2.4
---------------------
- Start cluster 
    
    cd /usr/hdp/2.4.0.0-169/spark/sbin
    ./start-master.sh
    ./start-slave.sh spark://10.0.2.15:7077
    
- Check Spark cluster in the UI

  <http://localhost:8090/>

  port is set in /usr/hdp/2.4.0.0-169/spark/conf/spark-env.sh

    SPARK_MASTER_WEBUI_PORT=8090
    
        
