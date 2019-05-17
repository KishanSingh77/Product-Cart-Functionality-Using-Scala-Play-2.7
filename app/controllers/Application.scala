package controllers

import javax.inject._

import akka.actor.ActorSystem
import play.api.mvc._

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future, Promise}
@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  val cart = List("apple", "banana")

  // maps to /views/orders.scala.html
  def basket = Action {
    Ok(views.html.basket(cart))
  }
  
  def products(id: Long) = Action {
    // would normally do a lookup here based on the id.
    // we'll just return an XYZ Widget.
    val product = ("The XYZ Widget", "The XYZ Widget is the one and only widget you need for ...")
    Ok(views.html.productDetail(product, cart))
  }

  /**
   * demonstrate a function being passed to a template
   */
  def sayHello = <p>Hello, world</p>
  
  def function = Action {
    Ok(views.html.function(sayHello))
  }
  
}