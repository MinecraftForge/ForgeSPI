/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.language;

public interface ILifecycleEvent<R extends ILifecycleEvent<?>> {
    @SuppressWarnings("unchecked")
    default R concrete() {
        return (R) this;
    }
}

