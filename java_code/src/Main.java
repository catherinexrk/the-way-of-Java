import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmationPage extends JFrame {
    private JRadioButton option1;
    private JRadioButton option2;
    private JButton confirmButton;

    public ConfirmationPage() {
        setTitle("选择确认页面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3, 1));

        option1 = new JRadioButton("选项1");
        option2 = new JRadioButton("选项2");
        confirmButton = new JButton("确认");

        // 创建一个按钮组，确保只有一个单选按钮可以被选中
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);

        // 添加确认按钮的点击事件监听器
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (option1.isSelected()) {
                    JOptionPane.showMessageDialog(null, "您选择了选项1");
                } else if (option2.isSelected()) {
                    JOptionPane.showMessageDialog(null, "您选择了选项2");
                } else {
                    JOptionPane.showMessageDialog(null, "请选择一个选项");
                }
            }
        });

        // 将组件添加到窗口中
        add(option1);
        add(option2);
        add(confirmButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConfirmationPage();
            }
        });
    }
}