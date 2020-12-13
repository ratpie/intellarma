package com.github.ratpie.intellarma.services

import com.intellij.openapi.project.Project
import com.github.ratpie.intellarma.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
