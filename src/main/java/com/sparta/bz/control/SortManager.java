package com.sparta.bz.control;

import com.sparta.bz.display.ConsoleDisplayManager;
import com.sparta.bz.sorters.Sorter;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SortManager {

    public final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    public Logger log = Logger.getLogger(SortManager.class.getName());

    public void initialiseLogging(){
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
    }

    private int[] arrayToSort = {4, 5, 6, 20, 64, 2};
    private ConsoleDisplayManager consoleDisplayManager = new ConsoleDisplayManager();

    public void runSorter() {
        initialiseLogging();
        try {
            Sorter sorter = SortFactory.getInstanced();
            int[] sortedArray = sorter.sortArray( arrayToSort );
            displayUnsortedArray();
            displaySortedArray(sortedArray, sorter.toString() );
        } catch (FactoryException e) {
            log.error(e.getMessage());
        }
    }

    private void displayUnsortedArray() {
        consoleDisplayManager.displayUnsortedArray( arrayToSort );
    }
    private void displaySortedArray ( int[] sortedArray, String sortType) {
        consoleDisplayManager.displaySortedArray( sortedArray, sortType );
    }
    private void displayExceptionMessage(String message){
        consoleDisplayManager.displayExceptionMessage(message);
        }
    }
