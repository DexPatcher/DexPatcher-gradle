/*
 * DexPatcher - Copyright 2015-2020 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * DexPatcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.dexpatcher.gradle.extensions

import groovy.transform.CompileStatic

import org.gradle.api.Project
import org.gradle.api.provider.Property

@CompileStatic
class PatchedAppExtension extends AbstractPatcherExtension {

    final Property<Boolean> multiDexThreadedForMultiDexDebugBuilds = project.objects.property(Boolean).value(true)
    final Property<Boolean> multiDexThreadedForAllDebugBuilds = project.objects.property(Boolean).value(false)

    PatchedAppExtension(Project project, DexpatcherConfigExtension dexpatcherConfig) {
        super(project, dexpatcherConfig)
    }

}
