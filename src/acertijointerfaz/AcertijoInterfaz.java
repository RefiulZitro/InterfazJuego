package acertijointerfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Luis Ferney Ortiz Perez
 */
public class AcertijoInterfaz extends JFrame implements ActionListener {

    private int numAyudas = 0;
    private String respuesta = "";
    private boolean verificarRespuesta = false, casilla1 = false, casilla2 = false, casilla3 = false, casilla4 = false, casilla5 = false,
            casilla6 = false, casilla7 = false, casilla8 = false, casilla9 = false, casilla10 = false,
            casilla11 = false, casilla12 = false, casilla13 = false, casilla14 = false, casilla15 = false,
            casilla16 = false, casilla17 = false, casilla18 = false, casilla19 = false, casilla20 = false,
            casilla21 = false, casilla22 = false, casilla23 = false, casilla24 = false, casilla25 = false;
    private JPanel panelPrincipal, panelEnunciado, panelPistas, panelJuego,
            panel1x1, panel1x2, panel1x3, panel1x4, panel1x5, panel2x1, panel2x2, panel2x3, panel2x4, panel2x5, panel3x1, panel3x2, panel3x3, panel3x4, panel3x5, panel4x1, panel4x2, panel4x3, panel4x4, panel4x5, panel5x1, panel5x2, panel5x3, panel5x4, panel5x5;
    private JScrollPane scrollEnunciado;
    private JTextArea enunciado;
    private JTextField respuestaText;
    private JButton verSiguientePista, finalizar, resetear;
    private JCheckBox p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15;
    private JLabel color, universidad, año, profesion, gustos,
            habitacion1, habitacion2, habitacion3, habitacion4, habitacion5,
            pista1, pista2, pista3, pista4, pista5, pista6, pista7, pista8, pista9, pista10, pista11, pista12, pista13, pista14, pista15,
            finalAyuda, finalAyuda2;
    private JComboBox<String> selectColor1, selectColor2, selectColor3, selectColor4, selectColor5,
            selectUniveridad1, selectUniveridad2, selectUniveridad3, selectUniveridad4, selectUniveridad5,
            selectAño1, selectAño2, selectAño3, selectAño4, selectAño5,
            slectProfesion1, slectProfesion2, slectProfesion3, slectProfesion4, slectProfesion5,
            selecGustos1, selecGustos2, selecGustos3, selecGustos4, selecGustos5;
    private JRadioButton colorAmarrillo1, colorAmarrillo2, colorAmarrillo3, colorAmarrillo4, colorAmarrillo5,
            colorAzul1, colorAzul2, colorAzul3, colorAzul4, colorAzul5,
            colorRojo1, colorRojo2, colorRojo3, colorRojo4, colorRojo5,
            colorVerde1, colorVerde2, colorVerde3, colorVerde4, colorVerde5,
            colorBlanco1, colorBlanco2, colorBlanco3, colorBlanco4, colorBlanco5,
            universidadAndes1, universidadUnal1, universidadJaveriana1, universidadPedagogica1, universidadMilitar1,
            universidadAndes2, universidadUnal2, universidadJaveriana2, universidadPedagogica2, universidadMilitar2,
            universidadAndes3, universidadUnal3, universidadJaveriana3, universidadPedagogica3, universidadMilitar3,
            universidadAndes4, universidadUnal4, universidadJaveriana4, universidadPedagogica4, universidadMilitar4,
            universidadAndes5, universidadUnal5, universidadJaveriana5, universidadPedagogica5, universidadMilitar5,
            año2019_1, año2020_1, año2021_1, año2022_1, año2023_1,
            año2019_2, año2020_2, año2021_2, año2022_2, año2023_2,
            año2019_3, año2020_3, año2021_3, año2022_3, año2023_3,
            año2019_4, año2020_4, año2021_4, año2022_4, año2023_4,
            año2019_5, año2020_5, año2021_5, año2022_5, año2023_5,
            ingeniero1, profesor1, diseñador1, medico1, arquitecto1,
            ingeniero2, profesor2, diseñador2, medico2, arquitecto2,
            ingeniero3, profesor3, diseñador3, medico3, arquitecto3,
            ingeniero4, profesor4, diseñador4, medico4, arquitecto4,
            ingeniero5, profesor5, diseñador5, medico5, arquitecto5,
            bailar1, dormir1, restaurante1, cine1, conciertos1,
            bailar2, dormir2, restaurante2, cine2, conciertos2,
            bailar3, dormir3, restaurante3, cine3, conciertos3,
            bailar4, dormir4, restaurante4, cine4, conciertos4,
            bailar5, dormir5, restaurante5, cine5, conciertos5;

    //Constructor
    public AcertijoInterfaz() {

        setDefaultCloseOperation(3);
        setSize(1400, 700);
        setLocationRelativeTo(null);
        setTitle("En que habitacion vive el que inicio a estudiar en el 2019?									");
        setLayout(null);

        componentesVentana();
        panelEnunciado();
        panelCheckPistas();
        panelJuego();
    }

    private void componentesVentana() {

        panelPrincipal = new JPanel();
        panelEnunciado = new JPanel();
        panelPistas = new JPanel();
        panelJuego = new JPanel();

        panelPrincipal.setBounds(0, 0, 1400, 700);
        panelEnunciado.setBounds(0, 0, 400, 300);
        panelPistas.setBounds(0, 300, 400, 400);
        panelJuego.setBounds(400, 0, 1000, 600);

        Color colorRGB1 = new Color(14, 19, 49);
        Color colorRGB2 = new Color(120, 40, 140);
        Color colorRGB3 = new Color(240, 192, 255);
        Color colorRGB4 = new Color(119, 158, 203);

        panelPrincipal.setBackground(colorRGB1);
        panelEnunciado.setBackground(colorRGB2);

        panelPistas.setBackground(Color.BLACK);

        panelJuego.setBackground(colorRGB1);

        panelPrincipal.setLayout(null);
        panelEnunciado.setLayout(null);
        panelPistas.setLayout(null);
        panelJuego.setLayout(null);

        verSiguientePista = new JButton("Ayudaaa");
        finalizar = new JButton("Verificar Respuesta");
        resetear = new JButton("Resetear Juego");

        verSiguientePista.setBounds(420, 610, 150, 40);
        finalizar.setBounds(620, 610, 150, 40);
        resetear.setBounds(1200, 610, 150, 40);

        verSiguientePista.setBackground(colorRGB2);
        finalizar.setBackground(colorRGB2);
        resetear.setBackground(colorRGB2);

        respuestaText = new JTextField("Escribe tu respuesta");
        respuestaText.setBounds(820, 610, 300, 40);

        verSiguientePista.addActionListener(this);
        finalizar.addActionListener(this);
        resetear.addActionListener(this);
        respuestaText.addActionListener(this);

        add(panelPrincipal);
        panelPrincipal.add(panelEnunciado);
        panelPrincipal.add(panelPistas);
        panelPrincipal.add(panelJuego);
        panelPrincipal.add(verSiguientePista);
        panelPrincipal.add(finalizar);
        panelPrincipal.add(resetear);
        panelPrincipal.add(respuestaText);

    }

