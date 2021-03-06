package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json


object Application extends Controller {

  def index = Action {
    val message = "Go to /hello for a greeting."
    Ok(message)
  }

  def sayHello = Action {
    val greeting = "Hello there!"
    Ok(Json.toJson(greeting))
  }

}
