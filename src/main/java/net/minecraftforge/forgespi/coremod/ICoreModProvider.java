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
 */
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
