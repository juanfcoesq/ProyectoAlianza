/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java 
 * Programación Orientada a Objetos
 */

package clases;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Ana Sofía Rodríguez Castillo, 178815@upslp.edu.mx
 * @author Ana Sofía Rodriguez Castillo
 * @author 178815@upslp.edu.mx
 * @version 1.0
 */
public class Reportess{
    
    private final Connection con;
    
    private final ArrayList<Object> MES = new ArrayList();
    private String mes[];
    
    private final ArrayList<Object> SEM = new ArrayList();
    private String sem[];
    
    private String estado;
    private int opcion;

    public Reportess(Connection con, int opcion) {
        this.con = con;
        this.opcion = opcion;
    }
    
    public Reportess(Connection con) {
        this.con = con;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public void obtenerMes(){
        try{
            MES.clear();
            int cont = 0;
            Statement sts = con.createStatement();
            sts.execute("SELECT YEAR(STR_TO_DATE(fecha, '%Y-%m-%d')) AS año, MONTH(STR_TO_DATE(fecha, '%Y-%m-%d')) AS mes FROM prestamo GROUP BY YEAR(STR_TO_DATE(fecha, '%Y-%m-%d')), MONTH(STR_TO_DATE(fecha, '%Y-%m-%d')) ORDER BY año, mes;");
            ResultSet rs = sts.getResultSet();
            while(rs.next()){
                String formato = rs.getString("año") + "-" + rs.getString("mes");
                MES.add(formato);
                cont++;
            }
            mes = new String[cont];
            for(int i = 0; i<cont;i++ ){
                mes[i]=MES.get(i).toString();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
    }
    
    public void obtenerSem(){
        try{
            SEM.clear();
            int cont = 0;
            Statement sts = con.createStatement();
            sts.execute("SELECT YEAR(STR_TO_DATE(fecha, '%Y-%m-%d')) AS año, MONTH(STR_TO_DATE(fecha, '%Y-%m-%d')) AS mes, WEEK(STR_TO_DATE(fecha, '%Y-%m-%d')) AS semana FROM prestamo GROUP BY YEAR(STR_TO_DATE(fecha, '%Y-%m-%d')), MONTH(STR_TO_DATE(fecha, '%Y-%m-%d')), WEEK(STR_TO_DATE(fecha, '%Y-%m-%d')) ORDER BY año, mes, semana;");
            ResultSet rs = sts.getResultSet();
            while(rs.next()){
                String formato = rs.getString("año") + "-" + rs.getString("mes") + "-" + rs.getString("semana");
                SEM.add(formato);
                cont++;
            }
            sem = new String[cont];
            for(int i = 0; i<cont;i++ ){
                sem[i]=SEM.get(i).toString();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
    }

    public String[] getSem() {
        return sem;
    }

    public void setSem(String[] sem) {
        this.sem = sem;
    }
    
    public void xlsMensual(int year, int mes) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream reporte = new PrintStream("src/Reportes/ReporteMensual_"+year+"_"+mes+".csv", "UTF-8");
        try {
            Statement sts = con.createStatement();
            String query = "SELECT p.nom_pers AS maestro, m.nom_mat AS material, pr.cant_pres AS cantidad, pr.fecha " +
                           "FROM prestamo pr " +
                           "JOIN personal p ON pr.id_pers = p.id_pers " +
                           "JOIN material m ON pr.id_mat = m.id_mat " +
                           "WHERE YEAR(STR_TO_DATE(pr.fecha, '%Y-%m-%d')) = " + year + 
                           " AND MONTH(STR_TO_DATE(pr.fecha, '%Y-%m-%d')) = " + mes + 
                           " ORDER BY pr.fecha;";
            sts.execute(query);
            ResultSet rs = sts.getResultSet();
            reporte.println("MAESTRO,MATERIAL,CANTIDAD PRESTADA,FECHA");
            while (rs.next()) {
                reporte.println(rs.getString("maestro") + 
                                "," + rs.getString("material") + 
                                "," + rs.getInt("cantidad") + 
                                "," + rs.getString("fecha"));
            }
            JOptionPane.showMessageDialog(null, "Reporte generado");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            reporte.close();
        }
    }
    
    public void xlsSemanal(int year, int month, int week) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream reporte = new PrintStream("src/Reportes/ReporteSemana_"+year+"_"+month+"_"+week+".csv", "UTF-8");
        try {
            Statement sts = con.createStatement();
            String query = "SELECT p.nom_pers AS maestro, m.nom_mat AS material, pr.cant_pres AS cantidad, pr.fecha " +
                           "FROM prestamo pr " +
                           "JOIN personal p ON pr.id_pers = p.id_pers " +
                           "JOIN material m ON pr.id_mat = m.id_mat " +
                           "WHERE YEAR(STR_TO_DATE(pr.fecha, '%Y-%m-%d')) = " + year + 
                           " AND MONTH(STR_TO_DATE(pr.fecha, '%Y-%m-%d')) = " + month + 
                           " AND WEEK(STR_TO_DATE(pr.fecha, '%Y-%m-%d')) = " + week + 
                           " ORDER BY pr.fecha;";
            sts.execute(query);
            ResultSet rs = sts.getResultSet();
            reporte.println("MAESTRO,MATERIAL,CANTIDAD PRESTADA,FECHA");
            while (rs.next()) {
                reporte.println(rs.getString("maestro") + 
                                "," + rs.getString("material") + 
                                "," + rs.getInt("cantidad") + 
                                "," + rs.getString("fecha"));
            }
            JOptionPane.showMessageDialog(null, "Reporte generado");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            reporte.close();
        }
    }


}
