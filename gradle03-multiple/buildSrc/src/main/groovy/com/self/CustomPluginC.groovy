package com.self;

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPluginC implements Plugin<Project> {
    void apply(Project project) {
        project.task('CustomPlugin3Task3') {
            doLast {
                println 'CustomPlugin3Task3 is executed'
            }
        }

    }
}