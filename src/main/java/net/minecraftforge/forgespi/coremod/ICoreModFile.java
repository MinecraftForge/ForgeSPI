/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.coremod;

import java.io.*;
import java.nio.file.*;

/**
 * Interface for core mods to discover content and properties
 * of their location and context to the coremod implementation.
 *
 * @deprecated The JS coremod system was an experiment to force modders
 * to stop shipping both transformer and game layer code in the same jar.
 * JavaScript was chosen because it was included in Java itself and could
 * easily be decoupled from the game layer data.
 *
 * Java has stopped shipping JavaScript, and most Transformers are Mixin
 * these days, so it's no longer needed.
 */
@Deprecated(forRemoval = true, since = "7.1.6")
public interface ICoreModFile {
    String getOwnerId();
    Reader readCoreMod() throws IOException;
    Path getPath();
    Reader getAdditionalFile(final String fileName) throws IOException;
}
