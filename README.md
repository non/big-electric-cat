## Big Electric Cat

### Dedication

> Big electric cat / big electric cat / big electric cat / big electric cat.
>
> -- Adrian Belew, "Big Electric Cat" (1982)

This project is named after
[The Big Electric Cat](https://en.wikipedia.org/wiki/The_Big_Electric_Cat)
a public access computer system in New York City which was named after
Adrian Belew's song of the same name.

### Overview

This library is intended to support using the
[Cats](http://github.com/non/cats) library with the
[Spark](https://spark.apache.org/) data processing system.  Currently
it defines a few type class instances, and contains tests to ensure
that Cats' type classes serialize correctly in Spark.

### Getting Started

This project is unreleased, and the Cats project is only avaiable as a
snapshot. You will need to build this yourself using
[sbt](http://www.scala-sbt.org/0.13/tutorial/Setup.html)
installed. The current interesting targets are:

 * `compile`: compile the code
 * `test`: run the tests (will use a local instance of Spark)

### Copyright and License

All code is available to you under the MIT license, available at
http://opensource.org/licenses/mit-license.php and also in the
[COPYING](COPYING) file.

Copyright Erik Osheim, 2015.
