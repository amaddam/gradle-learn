package com.self;

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPluginA implements Plugin<Project> {
    void apply(Project project) {
        project.task('CustomPlugin1Task1') {
            doLast {
                println 'CustomPlugin1Task1 is executed'
            }
        }
    }
}