    private void panelEnunciado() {

        enunciado = new JTextArea();
        enunciado.setSelectedTextColor(Color.RED);
        enunciado.setFont(new Font("Montserrat", Font.ITALIC, 16));
        enunciado.setBackground(Color.BLACK);
        enunciado.setForeground(Color.WHITE);
        String texto = "Enunciado:\n"
                + "En un Apartamento hay 5 Habitaciones con puertas de diferentes colores.\n"
                + "En cada habitacion vive una persona de diferente Universidad.\n"
                + "Cada quien Inicio a estudiar en un Año diferente, tiene Profesion y Gustos diferentes.\n"
                + "Pista 1: El de la Javeriana vive en la habitacion de puerta  Roja.\n"
                + "Pista 2: El de la UPedagogica inicio a estudiar en el año 2021.\n"
                + "Pista 3: El de la UAndes le gusta ir a Conciertos.\n"
                + "Pista 4: El de la Unal vive en la primera Habitacion.\n"
                + "Pista 5: El de la UMilitar es Ingeniero.\n"
                + "Pista 6: El de la habitacion con puerta Verde le gusta ir al Restaurante y vive a la izquierda de la habitacion de puerta Blanca.\n"
                + "Pista 7: El de la habitacion con puerta Verde va a Restaurantes.\n"
                + "Pista 8: El que es Profesor inicio a estudiar en el 2023.\n"
                + "Pista 9: El de la habitacion con puerta Amarilla es Diseñador.\n"
                + "Pista 10: El que vive en la habitacion del centro le gusta el Cine.\n"
                + "Pista 11: EL que es Medico vive al lado del que inicio a estudiar en el 2020.\n"
                + "Pista 12: El que inicio a estudiar en el 2022 vive al lado del que es Diseñador.\n"
                + "Pista 13: EL que es Arquitecto le gusta Dormir.\n"
                + "Pista 14: El que es Medico es vecino del que le gusta Bailar.\n"
                + "Pista 15: El de la Unal vive al lado del de la habitacion con puerta azul.\n"
                + ".................................................................................................\n"
                + "Pregunta:\n"
                + "¿En que habitacion vive el que inicio a estudiar en el 2019?\n"
                + "...................................................................................................\n"
                + "Instruciones:\n"
                + "-Dale Check a las pistas que consideres ya resueltas, esto te servira solo de ayuda visual\n"
                + "-Si no estas seguro de una opcion, marca las opciones multiples de cada casillas,esto te servira solo de ayuda visual\n"
                + "-Si estas 100% seguro de la respuesta para una determinada casilla, seleciona una de las respuestas del menu\n"
                + "-Si no puedes avanzar mas, oprime el boton de AYUDAAA para una pista sugeridad a resolver\n"
                + "-Si ya has selecionado todas las casillas necesarias para saber la respuesta, oprime el boton RESPUESTA, recuerda escribir la respuesta en el campo asignado\n"
                + "-El boton RESETEAR deja el panel de juego de forma inicial\n"
                + "¡¡¡A JUGAR!!!\n";
        enunciado.setText(texto);
        enunciado.setEditable(false);

        scrollEnunciado = new JScrollPane(enunciado);
        scrollEnunciado.setBounds(0, 0, 400, 300);
        scrollEnunciado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollEnunciado.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelEnunciado.add(scrollEnunciado);

    }

    private void panelCheckPistas() {

        p1 = new JCheckBox();
        p2 = new JCheckBox();
        p3 = new JCheckBox();
        p4 = new JCheckBox();
        p5 = new JCheckBox();
        p6 = new JCheckBox();
        p7 = new JCheckBox();
        p8 = new JCheckBox();
        p9 = new JCheckBox();
        p10 = new JCheckBox();
        p11 = new JCheckBox();
        p12 = new JCheckBox();
        p13 = new JCheckBox();
        p14 = new JCheckBox();
        p15 = new JCheckBox();

        pista1 = new JLabel("Pista 1:");
        pista2 = new JLabel("Pista 2:");
        pista3 = new JLabel("Pista 3:");
        pista4 = new JLabel("Pista 4:");
        pista5 = new JLabel("Pista 5:");
        pista6 = new JLabel("Pista 6:");
        pista7 = new JLabel("Pista 7:");
        pista8 = new JLabel("Pista 8:");
        pista9 = new JLabel("Pista 9:");
        pista10 = new JLabel("Pista 10:");
        pista11 = new JLabel("Pista 11:");
        pista12 = new JLabel("Pista 12:");
        pista13 = new JLabel("Pista 13:");
        pista14 = new JLabel("Pista 14:");
        pista15 = new JLabel("Pista 15:");

        pista1.setBounds(30, 10, 50, 60);
        pista2.setBounds(30, 80, 50, 60);
        pista3.setBounds(30, 150, 50, 60);
        pista4.setBounds(30, 220, 50, 60);
        pista5.setBounds(30, 290, 50, 60);

        Color colorRGB3 = new Color(240, 192, 255);

        pista1.setForeground(colorRGB3);
        pista2.setForeground(colorRGB3);
        pista3.setForeground(colorRGB3);
        pista4.setForeground(colorRGB3);
        pista5.setForeground(colorRGB3);

        p1.setBounds(90, 30, 18, 18);
        p2.setBounds(90, 100, 18, 18);
        p3.setBounds(90, 170, 18, 18);
        p4.setBounds(90, 240, 18, 18);
        p5.setBounds(90, 310, 18, 18);

        pista6.setBounds(155, 10, 50, 60);
        pista7.setBounds(155, 80, 50, 60);
        pista8.setBounds(155, 150, 50, 60);
        pista9.setBounds(155, 220, 50, 60);
        pista10.setBounds(155, 290, 50, 60);

        pista6.setForeground(colorRGB3);
        pista7.setForeground(colorRGB3);
        pista8.setForeground(colorRGB3);
        pista9.setForeground(colorRGB3);
        pista10.setForeground(colorRGB3);

        p6.setBounds(215, 30, 18, 18);
        p7.setBounds(215, 100, 18, 18);
        p8.setBounds(215, 170, 18, 18);
        p9.setBounds(215, 240, 18, 18);
        p10.setBounds(215, 310, 18, 18);

        pista11.setBounds(275, 10, 50, 60);
        pista12.setBounds(275, 80, 50, 60);
        pista13.setBounds(275, 150, 50, 60);
        pista14.setBounds(275, 220, 50, 60);
        pista15.setBounds(275, 290, 50, 60);

        pista11.setForeground(colorRGB3);
        pista12.setForeground(colorRGB3);
        pista13.setForeground(colorRGB3);
        pista14.setForeground(colorRGB3);
        pista15.setForeground(colorRGB3);

        p11.setBounds(335, 30, 18, 18);
        p12.setBounds(335, 100, 18, 18);
        p13.setBounds(335, 170, 18, 18);
        p14.setBounds(335, 240, 18, 18);
        p15.setBounds(335, 310, 18, 18);

        panelPistas.add(pista1);
        panelPistas.add(pista2);
        panelPistas.add(pista3);
        panelPistas.add(pista4);
        panelPistas.add(pista5);
        panelPistas.add(pista6);
        panelPistas.add(pista7);
        panelPistas.add(pista8);
        panelPistas.add(pista9);
        panelPistas.add(pista10);
        panelPistas.add(pista11);
        panelPistas.add(pista12);
        panelPistas.add(pista13);
        panelPistas.add(pista14);
        panelPistas.add(pista15);

        panelPistas.add(p1);
        panelPistas.add(p2);
        panelPistas.add(p3);
        panelPistas.add(p4);
        panelPistas.add(p5);
        panelPistas.add(p6);
        panelPistas.add(p7);
        panelPistas.add(p8);
        panelPistas.add(p9);
        panelPistas.add(p10);
        panelPistas.add(p11);
        panelPistas.add(p12);
        panelPistas.add(p13);
        panelPistas.add(p14);
        panelPistas.add(p15);

    }

