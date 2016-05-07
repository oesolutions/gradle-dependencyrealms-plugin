package ca.chrisdore.gradle.plugins.dependencyrealms

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependencyRealmsPlugin implements Plugin<Project>
{
    @Override
    void apply( Project project )
    {
        project.logger.lifecycle 'applying plugin'
    }
}

