package com.github.lgouger.cyclespacing.services

import com.intellij.openapi.project.Project
import com.github.lgouger.cyclespacing.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
