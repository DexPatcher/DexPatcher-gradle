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
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.provider.Property

@CompileStatic
abstract class AbstractPatcherExtension extends AbstractDecoderExtension {

    final Property<Boolean> importSymbols = project.objects.property(Boolean).value(true)
    final Property<Boolean> disableResourceValidation = project.objects.property(Boolean).value(false)
    final Property<Boolean> useAapt2BundledWithApktool = project.objects.property(Boolean).value(false)

    //final Property<Boolean> patchManifest = true      // TODO
    //final Property<Boolean> patchResources = true     // TODO
    //final Property<Boolean> patchCode = true          // TODO

    final ConfigurableFileCollection dexpatcherAnnotationClasspath = project.files()

    AbstractPatcherExtension(Project project, DexpatcherConfigExtension dexpatcherConfig) {
        super(project, dexpatcherConfig)
    }

}
