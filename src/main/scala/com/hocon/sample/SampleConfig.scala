package com.hocon.sample

case class SampleConfig(project: SampleProject,
                        logger: SampleLogger,
                        sampleObj: SampleObject,
                        sampleExtra: SampleExtra,
                        sampleFoo: SampleFoo)

case class SampleProject(name: String, description: String, author: String)

case class SampleLogger(name: Seq[String], custom: CustomLogger)

case class SampleObject(val1: Int, val2: String)

case class SampleExtra(val1: Int, val2: String, val3: String)

case class CustomLogger(loggerType: String, implementation: String)

case class SampleFoo(value: String)
