package net.minecraftforge.forgespi.language;

import net.minecraftforge.forgespi.locating.IModFile;

import java.nio.file.Path;
import java.util.Optional;

/**
 * Represents a mod file which has an access transformer embedded in it.
 */
public interface IModFileWithAccessTransformer extends IModFile
{
    /**
     * Gets the access transformer file path for this mod file.
     * @return The access transformer file path for this mod file.
     */
    Optional<Path> getAccessTransformer();
}
