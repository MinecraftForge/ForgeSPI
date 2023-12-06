/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.language;

import net.minecraftforge.forgespi.locating.IModFile;
import org.apache.maven.artifact.versioning.VersionRange;

import java.util.List;
import java.util.Map;

public interface IModFileInfo {
    List<IModInfo> getMods();

    record LanguageSpec(String languageName, VersionRange acceptedVersions) {}

    List<LanguageSpec> requiredLanguageLoaders();

    boolean showAsResourcePack();

    /**
     * Indicates if this mod file is only intended for physical clients.
     * <p>When true, the loader will skip loading this mod file on dedicated servers.</p>
     */
    default boolean isClientSideOnly() {
        return false;
    }

    Map<String,Object> getFileProperties();

    String getLicense();

    String moduleName();

    String versionString();

    List<String> usesServices();

    IModFile getFile();

    IConfigurable getConfig();
}
