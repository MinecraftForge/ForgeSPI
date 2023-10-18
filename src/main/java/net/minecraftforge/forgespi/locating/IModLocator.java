/*
 * Copyright (c) Forge Development LLC and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.locating;

import java.util.List;

/**
 * Loaded as a ServiceLoader. Takes mechanisms for locating candidate "mods"
 * and transforms them into {@link IModFile} objects.
 */
public interface IModLocator extends IModProvider
{
    /**
     * A simple record which contains either a valid modfile or a reason one failed to be constructed by {@link #scanMods()}
     * @param file the file
     * @param ex an exception that occurred during the attempt to load the mod
     */
    record ModFileOrException(IModFile file, ModFileLoadingException ex) {}
    /**
     * Invoked to find all mods that this mod locator can find.
     * It is not guaranteed that all these are loaded into the runtime,
     * as such the result of this method should be seen as a list of candidates to load.
     *
     * @return All found, or discovered, mod files.
     */
    List<ModFileOrException> scanMods();
}