    private void panelJuego() {

        panel1x1 = new JPanel();
        panel1x2 = new JPanel();
        panel1x3 = new JPanel();
        panel1x4 = new JPanel();
        panel1x5 = new JPanel();
        panel2x1 = new JPanel();
        panel2x2 = new JPanel();
        panel2x3 = new JPanel();
        panel2x4 = new JPanel();
        panel2x5 = new JPanel();
        panel3x1 = new JPanel();
        panel3x2 = new JPanel();
        panel3x3 = new JPanel();
        panel3x4 = new JPanel();
        panel3x5 = new JPanel();
        panel4x1 = new JPanel();
        panel4x2 = new JPanel();
        panel4x3 = new JPanel();
        panel4x4 = new JPanel();
        panel4x5 = new JPanel();
        panel5x1 = new JPanel();
        panel5x2 = new JPanel();
        panel5x3 = new JPanel();
        panel5x4 = new JPanel();
        panel5x5 = new JPanel();

        panel1x1.setLayout(null);
        panel1x2.setLayout(null);
        panel1x3.setLayout(null);
        panel1x4.setLayout(null);
        panel1x5.setLayout(null);
        panel2x1.setLayout(null);
        panel2x2.setLayout(null);
        panel2x3.setLayout(null);
        panel2x4.setLayout(null);
        panel2x5.setLayout(null);
        panel3x1.setLayout(null);
        panel3x2.setLayout(null);
        panel3x3.setLayout(null);
        panel3x4.setLayout(null);
        panel3x5.setLayout(null);
        panel4x1.setLayout(null);
        panel4x2.setLayout(null);
        panel4x3.setLayout(null);
        panel4x4.setLayout(null);
        panel4x5.setLayout(null);
        panel5x1.setLayout(null);
        panel5x2.setLayout(null);
        panel5x3.setLayout(null);
        panel5x4.setLayout(null);
        panel5x5.setLayout(null);

        panel1x1.setBounds(110, 60, 173, 103);
        panel1x2.setBounds(288, 60, 173, 103);
        panel1x3.setBounds(466, 60, 173, 103);
        panel1x4.setBounds(644, 60, 173, 103);
        panel1x5.setBounds(822, 60, 173, 103);

        panel2x1.setBounds(110, 168, 173, 103);
        panel2x2.setBounds(288, 168, 173, 103);
        panel2x3.setBounds(466, 168, 173, 103);
        panel2x4.setBounds(644, 168, 173, 103);
        panel2x5.setBounds(822, 168, 173, 103);

        panel3x1.setBounds(110, 276, 173, 103);
        panel3x2.setBounds(288, 276, 173, 103);
        panel3x3.setBounds(466, 276, 173, 103);
        panel3x4.setBounds(644, 276, 173, 103);
        panel3x5.setBounds(822, 276, 173, 103);

        panel4x1.setBounds(110, 384, 173, 103);
        panel4x2.setBounds(288, 384, 173, 103);
        panel4x3.setBounds(466, 384, 173, 103);
        panel4x4.setBounds(644, 384, 173, 103);
        panel4x5.setBounds(822, 384, 173, 103);

        panel5x1.setBounds(110, 492, 173, 103);
        panel5x2.setBounds(288, 492, 173, 103);
        panel5x3.setBounds(466, 492, 173, 103);
        panel5x4.setBounds(644, 492, 173, 103);
        panel5x5.setBounds(822, 492, 173, 103);

        Color colorRGB3 = new Color(240, 192, 255);

        panel1x1.setBackground(colorRGB3);
        panel1x2.setBackground(colorRGB3);
        panel1x3.setBackground(colorRGB3);
        panel1x4.setBackground(colorRGB3);
        panel1x5.setBackground(colorRGB3);
        panel2x1.setBackground(colorRGB3);
        panel2x2.setBackground(colorRGB3);
        panel2x3.setBackground(colorRGB3);
        panel2x4.setBackground(colorRGB3);
        panel2x5.setBackground(colorRGB3);
        panel3x1.setBackground(colorRGB3);
        panel3x2.setBackground(colorRGB3);
        panel3x3.setBackground(colorRGB3);
        panel3x4.setBackground(colorRGB3);
        panel3x5.setBackground(colorRGB3);
        panel4x1.setBackground(colorRGB3);
        panel4x2.setBackground(colorRGB3);
        panel4x3.setBackground(colorRGB3);
        panel4x4.setBackground(colorRGB3);
        panel4x5.setBackground(colorRGB3);
        panel5x1.setBackground(colorRGB3);
        panel5x2.setBackground(colorRGB3);
        panel5x3.setBackground(colorRGB3);
        panel5x4.setBackground(colorRGB3);
        panel5x5.setBackground(colorRGB3);

        color = new JLabel("COLOR:");
        color.setForeground(colorRGB3);
        universidad = new JLabel("UNIVERSIDAD:");
        universidad.setForeground(colorRGB3);
        año = new JLabel("AÑO:");
        año.setForeground(colorRGB3);
        profesion = new JLabel("PROFESION:");
        profesion.setForeground(colorRGB3);
        gustos = new JLabel("GUSTOS:");
        gustos.setForeground(colorRGB3);

        habitacion1 = new JLabel("HABITACION #1");
        habitacion1.setForeground(colorRGB3);
        habitacion2 = new JLabel("HABITACION #2");
        habitacion2.setForeground(colorRGB3);
        habitacion3 = new JLabel("HABITACION #3");
        habitacion3.setForeground(colorRGB3);
        habitacion4 = new JLabel("HABITACION #4");
        habitacion4.setForeground(colorRGB3);
        habitacion5 = new JLabel("HABITACION #5");
        habitacion5.setForeground(colorRGB3);

        color.setBounds(15, 86, 100, 50);
        universidad.setBounds(15, 193, 100, 50);
        año.setBounds(15, 300, 100, 50);
        profesion.setBounds(15, 407, 100, 50);
        gustos.setBounds(15, 514, 100, 50);

        habitacion1.setBounds(146, 5, 100, 50);
        habitacion2.setBounds(323, 5, 100, 50);
        habitacion3.setBounds(500, 5, 100, 50);
        habitacion4.setBounds(677, 5, 100, 50);
        habitacion5.setBounds(854, 5, 100, 50);

        panelJuego.add(panel1x1);
        panelJuego.add(panel1x2);
        panelJuego.add(panel1x3);
        panelJuego.add(panel1x4);
        panelJuego.add(panel1x5);

        panelJuego.add(panel2x1);
        panelJuego.add(panel2x2);
        panelJuego.add(panel2x3);
        panelJuego.add(panel2x4);
        panelJuego.add(panel2x5);

        panelJuego.add(panel3x1);
        panelJuego.add(panel3x2);
        panelJuego.add(panel3x3);
        panelJuego.add(panel3x4);
        panelJuego.add(panel3x5);

        panelJuego.add(panel4x1);
        panelJuego.add(panel4x2);
        panelJuego.add(panel4x3);
        panelJuego.add(panel4x4);
        panelJuego.add(panel4x5);

        panelJuego.add(panel5x1);
        panelJuego.add(panel5x2);
        panelJuego.add(panel5x3);
        panelJuego.add(panel5x4);
        panelJuego.add(panel5x5);

        panelJuego.add(color);
        panelJuego.add(universidad);
        panelJuego.add(año);
        panelJuego.add(profesion);
        panelJuego.add(gustos);
        panelJuego.add(habitacion1);
        panelJuego.add(habitacion2);
        panelJuego.add(habitacion3);
        panelJuego.add(habitacion4);
        panelJuego.add(habitacion5);

        subPanelJuegoMultiples();
        subPanelJuegoSelecion();

    }

