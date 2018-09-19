import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.Reader;
import java.util.List;

public class App {


    public static void main(String[] args) throws Exception{

        Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);


        //-----------------------------------------------------------------
        //insert to table
        /* Student s = new Student();
        s.setFname("Suresh");
        s.setSname("Rana");
        s.setAddress("Kaluthara, Nirvana");
        s.setGrade(9);

        smc.insert("Student.insert",s);

        System.out.println("Inserted....");*/




        //-----------------------------------------------------------------
        //update table
        /*Student stu = new Student();
        stu.setId(1);
        stu.setSname("Thilanka");

        smc.update("Student.update",stu);
        System.out.println("A Record has been updated");*/




        //-----------------------------------------------------------------
        //delete from table
        /*int id=4;

        smc.delete("Student.delete", id);
        System.out.println("You have deleted one record");*/


        //-----------------------------------------------------------------
        //select data table
        /*List<Student> list = (List<Student>) smc.queryForList("Student.getAll", null);
        //Student e = null;

        for(Student ss : list){
            System.out.println("Student id "+ss.getId());
            System.out.println("Student Name "+ss.getFname()+" "+ss.getSname());
            System.out.println("Student Address "+ss.getAddress());
            System.out.println("Student Grade "+ss.getGrade());
            System.out.println("--------------------------");


        }
*/


        Student stu = new Student();
        stu.setId(1);

        List<Student> list = (List<Student>) smc.queryForList("Student.dynamicSelect", stu);

        for(Student ss : list){
            //System.out.println("fazgsag");
            System.out.println(ss.getFname()+" "+ss.getSname());
        }





    }

}
