package net.minecraftforge.forgespi.language;

import net.minecraftforge.forgespi.locating.IModFile;

import java.util.Map;

/**
 * Interface for mod files that have properties.
 * Allows for both the reading and the writing of the associated properties of the mod file.
 */
public interface IModFileWithProperties extends IModFile
{
    /**
     * The current properties of the mod file.
     * Note: Might be immutable.
     *
     * @return The properties of the mod file.
     */
    Map<String, Object> getFileProperties();

    /**
     * Sets the properties of the mod file.
     *
     * @param fileProperties The properties of the mod file.
     */
    void setFileProperties(Map<String, Object> fileProperties);
}
