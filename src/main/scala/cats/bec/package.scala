package cats

import cats.data.Kleisli
import org.apache.spark.SparkContext

package object bec {
  type SparkTask[A] = Kleisli[Id, SparkContext, A]
}
