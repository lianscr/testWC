import org.apache.spark.sql.SparkSession

object LoadFile {

  def main(args: Array[String]): Unit = {

    val session = SparkSession.builder().appName("StackOverFlowSurvey").master("local[*]").getOrCreate()
    val dataFrameReader = session.read

    val responses = dataFrameReader
      .option("header", "true")
      .option("inferSchema", value = true)
      .csv("in/2016-stack-overflow-survey-responses.csv")
  }

}
