import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.{SaveMode, SparkSession}

object Main {
  Logger.getLogger("org").setLevel(Level.OFF)
  Logger.getLogger("akka").setLevel(Level.OFF)
  def main(args: Array[String]): Unit = {
    println("Running `$name$`...")
/*
    // Initializing Spark session
 var masterUrl = System.getenv("SPARK_MASTER_URL")
    if (masterUrl == null) {
      masterUrl = "local[*]"
    }
    println(s"master url: $masterUrl")
    val spark: SparkSession = SparkSession.builder()
      .appName(s"Hello Spark")
      .master(masterUrl)
      .getOrCreate()

    val columns = Seq("name", "age")
    val data = Seq(("Tom", "20"),
      ("Job", "99"),
      ("Eva", "43"))
    val rdd = spark.sparkContext.parallelize(data)
    val df = spark.createDataFrame(rdd)
      .toDF(columns: _*)
    df.printSchema()
    df.show()

    // Saving people's name into names.csv
    df.select("name").write
      .mode(SaveMode.Overwrite)
      .parquet("names.parquet")*/
  }
}
