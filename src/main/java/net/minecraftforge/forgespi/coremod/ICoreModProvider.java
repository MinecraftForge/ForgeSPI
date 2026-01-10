/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.coremod;

import java.util.List;

import cpw.mods.modlauncher.api.ITransformer;

/**
 * Core Mod Provider - core mod logic is implemented
 * in a separate library. Connection is provided here
 *
 * @deprecated The JS coremod system was an experiment to force modders
 * to stop shipping both transformer and game layer code in the same jar.
 * JavaScript was chosen because it was included in Java itself and could
 * easily be decoupled from the game layer data.
 *
 * Java has stopped shipping JavaScript, and most Transformers are Mixin
 * these days, so it's no longer needed.
 *
 */
@Deprecated(forRemoval = true, since = "7.1.6")
public interface ICoreModProvider {
    /**
     * Add a coremod file to the list of coremods
     * @param file the file to add
     */
    void addCoreMod(ICoreModFile file);

    /**
     * Return the completed list of transformers for all coremods
     * @return all coremod transformers
     */
    List<ITransformer<?>> getCoreModTransformers();
}
