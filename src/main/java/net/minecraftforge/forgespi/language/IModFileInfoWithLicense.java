package net.minecraftforge.forgespi.language;

/**
 * Represents mod files which have an included license.
 * Ensure that the forge license validation code can check for a valid license on mod files which support it.
 */
public interface IModFileInfoWithLicense extends IModFileInfo
{
    /**
     * Returns the license name of the mod file.
     *
     * @return The license name of the mod file.
     */
    String getLicense();

    /**
     * Indicates if the mod file has a license, or not.
     *
     * @return {@code true} if the mod file has a license, {@code false} otherwise.
     */
    boolean isMissingLicense();
}