    private void subPanelJuegoMultiples() {

        colorAmarrillo1 = new JRadioButton("Amarillo");
        colorAmarrillo1.setBounds(0, 5, 70, 10);
        colorAmarrillo2 = new JRadioButton("Amarillo");
        colorAmarrillo2.setBounds(0, 5, 70, 10);
        colorAmarrillo3 = new JRadioButton("Amarillo");
        colorAmarrillo3.setBounds(0, 5, 70, 10);
        colorAmarrillo4 = new JRadioButton("Amarillo");
        colorAmarrillo4.setBounds(0, 5, 70, 10);
        colorAmarrillo5 = new JRadioButton("Amarillo");
        colorAmarrillo5.setBounds(0, 5, 70, 10);

        colorAzul1 = new JRadioButton("Azul");
        colorAzul1.setBounds(0, 20, 70, 10);
        colorAzul2 = new JRadioButton("Azul");
        colorAzul2.setBounds(0, 20, 70, 10);
        colorAzul3 = new JRadioButton("Azul");
        colorAzul3.setBounds(0, 20, 70, 10);
        colorAzul4 = new JRadioButton("Azul");
        colorAzul4.setBounds(0, 20, 70, 10);
        colorAzul5 = new JRadioButton("Azul");
        colorAzul5.setBounds(0, 20, 70, 10);

        colorRojo1 = new JRadioButton("Rojo");
        colorRojo1.setBounds(0, 35, 70, 10);
        colorRojo2 = new JRadioButton("Rojo");
        colorRojo2.setBounds(0, 35, 70, 10);
        colorRojo3 = new JRadioButton("Rojo");
        colorRojo3.setBounds(0, 35, 70, 10);
        colorRojo4 = new JRadioButton("Rojo");
        colorRojo4.setBounds(0, 35, 70, 10);
        colorRojo5 = new JRadioButton("Rojo");
        colorRojo5.setBounds(0, 35, 70, 10);

        colorVerde1 = new JRadioButton("Verde");
        colorVerde1.setBounds(0, 50, 70, 10);
        colorVerde2 = new JRadioButton("Verde");
        colorVerde2.setBounds(0, 50, 70, 10);
        colorVerde3 = new JRadioButton("Verde");
        colorVerde3.setBounds(0, 50, 70, 10);
        colorVerde4 = new JRadioButton("Verde");
        colorVerde4.setBounds(0, 50, 70, 10);
        colorVerde5 = new JRadioButton("Verde");
        colorVerde5.setBounds(0, 50, 70, 10);

        colorBlanco1 = new JRadioButton("Blanco");
        colorBlanco1.setBounds(0, 65, 70, 10);
        colorBlanco2 = new JRadioButton("Blanco");
        colorBlanco2.setBounds(0, 65, 70, 10);
        colorBlanco3 = new JRadioButton("Blanco");
        colorBlanco3.setBounds(0, 65, 70, 10);
        colorBlanco4 = new JRadioButton("Blanco");
        colorBlanco4.setBounds(0, 65, 70, 10);
        colorBlanco5 = new JRadioButton("Blanco");
        colorBlanco5.setBounds(0, 65, 70, 10);

        panel1x1.add(colorAmarrillo1);
        panel1x2.add(colorAmarrillo2);
        panel1x3.add(colorAmarrillo3);
        panel1x4.add(colorAmarrillo4);
        panel1x5.add(colorAmarrillo5);
        panel1x1.add(colorAzul1);
        panel1x2.add(colorAzul2);
        panel1x3.add(colorAzul3);
        panel1x4.add(colorAzul4);
        panel1x5.add(colorAzul5);
        panel1x1.add(colorRojo1);
        panel1x2.add(colorRojo2);
        panel1x3.add(colorRojo3);
        panel1x4.add(colorRojo4);
        panel1x5.add(colorRojo5);
        panel1x1.add(colorVerde1);
        panel1x2.add(colorVerde2);
        panel1x3.add(colorVerde3);
        panel1x4.add(colorVerde4);
        panel1x5.add(colorVerde5);
        panel1x1.add(colorBlanco1);
        panel1x2.add(colorBlanco2);
        panel1x3.add(colorBlanco3);
        panel1x4.add(colorBlanco4);
        panel1x5.add(colorBlanco5);

        //-------------------------------------------------------
        universidadAndes1 = new JRadioButton("Andes");
        universidadAndes1.setBounds(0, 5, 70, 10);
        universidadAndes2 = new JRadioButton("Andes");
        universidadAndes2.setBounds(0, 5, 70, 10);
        universidadAndes3 = new JRadioButton("Andes");
        universidadAndes3.setBounds(0, 5, 70, 10);
        universidadAndes4 = new JRadioButton("Andes");
        universidadAndes4.setBounds(0, 5, 70, 10);
        universidadAndes5 = new JRadioButton("Andes");
        universidadAndes5.setBounds(0, 5, 70, 10);

        universidadJaveriana1 = new JRadioButton("Javeriana");
        universidadJaveriana1.setBounds(0, 20, 70, 10);
        universidadJaveriana2 = new JRadioButton("Javeriana");
        universidadJaveriana2.setBounds(0, 20, 70, 10);
        universidadJaveriana3 = new JRadioButton("Javeriana");
        universidadJaveriana3.setBounds(0, 20, 70, 10);
        universidadJaveriana4 = new JRadioButton("Javeriana");
        universidadJaveriana4.setBounds(0, 20, 70, 10);
        universidadJaveriana5 = new JRadioButton("Javeriana");
        universidadJaveriana5.setBounds(0, 20, 70, 10);

        universidadMilitar1 = new JRadioButton("Militar");
        universidadMilitar1.setBounds(0, 35, 70, 10);
        universidadMilitar2 = new JRadioButton("Militar");
        universidadMilitar2.setBounds(0, 35, 70, 10);
        universidadMilitar3 = new JRadioButton("Militar");
        universidadMilitar3.setBounds(0, 35, 70, 10);
        universidadMilitar4 = new JRadioButton("Militar");
        universidadMilitar4.setBounds(0, 35, 70, 10);
        universidadMilitar5 = new JRadioButton("Militar");
        universidadMilitar5.setBounds(0, 35, 70, 10);

        universidadPedagogica1 = new JRadioButton("Pedagogica");
        universidadPedagogica1.setBounds(0, 50, 70, 10);
        universidadPedagogica2 = new JRadioButton("Pedagogica");
        universidadPedagogica2.setBounds(0, 50, 70, 10);
        universidadPedagogica3 = new JRadioButton("Pedagogica");
        universidadPedagogica3.setBounds(0, 50, 70, 10);
        universidadPedagogica4 = new JRadioButton("Pedagogica");
        universidadPedagogica4.setBounds(0, 50, 70, 10);
        universidadPedagogica5 = new JRadioButton("Pedagogica");
        universidadPedagogica5.setBounds(0, 50, 70, 10);

        universidadUnal1 = new JRadioButton("Unal");
        universidadUnal1.setBounds(0, 65, 70, 10);
        universidadUnal2 = new JRadioButton("Unal");
        universidadUnal2.setBounds(0, 65, 70, 10);
        universidadUnal3 = new JRadioButton("Unal");
        universidadUnal3.setBounds(0, 65, 70, 10);
        universidadUnal4 = new JRadioButton("Unal");
        universidadUnal4.setBounds(0, 65, 70, 10);
        universidadUnal5 = new JRadioButton("Unal");
        universidadUnal5.setBounds(0, 65, 70, 10);

        panel2x1.add(universidadAndes1);
        panel2x2.add(universidadAndes2);
        panel2x3.add(universidadAndes3);
        panel2x4.add(universidadAndes4);
        panel2x5.add(universidadAndes5);
        panel2x1.add(universidadJaveriana1);
        panel2x2.add(universidadJaveriana2);
        panel2x3.add(universidadJaveriana3);
        panel2x4.add(universidadJaveriana4);
        panel2x5.add(universidadJaveriana5);
        panel2x1.add(universidadMilitar1);
        panel2x2.add(universidadMilitar2);
        panel2x3.add(universidadMilitar3);
        panel2x4.add(universidadMilitar4);
        panel2x5.add(universidadMilitar5);
        panel2x1.add(universidadPedagogica1);
        panel2x2.add(universidadPedagogica2);
        panel2x3.add(universidadPedagogica3);
        panel2x4.add(universidadPedagogica4);
        panel2x5.add(universidadPedagogica5);
        panel2x1.add(universidadUnal1);
        panel2x2.add(universidadUnal2);
        panel2x3.add(universidadUnal3);
        panel2x4.add(universidadUnal4);
        panel2x5.add(universidadUnal5);
        //----------------------------------------------------------------
        //-------------------------------------------------------------------

        año2019_1 = new JRadioButton("2019");
        año2019_1.setBounds(0, 5, 70, 10);
        año2019_2 = new JRadioButton("2019");
        año2019_2.setBounds(0, 5, 70, 10);
        año2019_3 = new JRadioButton("2019");
        año2019_3.setBounds(0, 5, 70, 10);
        año2019_4 = new JRadioButton("2019");
        año2019_4.setBounds(0, 5, 70, 10);
        año2019_5 = new JRadioButton("2019");
        año2019_5.setBounds(0, 5, 70, 10);

        año2020_1 = new JRadioButton("2020");
        año2020_1.setBounds(0, 20, 70, 10);
        año2020_2 = new JRadioButton("2020");
        año2020_2.setBounds(0, 20, 70, 10);
        año2020_3 = new JRadioButton("2020");
        año2020_3.setBounds(0, 20, 70, 10);
        año2020_4 = new JRadioButton("2020");
        año2020_4.setBounds(0, 20, 70, 10);
        año2020_5 = new JRadioButton("2020");
        año2020_5.setBounds(0, 20, 70, 10);

        año2021_1 = new JRadioButton("2021");
        año2021_1.setBounds(0, 35, 70, 10);
        año2021_2 = new JRadioButton("2021");
        año2021_2.setBounds(0, 35, 70, 10);
        año2021_3 = new JRadioButton("2021");
        año2021_3.setBounds(0, 35, 70, 10);
        año2021_4 = new JRadioButton("2021");
        año2021_4.setBounds(0, 35, 70, 10);
        año2021_5 = new JRadioButton("2021");
        año2021_5.setBounds(0, 35, 70, 10);

        año2022_1 = new JRadioButton("2022");
        año2022_1.setBounds(0, 50, 70, 10);
        año2022_2 = new JRadioButton("2022");
        año2022_2.setBounds(0, 50, 70, 10);
        año2022_3 = new JRadioButton("2022");
        año2022_3.setBounds(0, 50, 70, 10);
        año2022_4 = new JRadioButton("2022");
        año2022_4.setBounds(0, 50, 70, 10);
        año2022_5 = new JRadioButton("2022");
        año2022_5.setBounds(0, 50, 70, 10);

        año2023_1 = new JRadioButton("2023");
        año2023_1.setBounds(0, 65, 70, 10);
        año2023_2 = new JRadioButton("2023");
        año2023_2.setBounds(0, 65, 70, 10);
        año2023_3 = new JRadioButton("2023");
        año2023_3.setBounds(0, 65, 70, 10);
        año2023_4 = new JRadioButton("2023");
        año2023_4.setBounds(0, 65, 70, 10);
        año2023_5 = new JRadioButton("2023");
        año2023_5.setBounds(0, 65, 70, 10);

        panel3x1.add(año2019_1);
        panel3x2.add(año2019_2);
        panel3x3.add(año2019_3);
        panel3x4.add(año2019_4);
        panel3x5.add(año2019_5);
        panel3x1.add(año2020_1);
        panel3x2.add(año2020_2);
        panel3x3.add(año2020_3);
        panel3x4.add(año2020_4);
        panel3x5.add(año2020_5);
        panel3x1.add(año2021_1);
        panel3x2.add(año2021_2);
        panel3x3.add(año2021_3);
        panel3x4.add(año2021_4);
        panel3x5.add(año2021_5);
        panel3x1.add(año2022_1);
        panel3x2.add(año2022_2);
        panel3x3.add(año2022_3);
        panel3x4.add(año2022_4);
        panel3x5.add(año2022_5);
        panel3x1.add(año2023_1);
        panel3x2.add(año2023_2);
        panel3x3.add(año2023_3);
        panel3x4.add(año2023_4);
        panel3x5.add(año2023_5);

        //-------------------------------------------------------
        ingeniero1 = new JRadioButton("Ingeniero");
        ingeniero1.setBounds(0, 5, 70, 10);
        ingeniero2 = new JRadioButton("Ingeniero");
        ingeniero2.setBounds(0, 5, 70, 10);
        ingeniero3 = new JRadioButton("Ingeniero");
        ingeniero3.setBounds(0, 5, 70, 10);
        ingeniero4 = new JRadioButton("Ingeniero");
        ingeniero4.setBounds(0, 5, 70, 10);
        ingeniero5 = new JRadioButton("Ingeniero");
        ingeniero5.setBounds(0, 5, 70, 10);

        profesor1 = new JRadioButton("Profesor");
        profesor1.setBounds(0, 20, 70, 10);
        profesor2 = new JRadioButton("Profesor");
        profesor2.setBounds(0, 20, 70, 10);
        profesor3 = new JRadioButton("Profesor");
        profesor3.setBounds(0, 20, 70, 10);
        profesor4 = new JRadioButton("Profesor");
        profesor4.setBounds(0, 20, 70, 10);
        profesor5 = new JRadioButton("Profesor");
        profesor5.setBounds(0, 20, 70, 10);

        diseñador1 = new JRadioButton("Diseñador");
        diseñador1.setBounds(0, 35, 70, 10);
        diseñador2 = new JRadioButton("Diseñador");
        diseñador2.setBounds(0, 35, 70, 10);
        diseñador3 = new JRadioButton("Diseñador");
        diseñador3.setBounds(0, 35, 70, 10);
        diseñador4 = new JRadioButton("Diseñador");
        diseñador4.setBounds(0, 35, 70, 10);
        diseñador5 = new JRadioButton("Diseñador");
        diseñador5.setBounds(0, 35, 70, 10);

        medico1 = new JRadioButton("Medico");
        medico1.setBounds(0, 50, 70, 10);
        medico2 = new JRadioButton("Medico");
        medico2.setBounds(0, 50, 70, 10);
        medico3 = new JRadioButton("Medico");
        medico3.setBounds(0, 50, 70, 10);
        medico4 = new JRadioButton("Medico");
        medico4.setBounds(0, 50, 70, 10);
        medico5 = new JRadioButton("Medico");
        medico5.setBounds(0, 50, 70, 10);

        arquitecto1 = new JRadioButton("Arquitecto");
        arquitecto1.setBounds(0, 65, 70, 10);
        arquitecto2 = new JRadioButton("Arquitecto");
        arquitecto2.setBounds(0, 65, 70, 10);
        arquitecto3 = new JRadioButton("Arquitecto");
        arquitecto3.setBounds(0, 65, 70, 10);
        arquitecto4 = new JRadioButton("Arquitecto");
        arquitecto4.setBounds(0, 65, 70, 10);
        arquitecto5 = new JRadioButton("Arquitecto");
        arquitecto5.setBounds(0, 65, 70, 10);

        panel4x1.add(ingeniero1);
        panel4x2.add(ingeniero2);
        panel4x3.add(ingeniero3);
        panel4x4.add(ingeniero4);
        panel4x5.add(ingeniero5);
        panel4x1.add(profesor1);
        panel4x2.add(profesor2);
        panel4x3.add(profesor3);
        panel4x4.add(profesor4);
        panel4x5.add(profesor5);
        panel4x1.add(diseñador1);
        panel4x2.add(diseñador2);
        panel4x3.add(diseñador3);
        panel4x4.add(diseñador4);
        panel4x5.add(diseñador5);
        panel4x1.add(medico1);
        panel4x2.add(medico2);
        panel4x3.add(medico3);
        panel4x4.add(medico4);
        panel4x5.add(medico5);
        panel4x1.add(arquitecto1);
        panel4x2.add(arquitecto2);
        panel4x3.add(arquitecto3);
        panel4x4.add(arquitecto4);
        panel4x5.add(arquitecto5);
        //---------------------------------------------------------------

        bailar1 = new JRadioButton("Bailar");
        bailar1.setBounds(0, 5, 70, 10);
        bailar2 = new JRadioButton("Bailar");
        bailar2.setBounds(0, 5, 70, 10);
        bailar3 = new JRadioButton("Bailar");
        bailar3.setBounds(0, 5, 70, 10);
        bailar4 = new JRadioButton("Bailar");
        bailar4.setBounds(0, 5, 70, 10);
        bailar5 = new JRadioButton("Bailar");
        bailar5.setBounds(0, 5, 70, 10);

        dormir1 = new JRadioButton("Dormir");
        dormir1.setBounds(0, 20, 70, 10);
        dormir2 = new JRadioButton("Dormir");
        dormir2.setBounds(0, 20, 70, 10);
        dormir3 = new JRadioButton("Dormir");
        dormir3.setBounds(0, 20, 70, 10);
        dormir4 = new JRadioButton("Dormir");
        dormir4.setBounds(0, 20, 70, 10);
        dormir5 = new JRadioButton("Dormir");
        dormir5.setBounds(0, 20, 70, 10);

        restaurante1 = new JRadioButton("Restaurante");
        restaurante1.setBounds(0, 35, 70, 10);
        restaurante2 = new JRadioButton("Restaurante");
        restaurante2.setBounds(0, 35, 70, 10);
        restaurante3 = new JRadioButton("Restaurante");
        restaurante3.setBounds(0, 35, 70, 10);
        restaurante4 = new JRadioButton("Restaurante");
        restaurante4.setBounds(0, 35, 70, 10);
        restaurante5 = new JRadioButton("Restaurante");
        restaurante5.setBounds(0, 35, 70, 10);

        cine1 = new JRadioButton("Cine");
        cine1.setBounds(0, 50, 70, 10);
        cine2 = new JRadioButton("Cine");
        cine2.setBounds(0, 50, 70, 10);
        cine3 = new JRadioButton("Cine");
        cine3.setBounds(0, 50, 70, 10);
        cine4 = new JRadioButton("Cine");
        cine4.setBounds(0, 50, 70, 10);
        cine5 = new JRadioButton("Cine");
        cine5.setBounds(0, 50, 70, 10);

        conciertos1 = new JRadioButton("Conciertos");
        conciertos1.setBounds(0, 65, 70, 10);
        conciertos2 = new JRadioButton("Conciertos");
        conciertos2.setBounds(0, 65, 70, 10);
        conciertos3 = new JRadioButton("Conciertos");
        conciertos3.setBounds(0, 65, 70, 10);
        conciertos4 = new JRadioButton("Conciertos");
        conciertos4.setBounds(0, 65, 70, 10);
        conciertos5 = new JRadioButton("Conciertos");
        conciertos5.setBounds(0, 65, 70, 10);

        panel5x1.add(bailar1);
        panel5x2.add(bailar2);
        panel5x3.add(bailar3);
        panel5x4.add(bailar4);
        panel5x5.add(bailar5);
        panel5x1.add(dormir1);
        panel5x2.add(dormir2);
        panel5x3.add(dormir3);
        panel5x4.add(dormir4);
        panel5x5.add(dormir5);
        panel5x1.add(restaurante1);
        panel5x2.add(restaurante2);
        panel5x3.add(restaurante3);
        panel5x4.add(restaurante4);
        panel5x5.add(restaurante5);
        panel5x1.add(cine1);
        panel5x2.add(cine2);
        panel5x3.add(cine3);
        panel5x4.add(cine4);
        panel5x5.add(cine5);
        panel5x1.add(conciertos1);
        panel5x2.add(conciertos2);
        panel5x3.add(conciertos3);
        panel5x4.add(conciertos4);
        panel5x5.add(conciertos5);
        //---------------------------------------------------------------
    }

