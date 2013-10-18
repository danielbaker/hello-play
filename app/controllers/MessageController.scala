package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.json.Json

case class BlogPost(title: String, date: String, content: String)

object BlogController extends Controller {

  implicit val fooWrites = Json.writes[BlogPost]

  def homePage = Action {
    Ok(views.html.cauldron.render())
  }

  def getBlogPost = Action {
    Ok(Json.toJson(List(BlogPost("The Baker's Coding Cauldron", "August 28, 2013 at 10:45 PM", "This is a very basic starter template for a blog homepage.It makes use of Glyphicons that are built into Bootstrap 3, and it makes use of the Pager at the bottom of the page.Make sure you get the Glyphicons files by downloading the entire /fonts directory thatyou can download in the source files or at getbootstrap.com.That directory has all of the web fonts in it which makes Glyphicons work."),
      BlogPost("The Second Blog Post", "August 30, 2013 at 10:45 PM", "This is a very basic starter template for a blog homepage.It makes use of Glyphicons that are built into Bootstrap 3, and it makes use of the Pager at the bottom of the page.Make sure you get the Glyphicons files by downloading the entire /fonts directory thatyou can download in the source files or at getbootstrap.com.That directory has all of the web fonts in it which makes Glyphicons work."))))
  }
}