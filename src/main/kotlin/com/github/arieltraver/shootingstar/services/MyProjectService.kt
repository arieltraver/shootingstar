package com.github.arieltraver.shootingstar.services

import com.github.arieltraver.shootingstar.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
