/**
 * Alisson de Sousa Vieira
 * Leonardo de Fontes
 */

import java.awt.event.*;

public class SairAction
    extends WindowAdapter
    implements ActionListener
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}