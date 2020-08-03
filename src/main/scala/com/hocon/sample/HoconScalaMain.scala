package com.hocon.sample

import com.typesafe.config.ConfigFactory
import pureconfig.{CamelCase, ConfigFieldMapping, ConfigSource, ConfigWriter}
import pureconfig.generic.ProductHint
import pureconfig.generic.auto._

case object HoconScalaMain {

  def main(args: Array[String]): Unit = {
    implicit def hint[A] =
      ProductHint[A](ConfigFieldMapping(CamelCase, CamelCase))
    val conf =
      ConfigSource
        .resources("sample-config.conf")
        .load[SampleConfig]

    print(ConfigWriter[SampleConfig].to(conf.getOrElse(null)).render())
  }
}
