package com.pe.loads

object ReadFiles {

  def main(args: Array[String]): Unit = {

    val session = SparkSession.builder().appName("StackOverFlowSurvey").master("local[*]").getOrCreate()
    val dataFrameReader = session.read

    val responses = dataFrameReader
      .option("header", "true")
      .option("inferSchema", value = true)
      .csv("resources/data/input/jobs.csv")
  }
  
}
