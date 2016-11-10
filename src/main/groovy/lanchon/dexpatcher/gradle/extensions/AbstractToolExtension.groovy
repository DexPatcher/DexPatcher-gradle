package lanchon.dexpatcher.gradle.extensions

import groovy.transform.CompileStatic
import lanchon.dexpatcher.gradle.Resolver
import org.gradle.api.file.FileCollection

@CompileStatic
abstract class AbstractToolExtension {

    protected final DexpatcherConfigExtension dexpatcherConfig
    protected final String defaultSubdirName;

    def dir

    AbstractToolExtension(DexpatcherConfigExtension dexpatcherConfig, String defaultSubdirName) {
        this.dexpatcherConfig = dexpatcherConfig
        this.defaultSubdirName = defaultSubdirName
    }

    File getDir() { dexpatcherConfig.resolveClosures(dir) }
    File getResolvedDir() { dexpatcherConfig.getResolvedToolDir(getDir(), defaultSubdirName) }

    FileCollection getClasspath() { Resolver.getJars(dexpatcherConfig.project, getResolvedDir()) }

}
