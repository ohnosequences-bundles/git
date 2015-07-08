package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._


case object git extends Bundle() {



  def install: Results = {
    Seq("yum", "install", "-y", "git") ->-
		success(s"${bundleName} is installed")

  }

  def clone(repo: String, dir: String = ""): Results =
  	Seq("git", "clone", repo) ++ (if (dir.isEmpty) Seq() else Seq(dir))

}
