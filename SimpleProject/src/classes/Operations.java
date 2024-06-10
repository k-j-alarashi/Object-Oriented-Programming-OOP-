package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operations {

    private Connection con = DB.getConnection();
    private String sql;
    private PreparedStatement ps;
    private Student s;
    private ResultSet rs;

    public void insert(Student s) {
        try {
            this.s = s;
            sql = "insert into students (name,age,major) values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getMajor());
            ps.execute();
            JOptionPane.showMessageDialog(null, "تم الحفظ");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<Student> display() {
        try {
            ArrayList<Student> a = new ArrayList<>();
            sql = "select * from students";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String major = rs.getString("major");
                s = new Student(name, id, major, age);
                a.add(s);
            }
            return a;
        } catch (Exception e) {
            return null;
        }
    }

    public void edit(Student s, int id) {
        try {
            this.s = s;
            sql = "update students set name = ? , age = ? , major = ? where id = " + id;
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getMajor());
            ps.execute();
            JOptionPane.showMessageDialog(null, "تم التعديل");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void delete(int id) {
        try {
            sql = "delete from students where id = " + id;
            ps = con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "تم الحذف");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getLastId() {
        try {
            sql = "select `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'school' AND TABLE_NAME = 'students'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt(1);
            return id;
        } catch (Exception e) {
            return 0;
        }
    }

    public ArrayList<Student> search(int sid) {
        try {
            ArrayList<Student> a = new ArrayList<>();
            sql = "select * from students where id = " + sid;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String major = rs.getString("major");
            s = new Student(name, id, major, age);
            a.add(s);
            return a;
        } catch (SQLException e) {
            return null;
        }
    }
}
