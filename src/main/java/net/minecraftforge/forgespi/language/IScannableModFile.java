package net.minecraftforge.forgespi.language;

import net.minecraftforge.forgespi.locating.IModFile;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * Represents a mod file that can be scanned for annotation data.
 */
public interface IScannableModFile extends IModFile
{
    /**
     * Invoked to scan the mod file for annotation data.
     *
     * @param pathConsumer The path consumer which can scan a class file for annotation data.
     */
    void scanFile(Consumer<Path> pathConsumer);

    /**
     * Run in an executor thread to harvest the class and annotation list.
     */
    ModFileScanData compileContent();

    /**
     * Invoked to set the scan result which is potentially being computed off-thread.
     *
     * @param future The future to complete when the scan is complete.
     */
    void setFutureScanResult(CompletableFuture<ModFileScanData> future);

    /**
     * Invoked to set the scan result after it has been computed, and optionally an exception if the scan failed.
     *
     * @param modFileScanData The scan result.
     * @param throwable The exception if the scan failed.
     */
    void setScanResult(ModFileScanData modFileScanData, Throwable throwable);
}
