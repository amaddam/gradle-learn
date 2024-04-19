package com.self;

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPluginE implements Plugin<Project> {
    void apply(Project project) {
        project.task('CustomPlugin5Task5') {
            doLast {
                println 'CustomPlugin5Task5 is executed'
            }
        }

    }
}