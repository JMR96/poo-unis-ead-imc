
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double pes;
        double alt;
        double imc;
        int result;

        do {
            pes = Double.parseDouble(JOptionPane.showInputDialog("Entre com o seu Peso em Quilos(KG)"));
            alt = Double.parseDouble(JOptionPane.showInputDialog("Entre com a sua Altura em Centímetros(cm)"));

            result = JOptionPane.showConfirmDialog(null, "Peso: " + pes + " Kg" + "\n" + "Altura: " + alt + " cm" + "\n" + "\n" + "Os dados digitados estÃ£o Corretos? ");
           } 
        
        while (result != JOptionPane.YES_OPTION);

        imc = pes / ((alt * alt) * 100);

        if (imc <= 17) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + "Muito Abaixo Do Peso");
        } else if (imc > 17 && imc <= 18.5) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + "Abaixo Do Peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + "Peso Normal");
        } else if (imc > 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + "Acima Do Peso");
        } else if (imc > 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + "Obesidade I");
        } else if (imc > 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + "Obesidade II");
        } else {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + "Obesidade III");
        }

    }
}