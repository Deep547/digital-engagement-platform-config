import play.core.PlayVersion.current
import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt.{ModuleID, _}

object AppDependencies {

  val compile = Seq(

    "uk.gov.hmrc"             %% "govuk-template"           % "5.54.0-play-26",
    "uk.gov.hmrc"             %% "play-ui"                  % "8.8.0-play-26",
    "uk.gov.hmrc"             %% "bootstrap-play-26"        % "1.7.0"
  )

  val test = Seq(
    "uk.gov.hmrc"             %% "bootstrap-play-26"        % "1.7.0" % Test classifier "tests",
    "org.scalatest"           %% "scalatest"                % "3.0.8"                 % "test",
    "org.scalacheck"          %% "scalacheck"               % "1.13.4"                % "test",
    "org.jsoup"               %  "jsoup"                    % "1.10.2"                % "test",
    "org.mockito"             % "mockito-all"               % "1.10.19"               % "test",
    "com.typesafe.play"       %% "play-test"                % current                 % "test",
    "org.pegdown"             %  "pegdown"                  % "1.6.0"                 % "test, it",
    "org.scalatestplus.play"  %% "scalatestplus-play"       % "3.1.2"                 % "test, it"
  )

  val all: Seq[ModuleID] = compile ++ test
}
