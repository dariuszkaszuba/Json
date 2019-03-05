package pl.sda.filemanager;

import java.nio.file.Path;
import java.util.List;

/**
 * Interface to add tag to the file and find files by tag
 */
public interface FileManager {

    /**
     * Tags a file with new tag
     *
     * @param tag  a new tag
     * @param path a pah to the file
     * @throws FileManagerException if filemanager failed
     */
    void addTag(String tag, Path path) throws FileManagerException;

    /**
     * Method to find file by tag
     *
     * @param tag tag to find files
     * @return a list of all files heaving given tag
     * @throws FileManagerException if filemanager failed
     */
    List<Path> findFilesByTag(String tag) throws FileManagerException;

}
