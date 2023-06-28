/*
 * Minecraft Forge
 * Copyright (c) 2016-2018.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.forgespi.language;

import net.minecraftforge.forgespi.locating.IModFile;
import org.apache.maven.artifact.versioning.VersionRange;

import java.util.List;
import java.util.Map;

/**
 * Represents the collected info on a mod file.
 */
public interface IModFileInfo extends IConfigurable
{
    /**
     * Returns the mods which can be found in the mod file.
     *
     * @return The information on the mods that can be found in the file.
     */
    List<IModInfo> getMods();

    /**
     * Defines the combination of required language and supported version range.
     * Used during loading to determine if the mod file is compatible with the current environment.
     *
     * @param languageName The name of the runtime language that is needed.
     * @param acceptedVersions The accepted version range.
     */
    record LanguageSpec(String languageName, VersionRange acceptedVersions) {}

    /**
     * Returns the languages that are required by the mod file.
     *
     * @return The required languages.
     */
    List<LanguageSpec> requiredLanguageLoaders();

    /**
     * Indicates if this mod file should be shown as a resource pack or not.
     *
     * @return {@code true} if the mod file should be shown as a resource pack, {@code false} otherwise.
     */
    boolean showAsResourcePack();

    /**
     * Returns the mod files own properties.
     *
     * @return The custom properties of the mod file.
     */
    Map<String,Object> getFileProperties();

    /**
     * The java module name of the file.
     * Note: This needs to adhere to the JVM specification.
     *
     * @return The module name.
     */
    String moduleName();

    /**
     * The version of this module as a string.
     *
     * @return The version of this module.
     */
    String versionString();

    /**
     * Indicates which services this mod file requires.
     *
     * @return The services that this mod file requires.
     */
    List<String> usesServices();

    /**
     * The underlying mod file.
     *
     * @return The mod file.
     */
    IModFile getFile();

    /**
     * The underlying configuration of this mod file info object.
     *
     * @return The configuration of this mod file info object.
     */
    IConfigurable getConfig();
}
