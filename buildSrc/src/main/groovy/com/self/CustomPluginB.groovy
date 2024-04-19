package com.self;

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPluginB implements Plugin<Project> {
    void apply(Project project) {
        project.task('CustomPlugin2Task2') {
            doLast {
                println 'CustomPlugin2Task2 is executed'
            }
        }

    }
}