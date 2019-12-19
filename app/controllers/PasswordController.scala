/*
 * Copyright (c) 2019. Haroldo Ramirez da Nobrega
 */

package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

@Singleton
class PasswordController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {



  def createPage() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.passwords.create())
  }

  def updatePage() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.passwords.update())
  }

  def detailPage() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.passwords.detail())
  }

  def listPage() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.passwords.list())
  }

}
