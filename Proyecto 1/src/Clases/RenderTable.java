
package Clases;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.JButton;

public class RenderTable extends DefaultTableCellRenderer{

 @Override
    public Component getTableCellRendererComponent (JTable table, Object objeto_renderizable, boolean selected, boolean focused, int row, int column )
    {    
        if (objeto_renderizable instanceof JButton) {
            return (JButton)objeto_renderizable;
        }
        return super.getTableCellRendererComponent(table, objeto_renderizable, selected, focused, row, column);
    }
}
