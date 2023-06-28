package net.minecraftforge.forgespi.language;

import net.minecraftforge.forgespi.locating.IModFile;
import org.apache.maven.artifact.versioning.ArtifactVersion;

/**
 * Represents a mod file that has a version in the jar.
 */
public interface IModFileWithJarVersion extends IModFile
{
    /**
     * Gets the version of the mod file.
     *
     * @return The version of the mod file.
     */
    ArtifactVersion getJarVersion();
}
