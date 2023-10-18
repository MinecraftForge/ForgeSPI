/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.locating;

/**
 * An exception that can be thrown/caught by {@link IModLocator} code, indicating a bad mod file or something similar.
 */
public class ModFileLoadingException extends RuntimeException {
    private static final long serialVersionUID = -661880511592415614L;

    public ModFileLoadingException(String message) {
        super(message);
    }
}
