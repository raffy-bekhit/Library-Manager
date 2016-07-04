package Tables;


import javax.swing.CellEditor;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;

public class TabelModel2 extends AbstractTableModel  {

    private String[] columnNames;
    private Object[][] data;

    public TabelModel2(Object[][] data, String[] columnNames) {
        this.columnNames = columnNames;
        this.data = data;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
    if(col>2)
        return true;
    else return false;
    }

   
    @Override
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

}
