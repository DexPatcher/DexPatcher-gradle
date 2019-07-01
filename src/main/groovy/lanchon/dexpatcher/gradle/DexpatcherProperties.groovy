/*
 * DexPatcher - Copyright 2015-2019 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * DexPatcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.dexpatcher.gradle

import groovy.transform.CompileStatic

import org.gradle.api.Project

@CompileStatic
class DexpatcherProperties extends ParsedProperties {

    final boolean decorateDependencies

    DexpatcherProperties(Project project) {
        super(project)
        decorateDependencies = getBoolean('dexpatcher.decorateDependencies', true)
    }

}
