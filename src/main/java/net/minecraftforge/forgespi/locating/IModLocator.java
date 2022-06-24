/*
 * Minecraft Forge
 * Copyright (c) 2016-2019.
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

package net.minecraftforge.forgespi.locating;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Loaded as a ServiceLoader. Takes mechanisms for locating candidate "mods"
 * and transforms them into {@link IModFile} objects.
 */
public interface IModLocator
{
    /**
     * The name of the provider.
     * Has to be unique between all providers loaded into the runtime.
     *
     * @return The name.
     */
    String name();

    /**
     * Invoked to scan a particular {@link IModFile} for metadata.
     *
     * @param modFile The mod file to scan.
     * @param pathConsumer A consumer which extracts metadata from the path given.
     */
    void scanFile(IModFile modFile, Consumer<Path> pathConsumer);

    /**
     * Invoked with the game startup arguments to allow for configuration of the provider.
     *
     * @param arguments The arguments.
     */
    void initArguments(Map<String, ?> arguments);

    /**
     * Indicates if the given mod file is valid.
     *
     * @param modFile The mod file in question.
     * @return True to mark as valid, false otherwise.
     */
    boolean isValid(IModFile modFile);

    /**
     * Invoked to find all mods that this mod locator can find.
     * It is not guaranteed that all these are loaded into the runtime,
     * as such the result of this method should be seen as a list of candidates to load.
     *
     * @return All found, or discovered, mod files.
     */
    default List<IModFile> scanMods() {
        return Collections.emptyList();
    }

    /**
     * Invoked to find all mod dependencies that this dependency locator can find.
     * It is not guaranteed that all these are loaded into the runtime,
     * as such the result of this method should be seen as a list of candidates to load.
     *
     * @return All found, or discovered, mod files which function as dependencies.
     */
    default List<IModFile> scanMods(final Iterable<IModFile> loadedMods) {
        return Collections.emptyList();
    };
}
