package com.github.feisher.myandroidstudiotemplate.services

import com.intellij.openapi.project.Project
import com.github.feisher.myandroidstudiotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
