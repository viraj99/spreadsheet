package com.vaadin.addon.spreadsheet.command;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;

public interface Command {
    public void execute();

    public int getActiveSheetIndex();

    public void setActiveSheetIndex(int index);

    /**
     * The selected cell that should be set when this command is run. In
     * case this command shouldn't change the selected cell,
     * <code>null</code> is returned.
     * 
     * @return the selection or <code>null</code>
     */
    public CellReference getSelectedCellReference();

    /**
     * The painted range that should be set when this command is run. In
     * case his command shouldn't set a painted range, <code>null</code> is
     * returned.
     * 
     * @return the painted range or <code>null</code>
     */
    public CellRangeAddress getPaintedCellRange();
}