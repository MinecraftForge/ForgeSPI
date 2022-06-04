package net.minecraftforge.forgespi.language;

import net.minecraftforge.forgespi.coremod.ICoreModFile;
import net.minecraftforge.forgespi.locating.IModFile;

import java.util.List;

/**
 * Represents a mod file that has a list of core mods that are required to be loaded.
 */
public interface IModFileWithCoreMods extends IModFile
{

    /**
     * Gets the list of core mods that are required to be loaded.
     *
     * @return The list of core mods that are required to be loaded.
     */
    List<? extends ICoreModFile> getCoreMods();
}
