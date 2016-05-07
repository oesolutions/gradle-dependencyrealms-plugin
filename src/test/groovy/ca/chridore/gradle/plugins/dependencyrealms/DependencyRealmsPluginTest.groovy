package ca.chrisdore.gradle.plugins.dependencyrealms

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class DependencyRealmsPluginTest extends Specification
{
    Project project

    def setup()
    {
        project = ProjectBuilder.builder().build()
    }

    def 'can apply plugin'()
    {
        when:
        project.apply plugin: DependencyRealmsPlugin

        then:
        project.pluginManager.hasPlugin 'ca.chrisdore.dependencyrealms'
    }
}