    private void subPanelJuegoSelecion() {

        selectColor1 = new JComboBox<>();
        selectColor1.setBounds(90, 30, 75, 30);
        selectColor1.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Azul", "Amarillo", "Rojo", "Verde", "Blanco"}));
        selectColor1.addActionListener(this);

        selectColor2 = new JComboBox<>();
        selectColor2.setBounds(90, 30, 75, 30);
        selectColor2.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Azul", "Amarillo", "Rojo", "Verde", "Blanco"}));
        selectColor2.addActionListener(this);

        selectColor3 = new JComboBox<>();
        selectColor3.setBounds(90, 30, 75, 30);
        selectColor3.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Azul", "Amarillo", "Rojo", "Verde", "Blanco"}));
        selectColor3.addActionListener(this);

        selectColor4 = new JComboBox<>();
        selectColor4.setBounds(90, 30, 75, 30);
        selectColor4.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Azul", "Amarillo", "Rojo", "Verde", "Blanco"}));
        selectColor4.addActionListener(this);

        selectColor5 = new JComboBox<>();
        selectColor5.setBounds(90, 30, 75, 30);
        selectColor5.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Azul", "Amarillo", "Rojo", "Verde", "Blanco"}));
        selectColor5.addActionListener(this);

        panel1x1.add(selectColor1);
        panel1x2.add(selectColor2);
        panel1x3.add(selectColor3);
        panel1x4.add(selectColor4);
        panel1x5.add(selectColor5);

        //---------------------------------------------------------------------------------------------
        selectUniveridad1 = new JComboBox<>();
        selectUniveridad1.setBounds(90, 30, 75, 30);
        selectUniveridad1.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Andes", "Javeriana", "Militar", "Pedagogica", "Unal"}));
        selectUniveridad1.addActionListener(this);

        selectUniveridad2 = new JComboBox<>();
        selectUniveridad2.setBounds(90, 30, 75, 30);
        selectUniveridad2.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Andes", "Javeriana", "Militar", "Pedagogica", "Unal"}));
        selectUniveridad2.addActionListener(this);

        selectUniveridad3 = new JComboBox<>();
        selectUniveridad3.setBounds(90, 30, 75, 30);
        selectUniveridad3.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Andes", "Javeriana", "Militar", "Pedagogica", "Unal"}));
        selectUniveridad3.addActionListener(this);

        selectUniveridad4 = new JComboBox<>();
        selectUniveridad4.setBounds(90, 30, 75, 30);
        selectUniveridad4.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Andes", "Javeriana", "Militar", "Pedagogica", "Unal"}));
        selectUniveridad4.addActionListener(this);

        selectUniveridad5 = new JComboBox<>();
        selectUniveridad5.setBounds(90, 30, 75, 30);
        selectUniveridad5.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Andes", "Javeriana", "Militar", "Pedagogica", "Unal"}));
        selectUniveridad5.addActionListener(this);

        panel2x1.add(selectUniveridad1);
        panel2x2.add(selectUniveridad2);
        panel2x3.add(selectUniveridad3);
        panel2x4.add(selectUniveridad4);
        panel2x5.add(selectUniveridad5);

        //-----------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------
        selectAño1 = new JComboBox<>();
        selectAño1.setBounds(90, 30, 75, 30);
        selectAño1.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "2019", "2020", "2021", "2022", "2023"}));
        selectAño1.addActionListener(this);

        selectAño2 = new JComboBox<>();
        selectAño2.setBounds(90, 30, 75, 30);
        selectAño2.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "2019", "2020", "2021", "2022", "2023"}));
        selectAño2.addActionListener(this);

        selectAño3 = new JComboBox<>();
        selectAño3.setBounds(90, 30, 75, 30);
        selectAño3.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "2019", "2020", "2021", "2022", "2023"}));
        selectAño3.addActionListener(this);

        selectAño4 = new JComboBox<>();
        selectAño4.setBounds(90, 30, 75, 30);
        selectAño4.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "2019", "2020", "2021", "2022", "2023"}));
        selectAño4.addActionListener(this);

        selectAño5 = new JComboBox<>();
        selectAño5.setBounds(90, 30, 75, 30);
        selectAño5.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "2019", "2020", "2021", "2022", "2023"}));
        selectAño5.addActionListener(this);

        panel3x1.add(selectAño1);
        panel3x2.add(selectAño2);
        panel3x3.add(selectAño3);
        panel3x4.add(selectAño4);
        panel3x5.add(selectAño5);

        //---------------------------------------------------------------------------------------------
        slectProfesion1 = new JComboBox<>();
        slectProfesion1.setBounds(90, 30, 75, 30);
        slectProfesion1.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Ingeniero", "Profesor", "Diseñador", "Medico", "Arquitecto"}));
        slectProfesion1.addActionListener(this);

        slectProfesion2 = new JComboBox<>();
        slectProfesion2.setBounds(90, 30, 75, 30);
        slectProfesion2.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Ingeniero", "Profesor", "Diseñador", "Medico", "Arquitecto"}));
        slectProfesion2.addActionListener(this);

        slectProfesion3 = new JComboBox<>();
        slectProfesion3.setBounds(90, 30, 75, 30);
        slectProfesion3.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Ingeniero", "Profesor", "Diseñador", "Medico", "Arquitecto"}));
        slectProfesion3.addActionListener(this);

        slectProfesion4 = new JComboBox<>();
        slectProfesion4.setBounds(90, 30, 75, 30);
        slectProfesion4.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Ingeniero", "Profesor", "Diseñador", "Medico", "Arquitecto"}));
        slectProfesion4.addActionListener(this);

        slectProfesion5 = new JComboBox<>();
        slectProfesion5.setBounds(90, 30, 75, 30);
        slectProfesion5.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Ingeniero", "Profesor", "Diseñador", "Medico", "Arquitecto"}));
        slectProfesion5.addActionListener(this);

        panel4x1.add(slectProfesion1);
        panel4x2.add(slectProfesion2);
        panel4x3.add(slectProfesion3);
        panel4x4.add(slectProfesion4);
        panel4x5.add(slectProfesion5);

        //---------------------------------------------------------------------------------------------
        selecGustos1 = new JComboBox<>();
        selecGustos1.setBounds(90, 30, 75, 30);
        selecGustos1.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Bailar", "Dormir", "Restaurante", "Cine", "Conciertos"}));
        selecGustos1.addActionListener(this);

        selecGustos2 = new JComboBox<>();
        selecGustos2.setBounds(90, 30, 75, 30);
        selecGustos2.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Bailar", "Dormir", "Restaurante", "Cine", "Conciertos"}));
        selecGustos2.addActionListener(this);

        selecGustos3 = new JComboBox<>();
        selecGustos3.setBounds(90, 30, 75, 30);
        selecGustos3.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Bailar", "Dormir", "Restaurante", "Cine", "Conciertos"}));
        selecGustos3.addActionListener(this);

        selecGustos4 = new JComboBox<>();
        selecGustos4.setBounds(90, 30, 75, 30);
        selecGustos4.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Bailar", "Dormir", "Restaurante", "Cine", "Conciertos"}));
        selecGustos4.addActionListener(this);

        selecGustos5 = new JComboBox<>();
        selecGustos5.setBounds(90, 30, 75, 30);
        selecGustos5.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione", "Bailar", "Dormir", "Restaurante", "Cine", "Conciertos"}));
        selecGustos5.addActionListener(this);

        panel5x1.add(selecGustos1);
        panel5x2.add(selecGustos2);
        panel5x3.add(selecGustos3);
        panel5x4.add(selecGustos4);
        panel5x5.add(selecGustos5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String cadena = "";
        JLabel reemplazo = new JLabel();
        reemplazo.setFont(new Font("Serif", Font.ITALIC, 20));
        reemplazo.setBounds(10, 10, 150, 80);

        if (e.getSource() == selectColor1) {

            cadena = (String) selectColor1.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel1x1.removeAll();
                panel1x1.add(reemplazo);
                panel1x1.revalidate();
                panel1x1.repaint();
                if (cadena == "Amarillo") {
                    casilla1 = true;
                }
            }

        }
        if (e.getSource() == selectColor2) {

            cadena = (String) selectColor2.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel1x2.removeAll();
                panel1x2.add(reemplazo);
                panel1x2.revalidate();
                panel1x2.repaint();
                if (cadena == "Azul") {
                    casilla2 = true;
                }
            }

        }
        if (e.getSource() == selectColor3) {

            cadena = (String) selectColor3.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel1x3.removeAll();
                panel1x3.add(reemplazo);
                panel1x3.revalidate();
                panel1x3.repaint();
                if (cadena == "Rojo") {
                    casilla3 = true;
                }
            }

        }
        if (e.getSource() == selectColor4) {

            cadena = (String) selectColor4.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel1x4.removeAll();
                panel1x4.add(reemplazo);
                panel1x4.revalidate();
                panel1x4.repaint();
                if (cadena == "Verde") {
                    casilla4 = true;
                }
            }

        }
        if (e.getSource() == selectColor5) {

            cadena = (String) selectColor5.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel1x5.removeAll();
                panel1x5.add(reemplazo);
                panel1x5.revalidate();
                panel1x5.repaint();
                if (cadena == "Blanco") {
                    casilla5 = true;
                }
            }

        }
        if (e.getSource() == selectUniveridad1) {

            cadena = (String) selectUniveridad1.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel2x1.removeAll();
                panel2x1.add(reemplazo);
                panel2x1.revalidate();
                panel2x1.repaint();
                if (cadena == "Unal") {
                    casilla6 = true;
                }
            }

        }
        if (e.getSource() == selectUniveridad2) {

            cadena = (String) selectUniveridad2.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel2x2.removeAll();
                panel2x2.add(reemplazo);
                panel2x2.revalidate();
                panel2x2.repaint();
                if (cadena == "Andes") {
                    casilla7 = true;
                }
            }

        }
        if (e.getSource() == selectUniveridad3) {

            cadena = (String) selectUniveridad3.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel2x3.removeAll();
                panel2x3.add(reemplazo);
                panel2x3.revalidate();
                panel2x3.repaint();
                if (cadena == "Javeriana") {
                    casilla8 = true;
                }
            }

        }
        if (e.getSource() == selectUniveridad4) {

            cadena = (String) selectUniveridad4.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel2x4.removeAll();
                panel2x4.add(reemplazo);
                panel2x4.revalidate();
                panel2x4.repaint();
                if (cadena == "Militar") {
                    casilla9 = true;
                }
            }

        }
        if (e.getSource() == selectUniveridad5) {

            cadena = (String) selectUniveridad5.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel2x5.removeAll();
                panel2x5.add(reemplazo);
                panel2x5.revalidate();
                panel2x5.repaint();
                if (cadena == "Pedagogica") {
                    casilla10 = true;
                }
            }

        }
        if (e.getSource() == selectAño1) {

            cadena = (String) selectAño1.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel3x1.removeAll();
                panel3x1.add(reemplazo);
                panel3x1.revalidate();
                panel3x1.repaint();
                if (cadena == "2020") {
                    casilla11 = true;
                }
            }

        }
        if (e.getSource() == selectAño2) {

            cadena = (String) selectAño2.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel3x2.removeAll();
                panel3x2.add(reemplazo);
                panel3x2.revalidate();
                panel3x2.repaint();
                if (cadena == "2022") {
                    casilla12 = true;
                }
            }

        }
        if (e.getSource() == selectAño3) {

            cadena = (String) selectAño3.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel3x3.removeAll();
                panel3x3.add(reemplazo);
                panel3x3.revalidate();
                panel3x3.repaint();
                if (cadena == "2023") {
                    casilla13 = true;
                }
            }

        }
        if (e.getSource() == selectAño4) {

            cadena = (String) selectAño4.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel3x4.removeAll();
                panel3x4.add(reemplazo);
                panel3x4.revalidate();
                panel3x4.repaint();
                if (cadena == "2019") {
                    casilla14 = true;
                }
            }

        }
        if (e.getSource() == selectAño5) {

            cadena = (String) selectAño5.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel3x5.removeAll();
                panel3x5.add(reemplazo);
                panel3x5.revalidate();
                panel3x5.repaint();
                if (cadena == "2021") {
                    casilla15 = true;
                }
            }

        }
        if (e.getSource() == slectProfesion1) {

            cadena = (String) slectProfesion1.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel4x1.removeAll();
                panel4x1.add(reemplazo);
                panel4x1.revalidate();
                panel4x1.repaint();
                if (cadena == "Diseñador") {
                    casilla16 = true;
                }
            }

        }
        if (e.getSource() == slectProfesion2) {

            cadena = (String) slectProfesion2.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel4x2.removeAll();
                panel4x2.add(reemplazo);
                panel4x2.revalidate();
                panel4x2.repaint();
                if (cadena == "Medico") {
                    casilla17 = true;
                }
            }

        }
        if (e.getSource() == slectProfesion3) {

            cadena = (String) slectProfesion3.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel4x3.removeAll();
                panel4x3.add(reemplazo);
                panel4x3.revalidate();
                panel4x3.repaint();
                if (cadena == "Profesor") {
                    casilla18 = true;
                }
            }

        }
        if (e.getSource() == slectProfesion4) {

            cadena = (String) slectProfesion4.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel4x4.removeAll();
                panel4x4.add(reemplazo);
                panel4x4.revalidate();
                panel4x4.repaint();
                if (cadena == "Ingeniero") {
                    casilla19 = true;
                }
            }

        }
        if (e.getSource() == slectProfesion5) {

            cadena = (String) slectProfesion5.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel4x5.removeAll();
                panel4x5.add(reemplazo);
                panel4x5.revalidate();
                panel4x5.repaint();
                if (cadena == "Arquitecto") {
                    casilla20 = true;
                }
            }

        }
        if (e.getSource() == selecGustos1) {

            cadena = (String) selecGustos1.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel5x1.removeAll();
                panel5x1.add(reemplazo);
                panel5x1.revalidate();
                panel5x1.repaint();
                if (cadena == "Bailar") {
                    casilla21 = true;
                }
            }

        }
        if (e.getSource() == selecGustos2) {

            cadena = (String) selecGustos2.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel5x2.removeAll();
                panel5x2.add(reemplazo);
                panel5x2.revalidate();
                panel5x2.repaint();
                if (cadena == "Conciertos") {
                    casilla22 = true;
                }
            }

        }
        if (e.getSource() == selecGustos3) {

            cadena = (String) selecGustos3.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel5x3.removeAll();
                panel5x3.add(reemplazo);
                panel5x3.revalidate();
                panel5x3.repaint();
                if (cadena == "Cine") {
                    casilla23 = true;
                }
            }

        }
        if (e.getSource() == selecGustos4) {

            cadena = (String) selecGustos4.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel5x4.removeAll();
                panel5x4.add(reemplazo);
                panel5x4.revalidate();
                panel5x4.repaint();
                if (cadena == "Restaurante") {
                    casilla24 = true;
                }
            }

        }
        if (e.getSource() == selecGustos5) {

            cadena = (String) selecGustos5.getSelectedItem();
            if (cadena != "Selecione") {
                reemplazo.setText(cadena);
                panel5x5.removeAll();
                panel5x5.add(reemplazo);
                panel5x5.revalidate();
                panel5x5.repaint();
                if (cadena == "Dormir") {
                    casilla25 = true;
                }
            }

        }

        if (e.getSource() == resetear) {

            panel1x1.removeAll();
            panel1x2.removeAll();
            panel1x3.removeAll();
            panel1x4.removeAll();
            panel1x5.removeAll();
            panel2x1.removeAll();
            panel2x2.removeAll();
            panel2x3.removeAll();
            panel2x4.removeAll();
            panel2x5.removeAll();
            panel3x1.removeAll();
            panel3x2.removeAll();
            panel3x3.removeAll();
            panel3x4.removeAll();
            panel3x5.removeAll();
            panel4x1.removeAll();
            panel4x2.removeAll();
            panel4x3.removeAll();
            panel4x4.removeAll();
            panel4x5.removeAll();
            panel5x1.removeAll();
            panel5x2.removeAll();
            panel5x3.removeAll();
            panel5x4.removeAll();
            panel5x5.removeAll();

            subPanelJuegoMultiples();
            subPanelJuegoSelecion();

            panel1x1.revalidate();
            panel1x2.revalidate();
            panel1x3.revalidate();
            panel1x4.revalidate();
            panel1x5.revalidate();
            panel2x1.revalidate();
            panel2x2.revalidate();
            panel2x3.revalidate();
            panel2x4.revalidate();
            panel2x5.revalidate();
            panel3x1.revalidate();
            panel3x2.revalidate();
            panel3x3.revalidate();
            panel3x4.revalidate();
            panel3x5.revalidate();
            panel4x1.revalidate();
            panel4x2.revalidate();
            panel4x3.revalidate();
            panel4x4.revalidate();
            panel4x5.revalidate();
            panel5x1.revalidate();
            panel5x2.revalidate();
            panel5x3.revalidate();
            panel5x4.revalidate();
            panel5x5.revalidate();

            panel1x1.repaint();
            panel1x2.repaint();
            panel1x3.repaint();
            panel1x4.repaint();
            panel1x5.repaint();
            panel2x1.repaint();
            panel2x2.repaint();
            panel2x3.repaint();
            panel2x4.repaint();
            panel2x5.repaint();
            panel3x1.repaint();
            panel3x2.repaint();
            panel3x3.repaint();
            panel3x4.repaint();
            panel3x5.repaint();
            panel4x1.repaint();
            panel4x2.repaint();
            panel4x3.repaint();
            panel4x4.repaint();
            panel4x5.repaint();
            panel5x1.repaint();
            panel5x2.repaint();
            panel5x3.repaint();
            panel5x4.repaint();
            panel5x5.repaint();

        }
        if (e.getSource() == verSiguientePista) {
            numAyudas += 1;
            String mensaje = "Intenta con la Pista #4";

            if (casilla6 == true) {
                mensaje = "Intenta con la Pista #10";
                if (casilla23 == true) {
                    mensaje = "Intenta con la Pista #15";
                    if (casilla2 == true) {
                        mensaje = "Intenta con la Pista #6";
                        if (casilla4 == true && casilla5 == true && casilla24 == true) {
                            mensaje = "Intenta con la Pista #7";
                            if (casilla1 == true && casilla2 == true) {
                                mensaje = "Intenta con la Pista #1";
                                if (casilla3 == true && casilla1 == true) {
                                    mensaje = "Intenta con la Pista #9";
                                    if (casilla16 == true) {
                                        mensaje = "Intenta con la Pista #12";
                                        if (casilla12 == true) {
                                            mensaje = "Intenta con la Pista #2, 3 y 13";
                                            if (casilla21 == true) {
                                                mensaje = "Intenta con la Pista #14";
                                                if (casilla17 == true && casilla20 == true && casilla25 == true && casilla6 == true && casilla22 == true) {
                                                    mensaje = "Intenta con la Pista #5";
                                                    if (casilla19 == true && casilla10 == true && casilla15 == true) {
                                                        mensaje = "Intenta con la Pista #8";
                                                        if (casilla18 == true && casilla13 == true) {
                                                            mensaje = "Intenta con la Pista #11";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            JOptionPane.showInputDialog(mensaje + ": y has usado " + numAyudas + " Ayudas");

            if (numAyudas >= 5) {

                panelPrincipal.removeAll();

                finalAyuda = new JLabel();
                finalAyuda.setBounds(500, 25, 400, 500);
                panelPrincipal.add(finalAyuda);

                finalAyuda2 = new JLabel("SI QUIERES VE A JUGAR CON OTRA COSA, YO RESUELVO ESTO, PERO NO TE DIRE LA RESPUESTA");
                finalAyuda2.setFont(new Font("Serif", Font.ITALIC, 20));
                Color colorRGB3 = new Color(240, 192, 255);
                finalAyuda2.setForeground(colorRGB3);
                finalAyuda2.setBounds(250, 550, 900, 80);
                panelPrincipal.add(finalAyuda2);

                ImageIcon memetodo = new ImageIcon("src/imagen/MemeTodo.jpg");
                Icon icono = new ImageIcon(memetodo.getImage().getScaledInstance(finalAyuda.getWidth(), finalAyuda.getHeight(), Image.SCALE_DEFAULT));
                finalAyuda.setIcon(icono);

                panelPrincipal.revalidate();
                panelPrincipal.repaint();
                this.repaint();

            }

        }
        if (e.getSource() == respuestaText) {
            respuesta = respuestaText.getText();
            JOptionPane.showInputDialog("Has escrito:  " + respuesta + "  como posible respuesta");
            if ("4".equals(respuesta)) {
                verificarRespuesta = true;
            }

        }

        if (e.getSource() == finalizar) {

            if (respuesta == "") {

                JOptionPane.showInputDialog("No has ingresado una respuesta en el campo de texto");

            } else {
                if (casilla6 == true && casilla23 == true && casilla2 == true && casilla4 == true && casilla5 == true
                        && casilla24 == true && casilla1 == true && casilla2 == true && casilla3 == true && casilla1 == true
                        && casilla16 == true && casilla12 == true && casilla21 == true && casilla17 == true && casilla20 == true
                        && casilla25 == true && casilla6 == true && casilla22 == true && casilla19 == true && casilla10 == true
                        && casilla15 == true && casilla18 == true && casilla13 == true) {

                    if (verificarRespuesta) {

                        panelPrincipal.removeAll();

                        finalAyuda = new JLabel();
                        finalAyuda.setBounds(500, 25, 400, 500);
                        panelPrincipal.add(finalAyuda);

                        finalAyuda2 = new JLabel("¡¡¡¡¡¡¡¡¡¡BIEN HECHO!!!!!!!!");
                        finalAyuda2.setFont(new Font("Serif", Font.ITALIC, 40));
                        Color colorRGB3 = new Color(240, 192, 255);
                        finalAyuda2.setForeground(colorRGB3);
                        finalAyuda2.setBounds(450, 550, 500, 80);
                        panelPrincipal.add(finalAyuda2);

                        ImageIcon memetodo = new ImageIcon("src/imagen/Bien.jpg");
                        Icon icono = new ImageIcon(memetodo.getImage().getScaledInstance(finalAyuda.getWidth(), finalAyuda.getHeight(), Image.SCALE_DEFAULT));
                        finalAyuda.setIcon(icono);

                        panelPrincipal.revalidate();
                        panelPrincipal.repaint();
                        this.repaint();

                    } else {

                        panelPrincipal.removeAll();

                        finalAyuda = new JLabel();
                        finalAyuda.setBounds(500, 25, 400, 500);
                        panelPrincipal.add(finalAyuda);

                        finalAyuda2 = new JLabel("LO TIENES, PERO NO SABES ESCRIBIR EL NUMERO 4");
                        finalAyuda2.setFont(new Font("Serif", Font.ITALIC, 40));
                        Color colorRGB3 = new Color(240, 192, 255);
                        finalAyuda2.setForeground(colorRGB3);
                        finalAyuda2.setBounds(150, 550, 1100, 80);
                        panelPrincipal.add(finalAyuda2);

                        ImageIcon memetodo = new ImageIcon("src/imagen/Sigue.jpg");
                        Icon icono = new ImageIcon(memetodo.getImage().getScaledInstance(finalAyuda.getWidth(), finalAyuda.getHeight(), Image.SCALE_DEFAULT));
                        finalAyuda.setIcon(icono);

                        panelPrincipal.revalidate();
                        panelPrincipal.repaint();
                        this.repaint();
                    }

                } else {
                    panelPrincipal.removeAll();

                    finalAyuda = new JLabel();
                    finalAyuda.setBounds(500, 25, 400, 500);
                    panelPrincipal.add(finalAyuda);

                    finalAyuda2 = new JLabel("TRAMPA DETECTADA: AUN NO PUEDES SABER LA RESPUESTA, SOLO ESTAS PROBANDO AL AZAR");
                    finalAyuda2.setFont(new Font("Serif", Font.ITALIC, 20));
                    Color colorRGB3 = new Color(240, 192, 255);
                    finalAyuda2.setForeground(colorRGB3);
                    finalAyuda2.setBounds(250, 550, 900, 80);
                    panelPrincipal.add(finalAyuda2);

                    ImageIcon memetodo = new ImageIcon("src/imagen/OntaBebe.jpeg");
                    Icon icono = new ImageIcon(memetodo.getImage().getScaledInstance(finalAyuda.getWidth(), finalAyuda.getHeight(), Image.SCALE_DEFAULT));
                    finalAyuda.setIcon(icono);

                    panelPrincipal.revalidate();
                    panelPrincipal.repaint();
                    this.repaint();
                }
            }

        }
    }
}
