HDPCDSpark
=========================

Setup Eclipse project with sbt
---------------------
<http://www.itversity.com/topic/setup-scala-and-sbt/>

<http://www.itversity.com/topic/setup-scala-ide-for-eclipse/>

- Create project folder HDPCDSpark
- Edit ~/.sbt/0.13/plugins/plugins.sbt to add eclipse

    addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
- Create HDPCDSpark/build.sbt 
- Run **sbt package**
- Run **sbt eclipse**
            
    