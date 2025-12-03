import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//--------------- MAIN CLASS -----------------
public class Main {
    public static void main(String[] args) {
        new Login();   // Start login page
    }
}

//--------------- LOGIN PAGE -----------------
class Login extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField cardTextField;
    JPasswordField pinTextField;
    JButton loginBtn, clearBtn, signupBtn;

    // Fixed card & PIN
    final String FIXED_CARD = "1234567890123456";
    final String FIXED_PIN  = "1234";

    public Login() {
        setTitle("ATM Login");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240,248,255));

        JLabel head = new JLabel("ATM LOGIN");
        head.setFont(new Font("Arial", Font.BOLD, 22));
        head.setBounds(130, 20, 200, 40);
        add(head);

        JLabel cardLabel = new JLabel("Card Number:");
        cardLabel.setBounds(50, 80, 120, 25);
        add(cardLabel);

        cardTextField = new JTextField();
        cardTextField.setBounds(180, 80, 150, 25);
        add(cardTextField);

        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setBounds(50, 130, 120, 25);
        add(pinLabel);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(180, 130, 150, 25);
        add(pinTextField);

        loginBtn = new JButton("Sign In");
        loginBtn.setBounds(40, 190, 100, 30);
        loginBtn.setBackground(Color.GREEN);
        loginBtn.setForeground(Color.BLACK);
        loginBtn.addActionListener(this);
        add(loginBtn);

        signupBtn = new JButton("Sign Up");
        signupBtn.setBounds(150, 190, 100, 30);
        signupBtn.setBackground(Color.ORANGE);
        signupBtn.setForeground(Color.BLACK);
        signupBtn.addActionListener(this);
        add(signupBtn);

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(260, 190, 100, 30);
        clearBtn.setBackground(Color.RED);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.addActionListener(this);
        add(clearBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginBtn){
            String card = cardTextField.getText();
            String pin = new String(pinTextField.getPassword());

            if(!card.equals(FIXED_CARD) || !pin.equals(FIXED_PIN)){
                JOptionPane.showMessageDialog(this,"Card Number or PIN is incorrect!");
                return;
            }
            JOptionPane.showMessageDialog(this,"Login Successful!");
            new Dashboard();
            this.setVisible(false);
        }
        else if(e.getSource() == signupBtn){
            new SignupPage1();
            this.setVisible(false);
        }
        else if(e.getSource() == clearBtn){
            cardTextField.setText("");
            pinTextField.setText("");
        }
    }
}
