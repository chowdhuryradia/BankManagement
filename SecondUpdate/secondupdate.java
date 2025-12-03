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

//--------------- SIGNUP PAGE 1 -----------------
class SignupPage1 extends JFrame implements ActionListener {

    JButton nextBtn;

    public SignupPage1() {
        setTitle("SIGN UP - PAGE 1");
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(230,240,255));

        JLabel head = new JLabel("SIGN UP - PAGE 1");
        head.setFont(new Font("Arial",Font.BOLD,20));
        head.setBounds(150,30,250,40);
        add(head);

        JLabel name = new JLabel("Full Name:");
        name.setBounds(60,120,120,25);
        add(name);

        JTextField nameField = new JTextField();
        nameField.setBounds(220,120,180,25);
        add(nameField);

        JLabel email = new JLabel("Email:");
        email.setBounds(60,180,120,25);
        add(email);

        JTextField emailField = new JTextField();
        emailField.setBounds(220,180,180,25);
        add(emailField);

        nextBtn = new JButton("NEXT");
        nextBtn.setBounds(180,350,120,40);
        nextBtn.setBackground(new Color(0,120,215));
        nextBtn.setForeground(Color.WHITE);
        nextBtn.addActionListener(this);
        add(nextBtn);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        new SignupPage2();
        this.setVisible(false);
    }
}

//--------------- SIGNUP PAGE 2 -----------------
class SignupPage2 extends JFrame implements ActionListener {

    JButton nextBtn;

    public SignupPage2() {
        setTitle("SIGN UP - PAGE 2");
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255,245,230));

        JLabel head = new JLabel("SIGN UP - PAGE 2");
        head.setFont(new Font("Arial",Font.BOLD,20));
        head.setBounds(150,30,250,40);
        add(head);

        JLabel phone = new JLabel("Phone:");
        phone.setBounds(60,120,120,25);
        add(phone);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(220,120,180,25);
        add(phoneField);

        JLabel address = new JLabel("Address:");
        address.setBounds(60,180,120,25);
        add(address);

        JTextField addressField = new JTextField();
        addressField.setBounds(220,180,180,25);
        add(addressField);

        nextBtn = new JButton("NEXT");
        nextBtn.setBounds(180,350,120,40);
        nextBtn.setBackground(new Color(0,120,215));
        nextBtn.setForeground(Color.WHITE);
        nextBtn.addActionListener(this);
        add(nextBtn);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        new SignupPage3();
        this.setVisible(false);
    }
}

//--------------- SIGNUP PAGE 3 -----------------
class SignupPage3 extends JFrame implements ActionListener {

    JButton submitBtn;

    public SignupPage3() {
        setTitle("SIGN UP - PAGE 3");
        setSize(500,450);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240,255,240));

        JLabel head = new JLabel("SIGN UP - PAGE 3");
        head.setFont(new Font("Arial",Font.BOLD,20));
        head.setBounds(150,30,250,40);
        add(head);

        JLabel c = new JLabel("Card No: (Auto Generate)");
        c.setBounds(60,150,200,25);
        add(c);

        JLabel p = new JLabel("PIN: (Auto Generate)");
        p.setBounds(60,200,200,25);
        add(p);

        submitBtn = new JButton("SUBMIT");
        submitBtn.setBounds(180,300,120,45);
        submitBtn.setBackground(new Color(50,180,90));
        submitBtn.setForeground(Color.WHITE);
        submitBtn.addActionListener(this);
        add(submitBtn);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(this,"Signup Successful!\nCard Number and PIN generated.");
        new Login();
        this.setVisible(false);
    }
}
