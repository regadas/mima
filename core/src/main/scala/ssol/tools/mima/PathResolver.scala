package ssol.tools.mima

import scala.tools.nsc.util.{JavaClassPath, ClassPath}

class PathResolver(settings: Settings) extends scala.tools.util.PathResolver(settings, DefaultJavaContext) {
  lazy val mimaResult = new JavaClassPath(containers, DefaultJavaContext)
}

object DefaultJavaContext extends ClassPath.JavaContext


