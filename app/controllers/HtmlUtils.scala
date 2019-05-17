package controllers

import javax.inject._

import akka.actor.ActorSystem
import play.api.mvc._

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future, Promise}

@Singleton
class HtmlUtils @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  
  def li(string: String) = <li>{string}</li>
  def anchor(url: String, description: String) = <a href="{url}">{description}</a>

}