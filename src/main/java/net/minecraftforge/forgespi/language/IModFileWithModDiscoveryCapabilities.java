package net.minecraftforge.forgespi.language;

/**
 * Represents a mod file that can be discovered by the mod discovery system.
 */
public interface IModFileWithModDiscoveryCapabilities extends IModFileWithCoreMods, IModFileWithAccessTransformer, IScannableModFile, IModFileWithProperties, IModFileWithJarVersion
{
    /**
     * Invoked by the discovery system to identify the mods that are located in this file and populate their metadata.
     * Note: this can be called from any thread.
     *
     * @return {@code true} when a mod was found, {@code false} otherwise.
     */
    boolean identifyMods();

    /**
     * Invoked by the discovery system to identify the runtime languages and flavors which are needed to potentially run mods in this file.
     * Note: this can be called from any thread.
     */
    void identifyLanguage();
}
