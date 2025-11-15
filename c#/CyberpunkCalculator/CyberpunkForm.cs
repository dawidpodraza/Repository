using System;
using System.Drawing;
using System.Windows.Forms;

namespace CyberpunkCalculator
{
    public class CyberpunkForm : Form
    {
        private TextBox display;
        private double firstNumber = 0;
        private string operatorSymbol = "";
        private bool startNewNumber = true;

        public CyberpunkForm()
        {
            // Ustawienia głównego okna
            this.Text = "Cyberpunk Calculator";
            this.BackColor = Color.FromArgb(10, 10, 10);
            this.Size = new Size(400, 550);
            this.StartPosition = FormStartPosition.CenterScreen;

            // Wyświetlacz
            display = new TextBox();
            display.Font = new Font("Consolas", 32, FontStyle.Bold);
            display.BackColor = Color.FromArgb(15, 15, 15);
            display.ForeColor = Color.FromArgb(57, 255, 20); // neon green
            display.TextAlign = HorizontalAlignment.Right;
            display.ReadOnly = true;
            display.Size = new Size(360, 80);
            display.Location = new Point(20, 20);
            display.BorderStyle = BorderStyle.FixedSingle;
            this.Controls.Add(display);

            // Tworzenie przycisków
            CreateButtons();
        }

        private void CreateButtons()
        {
            string[,] layout = {
                {"7","8","9","/"},
                {"4","5","6","*"},
                {"1","2","3","-"},
                {"0",".","=","+"},
                {"C","","",""}
            };

            int btnWidth = 80;
            int btnHeight = 80;
            int startX = 20;
            int startY = 120;
            int gap = 10;

            for (int i = 0; i < layout.GetLength(0); i++)
            {
                for (int j = 0; j < layout.GetLength(1); j++)
                {
                    string text = layout[i, j];
                    if (string.IsNullOrEmpty(text)) continue;

                    Button btn = new Button();
                    btn.Text = text;
                    btn.Font = new Font("Consolas", 20, FontStyle.Bold);
                    btn.Size = new Size(btnWidth, btnHeight);
                    btn.Location = new Point(startX + j * (btnWidth + gap), startY + i * (btnHeight + gap));
                    btn.FlatStyle = FlatStyle.Flat;
                    btn.FlatAppearance.BorderSize = 2;
                    btn.ForeColor = Color.White;

                    // Kolor przycisków
                    if ("0123456789.".Contains(text))
                        btn.BackColor = Color.FromArgb(17, 17, 17);
                    else if (text == "C")
                        btn.BackColor = Color.FromArgb(255, 0, 85);
                    else
                        btn.BackColor = Color.FromArgb(34, 0, 255);

                    // Neon Glow efekt na hover
                    btn.MouseEnter += (s, e) => btn.BackColor = ControlPaint.Light(btn.BackColor, 0.5f);
                    btn.MouseLeave += (s, e) =>
                    {
                        if ("0123456789.".Contains(text))
                            btn.BackColor = Color.FromArgb(17, 17, 17);
                        else if (text == "C")
                            btn.BackColor = Color.FromArgb(255, 0, 85);
                        else
                            btn.BackColor = Color.FromArgb(34, 0, 255);
                    };

                    btn.Click += (s, e) => ButtonClicked(text);

                    this.Controls.Add(btn);
                }
            }
        }

        private void ButtonClicked(string text)
        {
            switch (text)
            {
                case "C":
                    display.Clear();
                    firstNumber = 0;
                    operatorSymbol = "";
                    startNewNumber = true;
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    if (!string.IsNullOrEmpty(display.Text))
                    {
                        firstNumber = double.Parse(display.Text);
                        operatorSymbol = text;
                        startNewNumber = true;
                    }
                    break;
                case "=":
                    if (string.IsNullOrEmpty(operatorSymbol) || string.IsNullOrEmpty(display.Text)) return;
                    double secondNumber = double.Parse(display.Text);
                    double result = Calculate(firstNumber, secondNumber, operatorSymbol);
                    display.Text = result.ToString();
                    operatorSymbol = "";
                    startNewNumber = true;
                    break;
                default:
                    if (startNewNumber)
                    {
                        display.Clear();
                        startNewNumber = false;
                    }
                    if (text == "." && display.Text.Contains(".")) return;
                    display.AppendText(text);
                    break;
            }
        }

        private double Calculate(double num1, double num2, string op)
        {
            switch (op)
            {
                case "+": return num1 + num2;
                case "-": return num1 - num2;
                case "*": return num1 * num2;
                case "/": return num2 != 0 ? num1 / num2 : 0;
                default: return 0;
            }
        }


        
    }
}
