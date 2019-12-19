/*
 * Copyright (c) 2019. Haroldo Ramirez da Nobrega
 */

package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AnyContent, BaseController, BaseControllerHelpers, ControllerComponents, Request}

@Singleton
class UserController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def createPage() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.users.create())
  }

}
