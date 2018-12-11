/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;
import cl.model.pojos.Consulta;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import java.util.List;

/**
 *
 * @author PC-TEC
 */
public class ConsultasDAO {
    
    
    public void IngresarConsulta(Consulta c){
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    try{
    sessionFactory =HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    trandaction=session.beginTransaction();
    session.save(c);
    trandaction.commit();
    session.close();
    
    }catch(Exception e){
        trandaction.rollback();
        throw new RuntimeException("Registro No Guardado!!!");
    
    }
    
    
    
    }
    
      public String ConsultasPorPaciente(int dui_paciente){
           
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    
    sessionFactory=HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    Consulta c =(Consulta)session.get(Consulta.class, dui_paciente);
    if(c!=null)
    {
      return "f";
    }else{
    
    return "f";
    }
      
      
      
      }
    
}
